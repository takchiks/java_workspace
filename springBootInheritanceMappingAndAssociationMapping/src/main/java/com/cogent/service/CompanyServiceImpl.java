package com.cogent.service;

import org.springframework.stereotype.Service;

import com.cogent.model.Company;
import com.cogent.model.Employee;
import com.cogent.repo.EmployeeRepository;
@Service
public class CompanyServiceImpl implements CompanyService {

	private EmployeeRepository employeeRepository;
	
	
	
	public CompanyServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	@Override
	public void addCompany(Company company) {
		// TODO Auto-generated method stub
		employeeRepository.save(company);
	}
	

}
