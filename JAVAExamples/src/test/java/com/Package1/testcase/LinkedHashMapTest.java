package com.Package1.testcase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.util.Map;

import com.Package1.logic.LinkedHashMapEx;
import com.Package1.logic.MiniHashMap;

import org.junit.Test;

public class LinkedHashMapTest {
	@Test
	public void testUsingMap() {
		Map<Long, String> map = new LinkedHashMap<Long, String>();
		assertTrue(LinkedHashMap.class.isAssignableFrom(map.getClass()));
		assertTrue(map instanceof LinkedHashMap);
		
	}

	@Test
	public void testUsingLinkedHashMap() {
		Map<Long, String> map = new LinkedHashMap<Long, String>();
		LinkedHashMap<Long, String> lhm = (LinkedHashMap) map;
		assertTrue(LinkedHashMap.class.isAssignableFrom(lhm.getClass()));
		assertTrue(lhm instanceof LinkedHashMap);
	}

}
