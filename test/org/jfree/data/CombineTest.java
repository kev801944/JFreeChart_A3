package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CombineTest {
	private Range testRange1;
	private Range testRange2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		testRange1 = new Range(-1, 1);
		testRange2 = new Range(0, 2);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testReturnProperRange() {
		Range expected = new Range(-1, 2);
		Range actual = Range.combine(testRange1, testRange2);

		assertEquals(expected, actual);
	}
	
	@Test
	void testReturningNullIfBothRangesAreNull() {
		assertNull(Range.combine(null, null));
	}
	
	@Test
	void testReturnFirstAgurmentRangeIfSecondRangeIsNull() {
		
		Range actual = Range.combine(testRange1, null);
		Range expected = new Range(-1,1);
		
		assertEquals(expected, actual);
	}

	@Test
	void testReturnSecondAgurmentRangeIfFirstRangeIsNull() {
		
		Range actual = Range.combine(null, testRange2);
		Range expected = new Range(0,2);
		
		assertEquals(expected, actual);
	}
	
}







































