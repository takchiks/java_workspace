package com.cogent.controller;

import java.util.List;

import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.entity.BankAccount;
import com.cogent.entity.Customer;
import com.cogent.entity.UserLogin;

@RestController
public class CustomerController {

	@PostMapping("/api/customer/register")
	public ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer) {

		return new ResponseEntity<Customer>(HttpStatus.OK);

	}

	@PostMapping("/api/customer/authenticate")
	public ResponseEntity<Jwt> authenticate(@RequestBody UserLogin user) {

		return new ResponseEntity<Jwt>(HttpStatus.OK);

	}

	@PostMapping("/api/customer/{customerID}/acocunt")
	public ResponseEntity<BankAccount> createAccount(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<BankAccount>(HttpStatus.OK);

	}

	@PutMapping("/api/customer/{customerID}/account/:accountNo ")
	public ResponseEntity<BankAccount> approveAccount(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<BankAccount>(HttpStatus.OK);

	}

	@GetMapping("/api/customer/{customerID}/acocunt ")
	public ResponseEntity<List<BankAccount>> getAccountByCustomer(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<List<BankAccount>>(HttpStatus.OK);

	}

	@GetMapping("/api/customer/{customerID}")
	public ResponseEntity<Customer> getCustomer(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);

	}

	@PutMapping("/api/customer/{customerID}")
	public ResponseEntity<Customer> updateCustomer(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);

	}

	@GetMapping("/api/customer/{customerID}/account/{accountID}")
	public ResponseEntity<Customer> getAccountTransaction(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);

	}

	@PostMapping("/api/customer/{customerID}/beneficiary")
	public ResponseEntity<Customer> addBeneficiary(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);

	}

	@GetMapping("/api/customer/{customerID}/beneficiary")
	public ResponseEntity<Customer> getBeneficiary(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);

	}

	@DeleteMapping("/api/customer/{customerID}/beneficiary/{beneficiaryID}")
	public ResponseEntity<Customer> DeleteBeneficiary(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);

	}

	@PutMapping("/api/customer/transfer")
	public ResponseEntity<Customer> transfer(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);

	}

	@GetMapping("/api/customer/{username}/forgot/question/answer")
	public ResponseEntity<Customer> validateQuestion(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);

	}
	
	@PutMapping("/api/customer/{username}/forgot")
	public ResponseEntity<Customer> forgotPassword(@RequestBody BankAccount bankAccount) {

		return new ResponseEntity<Customer>(HttpStatus.OK);

	}

}
