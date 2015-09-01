/* Assert.assertEquals() methods checks that the two objects are equals or not */
package com.Package1.testcase;

import org.junit.Test;

import com.Package1.logic.EmployeeObjCompare;

import static org.junit.Assert.*;

public class mySimpleEqualsTest {

	@Test
	public void mySimpleEqualsTesting() {

		String expectedName = "Nattu";
		assertEquals(expectedName,
				EmployeeObjCompare.getEmpNameWithHighestSalary());
	}

	@Test
	public void myObjectEqualsTest() {

		EmployeeObjCompare expectedEmpObj = new EmployeeObjCompare(1, "Nattu",
				15000);
		assertEquals(expectedEmpObj,
				EmployeeObjCompare.getHighestPaidEmployee());
	}
}
