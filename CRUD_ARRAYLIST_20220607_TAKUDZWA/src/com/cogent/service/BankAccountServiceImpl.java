package com.cogent.service;

import java.util.List;

import com.cogent.dao.BankAccountRepo;
import com.cogent.dao.BankAccountRepoImpl;
import com.cogent.model.BankAccountBean;

public class BankAccountServiceImpl implements BankAccountService{
	private static final BankAccountRepo bankAccountRepo = new BankAccountRepoImpl();

	@Override
	public void createAccount(BankAccountBean bankAccount) {
		// TODO Auto-generated method stub
		bankAccountRepo.createAccount(bankAccount);
		
	}

	@Override
	public void addFund(long accountNo, double amount) {
		// TODO Auto-generated method stub
		bankAccountRepo.addFund(accountNo, amount);
		
	}

	@Override
	public void deactivateAccount(long accountNo) {
		// TODO Auto-generated method stub
		bankAccountRepo.deactivateAccount(accountNo);
		
	}

	@Override
	public void activateAccount(long accountNo) {
		// TODO Auto-generated method stub
		bankAccountRepo.activateAccount(accountNo);
		
	}

	@Override
	public void withdrawAmount(long accountNo, double amount) {
		// TODO Auto-generated method stub
		bankAccountRepo.withdrawAmount(accountNo, amount);
		
	}

	@Override
	public BankAccountBean printAccountDetails(long accountNo) {
		// TODO Auto-generated method stub
		
		return bankAccountRepo.printAccountDetails(accountNo);
	}

	@Override
	public List<BankAccountBean> printAllBankAccountDetail() {
		// TODO Auto-generated method stub
		return bankAccountRepo.printAllBankAccountDetail();
	}

	@Override
	public void deleteBankAccount(long accountNo) {
		// TODO Auto-generated method stub
		bankAccountRepo.deleteBankAccount(accountNo);
		
	}

}
