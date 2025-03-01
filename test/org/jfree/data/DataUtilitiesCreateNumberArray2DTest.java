package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DataUtilitiesCreateNumberArray2DTest {
    
    @Test
    void testCreateNumberArray2D_ValidInput() {
        double[][] input = {{1.1, 2.2}, {3.3, 4.4}};
        Number[][] result = DataUtilities.createNumberArray2D(input);
        assertEquals(2, result.length);
        assertEquals(1.1, result[0][0].doubleValue(), 0.0001);
        assertEquals(2.2, result[0][1].doubleValue(), 0.0001);
        assertEquals(3.3, result[1][0].doubleValue(), 0.0001);
        assertEquals(4.4, result[1][1].doubleValue(), 0.0001);
    }

    @Test
    void testCreateNumberArray2D_EmptyArray() {
        double[][] input = {};
        Number[][] result = DataUtilities.createNumberArray2D(input);
        assertEquals(0, result.length, "Empty 2D array should return empty result.");
    }

    @Test
    void testCreateNumberArray2D_NullInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            DataUtilities.createNumberArray2D(null);
        }, "Null input should throw IllegalArgumentException");
    }

    @Test
    void testCreateNumberArray2D_SingleRow() {
        double[][] input = {{5.5, 6.6, 7.7}};
        Number[][] result = DataUtilities.createNumberArray2D(input);
        assertEquals(1, result.length, "Single-row array should have one row.");
        assertEquals(5.5, result[0][0].doubleValue(), 0.0001);
        assertEquals(6.6, result[0][1].doubleValue(), 0.0001);
        assertEquals(7.7, result[0][2].doubleValue(), 0.0001);
    }

    @Test
    void testCreateNumberArray2D_SingleColumn() {
        double[][] input = {{8.8}, {9.9}, {10.10}};
        Number[][] result = DataUtilities.createNumberArray2D(input);
        assertEquals(3, result.length, "Single-column array should have three rows.");
        assertEquals(8.8, result[0][0].doubleValue(), 0.0001);
        assertEquals(9.9, result[1][0].doubleValue(), 0.0001);
        assertEquals(10.10, result[2][0].doubleValue(), 0.0001);
    }
}
