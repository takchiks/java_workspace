package com.cogent.model;

public class BankAccount {
	private Long accountNo;
	private String accountHolderName;
	private String accountType;
	private boolean isactive;
	private double balance;
	
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BankAccount(long accountNo, String accountHolderName, String accountType, boolean isactive, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.isactive = isactive;
		this.balance = balance;
	}


	public Long getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public boolean isIsactive() {
		return isactive;
	}


	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", isactive=" + isactive + ", balance=" + balance + "]";
	}
	
	

}
