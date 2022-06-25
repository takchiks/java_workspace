package com.cogent.dao;

import java.util.List;

import com.cogent.model.BankAccountBean;

public interface BankAccountRepo {
	public void createAccount(BankAccountBean bankAccount);
	public void addFund(long accountNo, double amount);
	public void deactivateAccount(long accountNo);
	public void activateAccount(long accountNo);
	public void withdrawAmount(long accountNo, double amount);
	public BankAccountBean printAccountDetails(long accountNo);
	public List<BankAccountBean> printAllBankAccountDetail();
	public void deleteBankAccount(long accountNo);
	

}
