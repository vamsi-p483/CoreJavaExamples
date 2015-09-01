package com.Package1.testcase;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.Package1.logic.MyFirstJunit;

public class MyFirstJunitTest {
	String message = "Hello World";
	MyFirstJunit mfjtest = new MyFirstJunit(message);

	@Test
	public void testPrintMessage() {
		assertEquals(message, mfjtest.printMessage());
	}

}
