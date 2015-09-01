package com.Package1.logic;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SplitString {
	static Logger logger = LoggerFactory.getLogger(SplitString.class);

	public String utilsSplit() {
		// Split a String into an Array using # as seperator.
		String Str = new String("AB#CD#EF#GH");
		String[] splitArr = StringUtils.split(Str, "#");

		for (int i = 0; i < splitArr.length; i++) {
			logger.info(i + ") " + splitArr[i]);
		}
		return null;

	}

	public static void main(String[] args) {
		SplitString sup = new SplitString();
		logger.info(sup.utilsSplit());
	}

}
