package com.Package1.testcase;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.apache.log4j.Logger;
import com.Package1.logic.Calculation;
import com.Package1.logic.StringEmpty;

public class TestCase2 {
	final static Logger logger = Logger.getLogger(StringEmpty.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		logger.info("before class");
	}

	@Before
	public void setUp() throws Exception {
		logger.info("before");
	}

	@Test
	public void testFindMax() {
		logger.info("test case find max");
		assertEquals(4, Calculation.findMax(new int[] { 1, 3, 4, 2 }));
		assertEquals(0, Calculation.findMax(new int[] { -12, -3, -4, -2 }));
	}

	@Test
	public void testCube() {
		logger.info("test case cube");
		assertEquals(27, Calculation.cube(3));
	}

	@After
	public void tearDown() throws Exception {
		logger.info("after");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		logger.info("after class");
	}

}
