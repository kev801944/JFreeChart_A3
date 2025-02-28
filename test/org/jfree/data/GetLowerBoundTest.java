package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetLowerBoundTest {
	Range exampleRange;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testReturnNegativeLowerBound() {
		exampleRange = new Range(-1.0,1.0);

		double expected = -1.0;
		double actual = exampleRange.getLowerBound();
		assertEquals(expected, actual);
	}
	
	@Test
	void testReturnPositiveLowerBound() {
		exampleRange = new Range(1.0, 5.0);

		double expected = 1.0;
		double actual = exampleRange.getLowerBound();
		assertEquals(expected, actual);
	}

}
