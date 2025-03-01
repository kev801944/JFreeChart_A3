package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class toStringTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testToStringPositiveRange() {
		Range positiveRange = new Range(1,7);
		
		String actual = positiveRange.toString();
		
		String expected =  "Range[1.0,7.0]";
		
		assertEquals(expected, actual);
	}

	@Test
	void testToStringnNegativeRange() {
		Range negativeRange = new Range(-7,-1);
		
		String actual = negativeRange.toString();
		
		String expected =  "Range[-7.0,-1.0]";
		
		assertEquals(expected, actual);
	}
	@Test
	void testToStringMixedRange() {
		Range mixedRange = new Range(-3.0,7.0);
		
		String actual = mixedRange.toString();
		
		String expected =  "Range[-3.0,7.0]";
		
		assertEquals(expected, actual);
	}

	
}
