package com.cogent.service;

import org.springframework.stereotype.Service;

import com.cogent.model.Employee;
import com.cogent.repo.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}
	

}
