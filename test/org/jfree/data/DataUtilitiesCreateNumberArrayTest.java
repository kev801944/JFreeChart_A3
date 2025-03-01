package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DataUtilitiesCreateNumberArrayTest {
    
    @Test
    void testCreateNumberArray_ValidInput() {
        double[] input = {1.1, 2.2, 3.3};
        Number[] result = DataUtilities.createNumberArray(input);
        assertEquals(3, result.length);
        assertEquals(1.1, result[0].doubleValue(), 0.0001);
        assertEquals(2.2, result[1].doubleValue(), 0.0001);
        assertEquals(3.3, result[2].doubleValue(), 0.0001);
    }

    @Test
    void testCreateNumberArray_EmptyArray() {
        double[] input = {};
        Number[] result = DataUtilities.createNumberArray(input);
        assertEquals(0, result.length, "Empty array should return empty result.");
    }

    @Test
    void testCreateNumberArray_NullInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            DataUtilities.createNumberArray(null);
        }, "Null input should throw IllegalArgumentException");
    }
    
    @Test
    void testCreateNumberArray_SingleElement() {
        double[] input = {5.5};
        Number[] result = DataUtilities.createNumberArray(input);
        assertEquals(1, result.length, "Single-element array should have one element.");
        assertEquals(5.5, result[0].doubleValue(), 0.0001);
    }
    
    @Test
    void testCreateNumberArray_NegativeValues() {
        double[] input = {-1.1, -2.2, -3.3};
        Number[] result = DataUtilities.createNumberArray(input);
        assertEquals(3, result.length);
        assertEquals(-1.1, result[0].doubleValue(), 0.0001);
        assertEquals(-2.2, result[1].doubleValue(), 0.0001);
        assertEquals(-3.3, result[2].doubleValue(), 0.0001);
    }
}
