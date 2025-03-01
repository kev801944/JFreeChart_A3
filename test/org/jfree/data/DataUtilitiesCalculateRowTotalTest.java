package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;
import org.jfree.data.DefaultKeyedValues2D;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataUtilitiesCalculateRowTotalTest {
    private DefaultKeyedValues2D testData;

    @BeforeEach
    void setUp() {
        testData = new DefaultKeyedValues2D();
        testData.addValue(2.0, "Row1", "Col1");
        testData.addValue(1.0, "Row1", "Col2");
        testData.addValue(3.5, "Row2", "Col1");
        testData.addValue(2.0, "Row2", "Col2");
    }

    @AfterEach
    void tearDown() {
        testData.clear();
    }

    @Test
    void testCalculateRowTotal_ValidInput() {
        double result = DataUtilities.calculateRowTotal(testData, 0);
        assertEquals(3.0, result, 0.0001, "Sum of row 0 should be 3.0");
    }

    @Test
    void testCalculateRowTotal_RowWithNullValues() {
        testData.addValue(null, "Row1", "Col1");
        double result = DataUtilities.calculateRowTotal(testData, 0);
        assertEquals(1.0, result, 0.0001, "Row sum should ignore nulls and return 1.0");
    }

    @Test
    void testCalculateRowTotal_EmptyTable() {
        testData.clear();
        double result = DataUtilities.calculateRowTotal(testData, 0);
        assertEquals(0.0, result, 0.0001, "Empty row should return 0.0");
    }

    @Test
    void testCalculateRowTotal_InvalidRowIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            DataUtilities.calculateRowTotal(testData, 5);
        }, "Accessing an out-of-bounds row should throw an exception.");
    }
    
    

}
