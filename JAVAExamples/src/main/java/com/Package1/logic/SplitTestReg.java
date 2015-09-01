package com.Package1.logic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Pattern;
public class SplitTestReg {
	static Logger logger = LoggerFactory.getLogger(SplitString.class);
	private static String REGEX = ":";

	  private static String INPUT = "one:two:three:four:five";

	  public static void main(String[] argv) {
	    Pattern p = Pattern.compile(REGEX);
	    String[] items = p.split(INPUT);
	    for (int i = 0; i < items.length; i++) {
	    	logger.info(items[i]);
	    }
	  }

}
