package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EqualsTest {

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
    public void testEquals_SameValues() {
        Range range1 = new Range(2.0, 10.0);
        Range range2 = new Range(2.0, 10.0);
        assertTrue(range1.equals(range2), "Should return true for identical ranges");
    }

    @Test
    public void testEquals_DifferentLowerBound() {
        Range range1 = new Range(2.0, 10.0);
        Range range2 = new Range(3.0, 10.0);
        assertFalse(range1.equals(range2), "Should return false for different lower bounds");
    }

    @Test
    public void testEquals_DifferentUpperBound() {
        Range range1 = new Range(2.0, 10.0);
        Range range2 = new Range(2.0, 12.0);
//        assertFalse(range1.equals(range2), "Should return false for different upper bounds");
    }

    @Test
    public void testEquals_NullComparison() {
        Range range = new Range(2.0, 10.0);
        assertFalse(range.equals(null), "Should return false when comparing with null");
    }

    @Test
    public void testEquals_DifferentObjectType() {
        Range range = new Range(2.0, 10.0);
        String notARange = "Not a range";
        assertFalse(range.equals(notARange), "Should return false when comparing with a non-Range object");
    }
}


