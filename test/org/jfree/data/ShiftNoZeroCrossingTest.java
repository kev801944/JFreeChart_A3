package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidParameterException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShiftNoZeroCrossingTest {
	Range testRange;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		testRange = new Range(-1.0, 1.0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testForInvalidParameterException() {
//		assertThrows(InvalidParameterException.class, () -> Range.shift(null, 0.5));
	}
	
	@Test
	void testForNegativeDeltaValues() {
		Range actual = Range.shift(testRange, -5);
		Range expected = new Range(-6.0,-4.0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testForPositiveDeltaValues() {
		Range actual = Range.shift(testRange, 5);
		Range expected = new Range(4,6);
//		assertEquals(expected, actual);
	}

}
