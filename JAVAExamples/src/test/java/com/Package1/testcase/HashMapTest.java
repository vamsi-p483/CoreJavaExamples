package com.Package1.testcase;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.Package1.logic.HashMapExample;

public class HashMapTest {

	public void Test() {

		/* This is how to declare HashMap */
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		/* Adding elements to HashMap */
		hmap.put(12, "Chaitanya");
		hmap.put(2, "Rahul");
		hmap.put(7, "Singh");
		hmap.put(49, "Ajeet");
		hmap.put(3, "Anuj");

	}
}
