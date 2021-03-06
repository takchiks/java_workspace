package com.cogent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.EmployeeRepo;
import com.cogent.model.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmployeeRepo employeeRepo;
	
	@GetMapping
	(produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<List<Employee>> getAll(){
		return new ResponseEntity<List<Employee>>(employeeRepo.findByName("taku"),HttpStatus.OK);
	}
	
	@PostMapping
	(produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity add(@RequestBody Employee emp) {
		employeeRepo.save(emp);
		
		return new ResponseEntity(HttpStatus.OK);
		
	}	
}
