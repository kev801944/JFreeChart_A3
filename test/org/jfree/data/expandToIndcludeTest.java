package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class expandToIndcludeTest {

	Range exampleRange;
	@BeforeEach
	void setUp() throws Exception {
			exampleRange = new Range(2, 6);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	 @Test
	    void testExpandToIncludeInsideRange() {
	        Range result = Range.expandToInclude(exampleRange, 4);
	        
	        Range expectedRange = new Range(2,6);
	        
	        Range actualRange = new Range(result.getLowerBound(), result.getUpperBound());
	        
	        assertEquals(expectedRange, actualRange);
	    }

	    @Test
	    void testExpandToIncludeBelowRange() {
	    	
	    	Range result = Range.expandToInclude(exampleRange, 1);
	    	  
	        Range expectedRange = new Range(1,6);
	        
	        Range actualRange = new Range(result.getLowerBound(), result.getUpperBound());
	        
	        assertEquals(expectedRange, actualRange);
	    }

	    @Test
	    void testExpandToIncludeAboveRange() {
	    	
	    	Range result = Range.expandToInclude(exampleRange, 8);
	        
	    	  
	        Range expectedRange = new Range(2,8);
	        
	        Range actualRange = new Range(result.getLowerBound(), result.getUpperBound());
	        
	        assertEquals(expectedRange, actualRange);
	    	
	    }

	    @Test
	    void testExpandToIncludeNullRange() {
	    	
	    	Range result = Range.expandToInclude(null, 5);
	        
	        Range expectedRange = new Range(5,5);
	        
	        Range actualRange = new Range(result.getLowerBound(), result.getUpperBound());
	        
	        assertEquals(expectedRange, actualRange);
	    	
	    }

}
