package com.Package1.testcase;

import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

import com.Package1.logic.Employee;

public class MyArrayObjectEqualsTest {

	Object[] expectedEmps = new Object[3];

	@Before
	public void initInputs() {

		expectedEmps[0] = new Employee(1, "Nats", 15000);

		expectedEmps[1] = new Employee(2, "Kalid", 25000);

		expectedEmps[2] = new Employee(3, "Krish", 5000);

	}

	@Test
	public void compareEmployees() {

		/**
		 * 
		 * convert List of objects to array of objects
		 */

		Object[] testOutput = Employee.getEmpList().toArray();

		assertArrayEquals(expectedEmps, testOutput);

	}

}
