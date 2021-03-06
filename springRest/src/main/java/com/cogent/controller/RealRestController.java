package com.cogent.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.websocket.server.PathParam;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.model.Employee;
import com.cogent.repo.EmployeeRepo;

@RestController

public class RealRestController {
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	@PostMapping("/hello")
	public String getHeaders(@RequestHeader Map<String,String> map, @RequestHeader("apikey") String apikey ) {
		String str="";
		for(Entry<String,String> entry:map.entrySet()){
			str += entry.getKey()+" : "+entry.getValue()+"\n";
		} 
		return str;
	}
	@GetMapping(path = "/postas/{uuid}", produces = "application/xml")
	public Employee create(@PathVariable("uuid") int uid) {
		return new Employee(uid,"hello");
	}
	@GetMapping(path="/response", produces = "application/xml")
	public ResponseEntity<Employee> getResp(){
		Employee employee = new Employee(9,"hello");
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	@PostMapping(path = "/emp", produces = "application/xml")
	public ResponseEntity<Employee> create(@RequestBody Employee emp){
		employeeRepo.save(emp);
		return new ResponseEntity<Employee> (emp,HttpStatus.OK);
	}

	@GetMapping(path = "/emp", produces = "application/xml")
	public ResponseEntity<List<Employee>> get(){
		List<Employee> employees = employeeRepo.findAll(); 
		return new ResponseEntity<List<Employee>> (employees,HttpStatus.OK);
	}

}
