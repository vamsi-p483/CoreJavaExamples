package com.Package1.logic;

public class EmployeeController {
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public int getProjectedEmployeeCount() {
		final int actualEmployeeCount = employeeService.getEmployeeCount();
		return actualEmployeeCount * 2;
	}

	public void saveEmployee(EmployeeMock employee) {
		employeeService.saveEmployee(employee);
	}

}
