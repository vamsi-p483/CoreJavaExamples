package com.Package1.logic;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class StringUtilsExample {
	static Logger logger = LoggerFactory.getLogger(StringUtilsExample.class);

	public static void main(String[] args) {
		String str = "love Java Programm", str2 = "jAva";

		logger.info("Using the StringUtils Class");

		// Using StringUtils.abbreviate()
		logger.info("Using StringUtils.abbreviate()");
		logger.info("str = " + str);
		String abstr = StringUtils.abbreviate(str, 14);
		logger.info(abstr);
		abstr = StringUtils.abbreviate(str, 7, 14);
		logger.info("After abbreviation abstr=" + abstr);

		// Using StringUtils.abbreviateMiddle()
		abstr = StringUtils.abbreviateMiddle(str, "...", 16);
		logger.info("After abbreviation abstr=" + abstr);

		// Using StringUtils.reverse()
		logger.info("Reverse str : " + StringUtils.reverse(str));
		// Using StringUtils.capitalize()
		logger.info("str2 = " + str2);
		str2 = StringUtils.capitalize(str2);
		logger.info("After capitalize : " + str2);

		// Using StringUtils.uncapitalize()
		logger.info("str2 = " + str2);
		str2 = StringUtils.uncapitalize(str2);
		logger.info("After uncapitalize : " + str2);

		// Using StringUtils.swapCase()
		logger.info("str2 = " + str2);
		str2 = StringUtils.swapCase(str2);
		logger.info("After swap case : " + str2);

		// Using StringUtils.lowerCase()
		logger.info("str2 = " + str2);
		str2 = StringUtils.lowerCase(str2);
		logger.info("After lower case : " + str2);

		// Using StringUtils.lowerCase()
		logger.info("str2 = " + str2);
		str2 = StringUtils.upperCase(str2);
		logger.info("After upper case : " + str2);

		// Using StringUtils.center()
		logger.info("str2 = " + str2);
		String cstr = StringUtils.center(str2, 10, '-');
		logger.info("After centerring : " + cstr);

		// Using StringUtils.chomp()
		str2 = str2 + "\n";
		logger.info("str2 =" + str2 + "With new Line");
		str2 = StringUtils.chomp(str2);
		logger.info("Now str2 = " + str2 + " After chomp");

		// Using StringUtils.contains()
		if (StringUtils.containsIgnoreCase(str, "JAVA"))
			logger.info(str + " is about Java");
		else
			logger.info(str + " is not about Java");

		// Using StringUtils.deleteWhiteSpace()
		logger.info("str = " + str);
		String newstr = StringUtils.deleteWhitespace(str);
		logger.info("newstr = " + newstr);

		// Using StringUtils.chop()
		logger.info("cstr =" + cstr);
		cstr = StringUtils.chop(cstr);
		logger.info(" After chop : " + cstr);

		// Using StringUtils.endsWithIgnoreCase()
		if (StringUtils.endsWithIgnoreCase(str, "ing"))
			logger.info(str + " ends with a \"ing\"");
		else
			logger.info(str + " does not ends with a \"ing\"");

		// Using StringUtils.endsWithIgnoreCase()
		if (StringUtils.startsWithIgnoreCase(str, "rivu"))
			logger.info(str + " starts with a \"rivu\"");
		else
			logger.info(str + " does not starts with \"Rivu\"");

		String x = "This is a String", x1 = "This is String 1", x2 = "This is String 2", x3 = "This is a String";
		logger.info("x = " + x);
		logger.info("x1 = " + x1);
		logger.info("x2 = " + x2);
		logger.info("x2 = " + x3);

		// using StringUtils.equals()
		if (StringUtils.equals(x1, x2))
			logger.info("x1 and x2 are equal");
		else
			logger.info("x1 and x2 are not equal");
		if (StringUtils.equalsIgnoreCase(x, x3))
			logger.info("x and x3 are equal");
		else
			logger.info("x and x3 are not equal");

		// using StringUtils.difference()
		String d1 = StringUtils.difference(x, x1);
		logger.info("Difference between x and x1 : " + d1);
		String d2 = StringUtils.difference(x1, x2);
		logger.info("Difference between x1 and x2 : " + d2);
		String d3 = StringUtils.difference(x1, x);
		logger.info("Difference between x1 and x : " + d3);

		// using StringUtils.getCommonPrefix()
		logger.info("Common Prefix in x,x1,x2,x3 is : "
				+ StringUtils.getCommonPrefix(x, x1, x2, x3));
		// using StringUtils.getLevenshteinDistance()
		int l1 = StringUtils.getLevenshteinDistance(x, x1);
		int l2 = StringUtils.getLevenshteinDistance(x1, x2);
		int l3 = StringUtils.getLevenshteinDistance(x2, x3);
		int l4 = StringUtils.getLevenshteinDistance(x, x3);
		int l5 = StringUtils.getLevenshteinDistance(x2, x3);
		logger.info("Levenshtein Distance between x and x1 : " + l1);
		logger.info("Levenshtein Distance between x1 and x2 : " + l2);
		logger.info("Levenshtein Distance between x2 and x3 : " + l3);
		logger.info("Levenshtein Distance between x and x3 : " + l4);
		System.out
				.println("Levenshtein Distance between x2 and x3 upto threshold 3 : "
						+ l5);

		// Using StringUtils.isAllLowerCase()
		logger.info("isAllLowerCase(str) = "
				+ StringUtils.isAllLowerCase(str));
		// Using StringUtils.isAllUpperCase()
		logger.info("isAllUpperCase(str) = "
				+ StringUtils.isAllUpperCase(str));
		// Using StringUtils.isAlpha()
		logger.info("isAlpha(str) = " + StringUtils.isAlpha(str));
		// Using StringUtils.isAlphanumeric()
		logger.info("isAlphanumeric(str) = "
				+ StringUtils.isAlphanumeric(str));
		// Using StringUtils.isAlphanumericSpace()
		logger.info("isAlphanumericSpace(str) = "
				+ StringUtils.isAlphanumericSpace(str));
		// Using StringUtils.isAlphaSpace()
		logger.info("isAlphaSpace(str) = "
				+ StringUtils.isAlphaSpace(str));
		// Using StringUtils.isAnyBlank()
		logger.info("isAnyBlank(str) = " + StringUtils.isNotBlank(str));
		// Using StringUtils.isAnyEmpty()
		logger.info("isAnyEmpty(str) = " + StringUtils.isEmpty(str));
		// Using StringUtils.isAsciiPrintable()
		logger.info("isAsciiPrintable(str) = "
				+ StringUtils.isAsciiPrintable(str));
		// Using StringUtils.isBlank()
		logger.info("isBlank(str) = " + StringUtils.isBlank(str));

		// Using StringUtils.rightPad()
		logger.info("Before Rightpad : " + cstr);
		String rp = StringUtils.rightPad(cstr, 15, 'x');
		logger.info("After Rightpad : " + rp);

		// Using StringUtils.replace()
		rp = StringUtils.replace(rp, "-", ".");
		logger.info("After replace " + rp);

		// Using StringUtils.repeat()
		rp = StringUtils.repeat(rp, ">", 5);
		logger.info("After repeat " + rp);

		// Using StringUtils.split()
		logger.info("Splitting str:-");
		String[] strs = StringUtils.split(str, " ");
		for (String s : strs) {
			logger.info(s);
		}

		// Using StringUtils.strip()
		String xx = "java to java";
		logger.info("before strip : " + xx);
		String s = StringUtils.strip(xx, "aj");
		logger.info("After strip : " + s);

	}

}
