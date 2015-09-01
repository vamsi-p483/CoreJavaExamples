package com.Package1.testcase;

import static org.junit.Assert.*;
import org.junit.Test;
import com.Package1.logic.HashMapAssertNotNull;

public class HashMapAssertNotNullTest {
	/*
	 * Assert.assertNotNull() methods checks that the object is null or not If
	 * it is null then it throws an AssertionError.
	 */
	@Test
	public void notNullTest() {

		HashMapAssertNotNull msnt = new HashMapAssertNotNull();

		assertNotNull(msnt.getPropValue("key3"));

	}

	/*
	 * Assert.assertNull() methods checks that the object is null or not.If it
	 * is not null then it throws an AssertionError.
	 */
	@Test
	public void Nulltest() {

		HashMapAssertNotNull msnt = new HashMapAssertNotNull();

		assertNull(msnt.getPropValue("key7"));

	}

	/*
	 * Assert.assertNotSame() methods checks that two objects do not refer to
	 * the same object
	 */
	@Test
	public void isNotSameReferenceTest() {

		HashMapAssertNotNull msnt = new HashMapAssertNotNull();

		assertNotSame(msnt.getPropValue("key1"), msnt.getPropValue("key2"));

	}

	/*
	 * Assert.assertSame() methods checks that two objects refer to the same
	 * object.
	 */
	@Test
	public void isSameReferenceTest() {

		HashMapAssertNotNull msnt = new HashMapAssertNotNull();

		assertSame(msnt.getPropValue("key1"), msnt.getPropValue("key1"));

	}

}
