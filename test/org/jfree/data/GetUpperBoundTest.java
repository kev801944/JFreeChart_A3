package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetUpperBoundTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void GetUpperBoundPositiveRange() {
		
		Range positiveRange = new Range(2,6);
		double actual = positiveRange.getUpperBound();
		double expected = 6.0;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void GetUpperBoundNegativeRange(){
		Range negativeRange = new Range(-10,-3);
		double actual = negativeRange.getUpperBound();
		double expected = -3;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void GetUpperBoundMixedRange() {
		Range mixedRange = new Range(-7,4);
		
		double actual = mixedRange.getUpperBound();
		double expected = 4;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void GetUpperBoundSingleValue() {
		Range SingleRange = new Range(4,4);
		
		double actual = SingleRange.getUpperBound();
		double expected = 4;
		
		assertEquals(expected, actual);
	}

}
