package com.cogent.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cogent.model.Address;
import com.cogent.model.Bus;
import com.cogent.model.Car;
import com.cogent.model.Company;
import com.cogent.model.Employee;
import com.cogent.model.Vehicle;
import com.cogent.service.CompanyService;

@Controller
public class AllController {
	@Autowired
	private CompanyService companyService;
	public void addCompany() {
		Company company = new Company("Cogent Info");
		List<Vehicle> employeevList = new ArrayList();
		List<Vehicle> companyvList = new ArrayList();
		List<Employee> employees = new ArrayList<Employee>();

		Employee employee = new Employee("taku", "ta@gmail", 900);
		Address address = new Address(1234,9830 , "Murehwa", "South Africa");
		employee.setAddress(address);
		Vehicle v1 = new Car(9234, 2000, "Benz", "AMG", "petrol", true);
		Vehicle v2 = new Car(123, 2060, "Tesla", "ModelX", "electrical", true);
		Vehicle v3 = new Car(1235, 90000, "Fiat", "S series", "petrol", true);
		employeevList.add(v1);
		employeevList.add(v2);
		employeevList.add(v3);
		employee.setVehicles(employeevList);
		employees.add(employee);

		List<Vehicle> employeevList2 = new ArrayList();
		Employee employee2 = new Employee("taku", "ta@gmail", 900);
		Address address2 = new Address(15389,921 , "Brazil", "Brazil");
		employee.setAddress(address2);
		Vehicle v4 = new Car(11111, 2000, "Benz", "AMG", "petrol", true);
		Vehicle v5 = new Car(3333, 2060, "Ford", "Escape", "petrol", true);
		Vehicle v6 = new Car(2222, 90000, "Honda", "Fit", "petrol", true);
		employeevList2.add(v4);
		employeevList2.add(v5);
		employeevList2.add(v6);
		employee2.setVehicles(employeevList2);
		employees.add(employee2);
		
		Vehicle v7 = new Bus(99999, 9999,"Benz Bus", "AirBus","petrol", 90);


		companyvList.add(v1);
		companyvList.add(v2);
		companyvList.add(v4);
		companyvList.add(v5);
		companyvList.add(v7);
		
		company.setEmployees(employees);
		company.setAddress(address2);
		company.setVehicles(companyvList);
		
		companyService.addCompany(company);
		
		
	}

}
