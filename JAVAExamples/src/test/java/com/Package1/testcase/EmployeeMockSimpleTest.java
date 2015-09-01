package com.Package1.testcase;

import org.junit.Test;

import junit.framework.Assert;

import com.Package1.logic.EmployeeController;
import com.Package1.logic.EmployeeService;

public class EmployeeMockSimpleTest {
	@Test
	public void shouldGetCountOfEmployees()
	{
	    EmployeeController employeeController =new EmployeeController(new EmployeeService());
	    Assert.assertEquals(10,employeeController.getProjectedEmployeeCount());
	}

}
