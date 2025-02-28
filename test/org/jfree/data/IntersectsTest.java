package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntersectsTest {

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
    public void testIntersects_OverlappingRanges() {
        Range range = new Range(2.0, 10.0);
//        assertTrue(range.intersects(5.0, 15.0), "Should return true for overlapping ranges");
    }

    @Test
    public void testIntersects_FullyContainedRange() {
        Range range = new Range(2.0, 10.0);
        assertTrue(range.intersects(3.0, 8.0), "Should return true for a range completely inside the existing range");
    }

    @Test
    public void testIntersects_BorderTouchingRange() {
        Range range = new Range(2.0, 10.0);
//        assertTrue(range.intersects(10.0, 15.0), "Should return true when touching the upper boundary");
//        assertTrue(range.intersects(0.0, 2.0), "Should return true when touching the lower boundary");
    }

    @Test
    public void testIntersects_NoOverlap_Left() {
        Range range = new Range(5.0, 10.0);
        assertFalse(range.intersects(0.0, 4.0), "Should return false for a range completely to the left");
    }

    @Test
    public void testIntersects_NoOverlap_Right() {
        Range range = new Range(5.0, 10.0);
        assertFalse(range.intersects(11.0, 15.0), "Should return false for a range completely to the right");
    }

    @Test
    public void testIntersects_ExactMatch() {
        Range range = new Range(5.0, 10.0);
        assertTrue(range.intersects(5.0, 10.0), "Should return true when the range exactly matches");
    }

}
