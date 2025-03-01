package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.KeyedValues;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataUtilitiesGetCumulativePercentagesTest {
    private DefaultKeyedValues data;

    @BeforeEach
    void setUp() {
        data = new DefaultKeyedValues();
        data.addValue("A", 5);
        data.addValue("B", 9);
        data.addValue("C", 2);
    }

    @Test
    void testGetCumulativePercentages_ValidInput() {
        KeyedValues result = DataUtilities.getCumulativePercentages(data);
        assertEquals(0.3125, result.getValue("A").doubleValue(), 0.0001);
        assertEquals(0.875, result.getValue("B").doubleValue(), 0.0001);
        assertEquals(1.0, result.getValue("C").doubleValue(), 0.0001);
    }

    @Test
    void testGetCumulativePercentages_EmptyInput() {
        DefaultKeyedValues emptyData = new DefaultKeyedValues();
        KeyedValues result = DataUtilities.getCumulativePercentages(emptyData);
        assertEquals(0, result.getItemCount(), "Empty data should return an empty result.");
    }

    @Test
    void testGetCumulativePercentages_NullInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            DataUtilities.getCumulativePercentages(null);
        }, "Null input should throw IllegalArgumentException");
    }
}
