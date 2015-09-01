package com.Package1.testcase;
import org.junit.Test;
import static org.junit.Assert.*;
import com.Package1.logic.SimpleTest;
public class SimpleTestJUnitCase {
	 @Test
	    public void testConcatenate() {
		 SimpleTest myUnit = new SimpleTest();

	        String result = myUnit.concatenate("one", "two");

	        assertEquals("onetwo", result);

	    }
	 @Test
	    public void testGetTheStringArray() {
		 SimpleTest myUnit = new SimpleTest();

	        String[] expectedArray = {"one", "two", "three"};

	        String[] resultArray =  myUnit.getTheStringArray();

	        assertArrayEquals(expectedArray, resultArray);
	    }


}
