package com.cogent.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
//	private List<Employee> findByNameEmployees(String name);

}
