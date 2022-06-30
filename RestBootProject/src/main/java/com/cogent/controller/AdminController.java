package com.cogent.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.entity.BankAccount;
import com.cogent.entity.Customer;

@RestController
public class AdminController {


	@PostMapping("/api/admin/authenticate")
	public ResponseEntity<Customer> authenticateAdmin(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);
	}

	@PostMapping("/api/admin/staff")
	public ResponseEntity<Customer> createStaff(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);
	}

	@GetMapping("/api/admin/staff")
	public ResponseEntity<Customer> getAllStaff(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);
	}

	@PutMapping("/api/admin/staff")
	public ResponseEntity<Customer> enableStaff(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);
	}
	

}
