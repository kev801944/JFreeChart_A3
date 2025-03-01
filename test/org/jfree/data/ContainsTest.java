package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void ContainsInsidePositiveRangetest() {
		Range positiveRange = new Range(3,10);
		
		boolean result = positiveRange.contains(5);
		
		assertTrue(result);
	}
	
	@Test
	void ContainsInsideNegativeRangeTest() {
		Range negaitiveRange = new Range(-6, -1);
		
		boolean result = negaitiveRange.contains(-3);
		
		assertTrue(result);
	}
	
	@Test
	void ContainsBelowRangeTest() {
		Range belowRange = new Range(2, 5);
		
		boolean result = belowRange.contains(1);
		
		assertFalse(result);
	}

	@Test
	void ContainsAboveRangeTest() {
		Range aboveRange = new Range(2, 5);
		
		boolean result = aboveRange.contains(7);
		
		assertFalse(result);
	}
	
	@Test
	void ContainsSingleValueTest() {
		Range SingleValueRange = new Range(5, 5);
		
		boolean result = SingleValueRange.contains(5);
		
		assertFalse(result);
	}	
	

}
