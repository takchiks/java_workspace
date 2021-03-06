package com.cogent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.model.Employee;
import com.cogent.model.Project;
import com.cogent.repo.EmployeeRepository;
import com.cogent.repo.ProjectRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private ProjectRepository projectRepository;
//
//	public EmployeeServiceImpl(ProjectRepository projectRepository) {
//		super();
//		this.projectRepository = projectRepository;
//	}
//
//	
//	
//	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
//		super();
//		this.employeeRepository = employeeRepository;
//	}



	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}



	@Override
	public void addProject(Project project) {
		// TODO Auto-generated method stub
		projectRepository.save(project);
	}



	@Override
	public Project findProject(int Id) {
		// TODO Auto-generated method stub
		return projectRepository.findById(Id).get();
	}



	@Override
	public Project findByName(String name) {
		// TODO Auto-generated method stub
		return projectRepository.findByProjectName(name).get(0);
	}
	
	
	

}
