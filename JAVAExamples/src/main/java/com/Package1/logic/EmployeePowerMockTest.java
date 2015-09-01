package com.Package1.logic;

import junit.framework.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import com.Package1.logic.EmployeeController;
import com.Package1.logic.EmployeeMock;
import com.Package1.logic.EmployeeService;

public class EmployeePowerMockTest {
	@Test
	public void firstMockTest() {
		// Creating a mock using the PowerMockito.mock
		// method for the EmployeeService class.
		EmployeeService mock = PowerMockito.mock(EmployeeService.class);

		// Next statement essentially says that when getProjectedEmployeeCount
		// method
		// is called on the mocked EmployeeService instance, return 8.
		PowerMockito.when(mock.getEmployeeCount()).thenReturn(8);
		EmployeeController employeeController = new EmployeeController(mock);
		Assert.assertEquals(16, employeeController.getProjectedEmployeeCount());
	}

	@Test
	public void verifyMethodInvokationTest() {
		EmployeeService mock = PowerMockito.mock(EmployeeService.class);
		EmployeeController employeeController = new EmployeeController(mock);

		EmployeeMock employee = new EmployeeMock();
		employeeController.saveEmployee(employee);

		// Verifying that controller did call the
		// saveEmployee() method on the mocked service instance.
		Mockito.verify(mock).saveEmployee(employee);
	}

}
