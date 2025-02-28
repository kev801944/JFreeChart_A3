package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LengthTest {

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
    public void testGetLength_PositiveRange() {
        Range range = new Range(2.0, 10.0);
        assertEquals(8.0, range.getLength(), 0.0001, "Length should be 8.0");
    }

    @Test
    public void testGetLength_NegativeRange() {
        Range range = new Range(-5.0, 5.0);
        assertEquals(10.0, range.getLength(), 0.0001, "Length should be 10.0");
    }

    @Test
    public void testGetLength_ZeroRange() {
        Range range = new Range(3.0, 3.0);
        assertEquals(0.0, range.getLength(), 0.0001, "Length should be 0.0 for a zero-length range");
    }

}
