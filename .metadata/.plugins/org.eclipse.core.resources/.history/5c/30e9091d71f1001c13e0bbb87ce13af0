package com.cogent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cogent.model.Address;
import com.cogent.model.Employee;
import com.cogent.service.EmployeeService;
@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	public void addEmployee() {
		Employee employee = new Employee("taku", "ta@gmail", 900);
		Address address = new Address(1234,9830 , "Murehwa", "South Africa");
		employee.setAddress(address);
		
		employeeService.addEmployee(employee);
		
		
	}

}
