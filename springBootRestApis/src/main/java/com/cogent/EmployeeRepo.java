package com.cogent;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	public List<Employee> findByName(String name);

}
