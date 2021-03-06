package com.cogent.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cogent.model.Address;
import com.cogent.model.Employee;
import com.cogent.model.Project;
import com.cogent.service.EmployeeService;
@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	public void addEmployee() {
		List<Address> addrList = new ArrayList();
		List<Address> addrList2 = new ArrayList();
		List<Project> projects = new ArrayList();
		List<Project> projects2 = new ArrayList();
		Employee employee = new Employee("taku", "ta@gmail", 900);
		Employee employee2 = new Employee("peter", "p@gmail", 923);
		Address address = new Address(1234,9830 , "singapore", "China");
		Address address02 = new Address(1234,9830 , "singapore", "China");
		Address address1 = new Address(1234,9830 , "Murehwa", "South Africa");
		Address address2 = new Address(1234,9830 , "Murehwa", "South Africa");
		Address address12 = new Address(1234,9830 , "Murehwa", "South Africa");
		Address address22 = new Address(1234,9830 , "Murehwa", "South Africa");
		addrList.add(address);
		addrList.add(address1);
		addrList.add(address2);
		addrList2.add(address02);
		addrList2.add(address12);
		addrList2.add(address22);
		employee.setAddress(addrList);
		employee2.setAddress(addrList2);

		Project p1 = new Project("Country");
		Project p2 = new Project("King");
		Project p3 = new Project("X");
		Project p12 = new Project("Country2");
		Project p22 = new Project("King2");
		Project p32 = new Project("X2");
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);

//		p1.setEmployees(employees);
//		p1.setProjectId(3);
//		p2.setEmployees(employees);
//		p3.setEmployees(employees);
		projects.add(p1);
		projects2.add(p2);
		projects2.add(p32);
//		projects.add(p2);
		projects.add(p3);
//		employeeService.addProject(employeeService.findProject(1));
		
//		projects.add(employeeService.findProject(1));

		employee.setProjects(projects);
		employee2.setProjects(projects2);

		employeeService.addEmployee(employee);
//		projects2.add(employeeService.findByName(p1.getProjectName()));
		employeeService.addEmployee(employee2);
		
		
		
		
	}

}
