package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Shift {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void ShiftPositiveRangeTest() {
		Range positiveRange = new Range(2,6);
		
		Range actual = Range.shift(positiveRange, 3);
		
		Range expected = new Range(5,9);
		
		assertEquals(expected, actual);
	}
	@Test
	void ShiftNegativeRangeTest() {
		Range negativeRange = new Range(-9,-5);
		
		Range actual = Range.shift(negativeRange, 3);
		
		Range expected = new Range(-6,-2);
		
		assertEquals(expected, actual);
	}
	@Test
	void ShiftMixedRangeTest() {
		Range mixedRange = new Range(-2,6);
		
		Range actual = Range.shift(mixedRange, 3);
		
		Range expected = new Range(1,9);
		
		assertEquals(expected, actual);
	}
	@Test
	void ShiftSingleValueRangeTest() {
		Range SingleValueRange = new Range(6,6);
		
		Range actual = Range.shift(SingleValueRange, 3);
		
		Range expected = new Range(9,9);
		
		assertEquals(expected, actual);
	}


}
