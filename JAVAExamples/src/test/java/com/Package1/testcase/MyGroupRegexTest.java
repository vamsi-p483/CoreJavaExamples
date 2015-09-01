package com.Package1.testcase;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.Package1.logic.MyGroupRegex;

public class MyGroupRegexTest {
	private static Pattern ptn = Pattern
			.compile("(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})");

	public static List<String> captureValuesTest(String largeText) {

		Matcher mtch = ptn.matcher(largeText);
		List<String> ips = new ArrayList<String>();
		while (mtch.find()) {
			ips.add(mtch.group());
		}
		return ips;
	}

	@Test
	public void MyGroupRegexEquelTest() {
		ArrayList<String> obj = new ArrayList<String>();

		/* This is how elements should be added to the array list */
		obj.add("10.20.30.40");
		obj.add("23.12.56.34");
		obj.add("3.90.23.65");

		assertEquals(obj, MyGroupRegex.captureValues(MyGroupRegex.str));
	}

	@Test
	public void usingCapturingGroupTest() {
		String str = "Hi my machine IP is 10.20.30.40 and i would like "
				+ "to access port 80 from the host 23.12.56.34, which internally"
				+ "connects to 3.90.23.65. Please process the request";
		assertEquals(captureValuesTest(str),
				MyGroupRegex.captureValues(MyGroupRegex.str));

	}
}
