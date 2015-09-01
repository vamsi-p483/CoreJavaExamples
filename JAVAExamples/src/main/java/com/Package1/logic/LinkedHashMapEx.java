package com.Package1.logic;
import org.slf4j.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
	static Logger logger = LoggerFactory.getLogger(LinkedHashMapEx.class);
	public static void main(String[] args) {
		Map<Long, String> m = new LinkedHashMap<Long, String>();
		if (m instanceof LinkedHashMap) {
			logger.info("true");
			LinkedHashMap<Long, String> l = (LinkedHashMap) m;
			if (l instanceof LinkedHashMap)
				logger.info("true");
		}
	}

}
