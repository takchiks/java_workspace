package com.cogent.service;

import com.cogent.model.Customer;
import com.cogent.repo.CustomerRepo;

public class CustomerService {
	private static final CustomerRepo repo = new CustomerRepo();
	
	public void addCustomer(Customer customer) {
		repo.addCustomer(customer);
		
	}
	public void deleteCustomerById(int customerId) {
//		repo = new CustomerRepo();
		
	}
	public Customer searchCustomerById(int customerId) {
		return null;
	}

	public void printAllCustomers() {
		repo.printAllCustomers();
	}

}
