package com.Package1.logic;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyGroupRegex {
	final static Logger logger = Logger.getLogger(MyGroupRegex.class);
	private static Pattern ptn = Pattern
			.compile("(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})");
	public static String str = "Hi my machine IP is 10.20.30.40 and i would like "
			+ "to access port 80 from the host 23.12.56.34, which internally"
			+ "connects to 3.90.23.65. Please process the request";

	public static List<String> captureValues(String largeText) {
		Matcher mtch = ptn.matcher(largeText);
		List<String> ips = new ArrayList<String>();
		while (mtch.find()) {
			ips.add(mtch.group());
		}
		return ips;
	}

	public static void main(String a[]) {
		
		logger.info(captureValues(str));
	}
}
