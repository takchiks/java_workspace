package com.cogent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.exception.ResourceNotFoundException;
import com.cogent.model.Company;
import com.cogent.repo.EmployeeRepo;

@RestController
@RequestMapping(path = "/company")
public class CompanyController {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<List<Company>> getAllCompany(){
		
		return new ResponseEntity<List<Company>>(employeeRepo.findAll(),HttpStatus.OK);
	}
	
	@PostMapping(produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity addCompany(@RequestBody Company company) {
		employeeRepo.save(company);
		return new ResponseEntity(HttpStatus.OK);
		
	}
	
	@GetMapping	(path = "product/{product}", produces = "application/xml")
	public ResponseEntity<List<Company>> getByProduct(@PathVariable(name = "product")  String product){
		return new ResponseEntity<List<Company>> (employeeRepo.findByCompanyProduct(product),HttpStatus.OK);
	}
	
	@GetMapping	(path = "one/{id}", produces = "application/xml")
	public ResponseEntity<Company> getById(@PathVariable(name = "id")  Integer id) throws ResourceNotFoundException{
		return new ResponseEntity<Company> (employeeRepo.findById(id).orElseThrow(()->new ResourceNotFoundException()),HttpStatus.OK);
	}
	
	
	

}
