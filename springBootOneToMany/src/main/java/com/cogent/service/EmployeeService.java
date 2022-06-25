package com.cogent.service;

import com.cogent.model.Employee;
import com.cogent.model.Project;

public interface EmployeeService {
	public void addEmployee(Employee employee);
	public void addProject(Project project);
	public Project findProject(int Id);
	public Project findByName(String name);
	

}
