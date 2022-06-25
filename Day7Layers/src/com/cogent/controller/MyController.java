package com.cogent.controller;

import java.util.Scanner;

import com.cogent.model.Customer;
import com.cogent.service.CustomerService;

public class MyController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addCustomer();
		printAllCustomers();
		

	}
	public static void addCustomer() {
		Scanner sc = new Scanner(System.in);
		Customer customer = new Customer();
		System.out.println("Please enter Customer ID");
		customer.setCustomerID(sc.nextInt());
		System.out.println("Please enter Customer Name");
		customer.setCustomerName(sc.next());
		
		CustomerService customerService = new CustomerService();
		customerService.addCustomer(customer);
	
	}
	public static void printAllCustomers() {

		CustomerService customerService = new CustomerService();
		customerService.printAllCustomers();
		
	}

}
