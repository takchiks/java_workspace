package com.cogent.repo;

import com.cogent.model.Customer;

public class CustomerRepo {
	private Customer[] cust = new Customer[10];
	private int index=0;
	public void addCustomer(Customer customer) {
		if (index>=10) {
			System.out.print("Out of bounds");
		}
		cust[index++] = customer;
		
	}
	public void printAllCustomers() {
		System.out.println("All Customers:\nID \t Name");
		for(Customer customer:cust) {
			if(customer!=null)
				System.out.println(customer);
		}
	}

}
