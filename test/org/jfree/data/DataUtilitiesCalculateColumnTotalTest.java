package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;
import org.jfree.data.DefaultKeyedValues2D;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataUtilitiesCalculateColumnTotalTest {
    private DefaultKeyedValues2D testData;

    @BeforeEach
    void setUp() {
        testData = new DefaultKeyedValues2D();
        testData.addValue(2.0, "Row1", "Col1");
        testData.addValue(3.5, "Row2", "Col1");
        testData.addValue(4.5, "Row3", "Col1");
    }

    @AfterEach
    void tearDown() {
        testData.clear();
    }

    @Test
    void testCalculateColumnTotal_ValidInput() {
        double result = DataUtilities.calculateColumnTotal(testData, 0);
        assertEquals(10.0, result, 0.0001, "Sum of column 0 should be 10.0");
    }

    @Test
    void testCalculateColumnTotal_ColumnWithNullValues() {
        testData.addValue(null, "Row3", "Col1");
        double result = DataUtilities.calculateColumnTotal(testData, 0);
        assertEquals(5.5, result, 0.0001, "Column sum should ignore nulls and return 5.5");
    }

    @Test
    void testCalculateColumnTotal_EmptyTable() {
        testData.clear();
        double result = DataUtilities.calculateColumnTotal(testData, 0);
        assertEquals(0.0, result, 0.0001, "Empty column should return 0.0");
    }

    @Test
    void testCalculateColumnTotal_InvalidColumnIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            DataUtilities.calculateColumnTotal(testData, 5);
        }, "Accessing an out-of-bounds column should throw an exception.");
    }
}
