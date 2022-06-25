package com.cogent.model;

public class BankAccountBean {
	private long accountNo;
	private String accountHolderName;
	private double openingBalance;
	private String accountType;
	private boolean isActive=true;
	
	public BankAccountBean() {
		super();
	}
	public BankAccountBean(long accountNo, String accountHolderName, double openingBalance, String accountType,
			boolean isActive) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.openingBalance = openingBalance;
		this.accountType = accountType;
		this.isActive = isActive;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Bank Account [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName
				+ ", openingBalance=" + openingBalance + ", accountType=" + accountType + ", isActive=" + isActive
				+ "]";
	}
	
	
	
	

}
