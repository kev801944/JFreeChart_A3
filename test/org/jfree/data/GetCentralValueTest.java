package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetCentralValueTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCentralValuePositiveRange() {
		Range positiveRange = new Range(2,6);
		
		double actual = positiveRange.getCentralValue();
		double expected = 4.0;
		
		assertEquals(expected, actual);
		
	}

	@Test
    void testCentralValueNegativeRange() {
		Range negativeRange = new Range(-5,-1);
		
		double actual = negativeRange.getCentralValue();
		double expected = -3.0;
		
		assertEquals(expected, actual);
		
	}
	
    @Test
    void testCentralValueMixedRange() {
		Range mixedRange = new Range(-5,3);
		
		double actual = mixedRange.getCentralValue();
		double expected = -1;
		
		assertEquals(expected, actual);
    }
}
