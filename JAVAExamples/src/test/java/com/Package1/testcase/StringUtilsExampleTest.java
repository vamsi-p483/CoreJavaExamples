package com.Package1.testcase;
import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.StringUtils;

public class StringUtilsExampleTest {
	
	
	String str = "love Java Programm", str2 = "jAva";
	@Test
	public void testPrintMessage() {
		assertEquals( "love Java P...",StringUtils.abbreviate(str, 14) );
		assertEquals( "mmargorP avaJ evol",StringUtils.reverse(str) );
		assertEquals( "JAva",StringUtils.capitalize(str2));
		assertEquals( "JaVA",StringUtils.swapCase(str2));
		//assertEquals( "---JAVA---",StringUtils.center(str2, 10, '-'));
	}

}
