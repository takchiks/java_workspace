package com.cogent.service;

import java.util.List;

import com.cogent.model.BankAccount;

public interface BankAccountService {
	public void openNewAccount(BankAccount bankAccount);
	public void fundTransfer(BankAccount debtor, BankAccount creditor, double amount);
	public void addFund(BankAccount bankAccount, double amount);
	public BankAccount printAllDetail(long accountNo);
	public List<BankAccount> printAllActiveAccounts();
	
}
