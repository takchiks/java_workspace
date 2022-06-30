package com.cogent.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.cogent.enums.AccountType;


@Entity
public class BankAccount {
	@Id
	private int accountNumber;
	private AccountType accType;
	private double accountBalance; 
	private String approved;
	private Date dateOfCreation;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Customer customer;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public AccountType getAccType() {
		return accType;
	}

	public void setAccType(AccountType accType) {
		this.accType = accType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}

	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public BankAccount(int accountNumber, AccountType accType, double accountBalance, String approved,
			Date dateOfCreation, Customer customer) {
		super();
		this.accountNumber = accountNumber;
		this.accType = accType;
		this.accountBalance = accountBalance;
		this.approved = approved;
		this.dateOfCreation = dateOfCreation;
		this.customer = customer;
	}

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
