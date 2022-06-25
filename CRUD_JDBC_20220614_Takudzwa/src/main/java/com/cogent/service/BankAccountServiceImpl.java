package com.cogent.service;

import java.util.List;

import com.cogent.dao.BankAccountDao;
import com.cogent.dao.BankAccountDaoImpl;
import com.cogent.model.BankAccount;

public class BankAccountServiceImpl implements BankAccountService {
	private static final BankAccountDao bankAccountDao = new BankAccountDaoImpl();
	@Override
	public void openNewAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		bankAccountDao.openNewAccount(bankAccount);
	}

	@Override
	public void fundTransfer(BankAccount debtor, BankAccount creditor, double amount) {
		// TODO Auto-generated method stub
		
		bankAccountDao.fundTransfer(debtor, creditor, amount);

	}

	@Override
	public void addFund(BankAccount bankAccount, double amount) {
		// TODO Auto-generated method stub
		bankAccountDao.addFund(bankAccount, amount);

	}

	@Override
	public BankAccount printAllDetail(long accountNo) {
		// TODO Auto-generated method stub
		return bankAccountDao.printAllDetail(accountNo);
	}

	@Override
	public List<BankAccount> printAllActiveAccounts() {
		// TODO Auto-generated method stub
		return bankAccountDao.printAllActiveAccounts();
	}

}
