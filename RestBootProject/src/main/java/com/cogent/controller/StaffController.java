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
public class StaffController {

	@PostMapping("/api/staff/authenticate")
	public ResponseEntity<Customer> authenticate(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);

	}

	@GetMapping("/api/staff/account/{accountNo}")
	public ResponseEntity<Customer> getAccountDetails(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);

	}

	@GetMapping("/api/staff/beneficiary")
	public ResponseEntity<Customer> getApprovedBeneficiary(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);

	}

	@PutMapping("/api/staff/beneficiary")
	public ResponseEntity<Customer> updateBeneficiary(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);

	}

	@GetMapping("/api/staff/accounts/approve")
	public ResponseEntity<Customer> getApprovedAccounts(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);

	}

	@PutMapping("/api/staff/accounts/approve")
	public ResponseEntity<Customer> approveAccounts(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);

	}

	@GetMapping("/api/staff/customer")
	public ResponseEntity<Customer> getAllCustomer(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);
	}

	@PutMapping("/api/staff/customer")
	public ResponseEntity<Customer> enableCustomer(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);
	}

	@GetMapping("/api/staff/customer/{customerID}")
	public ResponseEntity<Customer> getCustomerId(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);
	}

	@PutMapping("/api/staff/transfer")
	public ResponseEntity<Customer> transfer(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);
	}


}
