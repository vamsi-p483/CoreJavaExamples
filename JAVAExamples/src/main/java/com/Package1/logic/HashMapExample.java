package com.Package1.logic;

import org.slf4j.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {
	static Logger logger = LoggerFactory.getLogger(HashMapExample.class);

	public static void main(String args[]) {

		/* This is how to declare HashMap */
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		/* Adding elements to HashMap */
		hmap.put(12, "Chaitanya");
		hmap.put(2, "Rahul");
		hmap.put(7, "Singh");
		hmap.put(49, "Ajeet");
		hmap.put(3, "Anuj");

		/* Display content using Iterator */
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			logger.info("key is: " + mentry.getKey() + " & Value is: ");
			logger.info((String) mentry.getValue());
		}

		/* Get values based on key */
		String var = hmap.get(2);
		logger.info("Value at index 2 is: " + var);

		/* Remove values based on key */
		hmap.remove(3);
		logger.info("Map key and values after removal:");
		Set set2 = hmap.entrySet();
		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry mentry2 = (Map.Entry) iterator2.next();
			logger.info("Key is: " + mentry2.getKey() + " & Value is: ");
			logger.info((String) mentry2.getValue());
		}

	}

}
