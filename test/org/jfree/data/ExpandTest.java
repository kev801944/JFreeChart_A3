package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidParameterException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExpandTest {
	Range exampleRange;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		exampleRange = new Range(2,6);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testForPositiveLowerAndUpperMargin() {
		Range expected = new Range(1,8);
		Range actual = Range.expand(exampleRange, 0.25, 0.5);

		assertEquals(expected, actual);
	}
	
	
	@Test
	void testForNegativeValuesInLowerMargin() {		
		Range expected = new Range(3,8);
		Range actual = Range.expand(exampleRange, -0.25, 0.5);

		assertEquals(expected, actual);
	}
	
	@Test
	void testForNegativeValuesInUpperMargin() {		
		Range expected = new Range(1,4);
		Range actual = Range.expand(exampleRange, 0.25, -0.5);

		assertEquals(expected, actual);
	}
	
	@Test
	void testForInvalidParameterException() {
		assertThrows(IllegalArgumentException.class, () -> Range.expand(null, 0.25, 0.5));
	}
}




























