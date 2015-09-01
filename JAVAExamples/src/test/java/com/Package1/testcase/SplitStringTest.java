package com.Package1.testcase;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.apache.log4j.Logger;

import com.Package1.logic.MyGroupRegex;
import com.Package1.logic.SplitString;

public class SplitStringTest {
	final static Logger logger = Logger.getLogger(MyGroupRegex.class);

	public String stringSplit() {
		// Split a String into an Array using # as seperator.
		String Str = new String("AB#CD#EF#GH");
		String[] splitArr = Str.split("#");

		for (int i = 0; i < splitArr.length; i++) {
			logger.info(i + ") " + splitArr[i]);
		}
		return null;
	}
	@Test
	public void stringUtilTest() {
		SplitString ss=new SplitString();
		assertEquals(ss.utilsSplit(),stringSplit());
	}

	

}