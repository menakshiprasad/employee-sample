package com.stone.manor.controller;

import com.stone.manor.data.Employee;

public class EmployeeController {

	public Employee getEmployee(String empId) {
		if ("manoj".equalsIgnoreCase(empId)) {
			Employee e = new Employee("Manoj", "Kumar", "5132, W Stone Manor, Rogers, AR", 4793723242l);
			return e;
		} else if ("menakshi".equalsIgnoreCase(empId)) {
			Employee e = new Employee("Menakshi", "Prasad", "5132, W Stone Manor, Rogers, AR", 3126870494l);
			return e;
		}

		return null;
	}

	public Long getEmployeePhone(String empId) {
		if ("manoj".equalsIgnoreCase(empId)) {
			return 4793723242l;
		} else if ("menakshi".equalsIgnoreCase(empId)) {
			return 3126870494l;
		} else {
			return 0000000000l;
		}
	}
	
}
