package com.cogent.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cogent.model.BankAccountBean;

public class BankAccountRepoImpl implements BankAccountRepo {
	private static ArrayList<BankAccountBean> allBankAccounts = new ArrayList<BankAccountBean>();

	@Override
	public void createAccount(BankAccountBean bankAccount) {
		// TODO Auto-generated method stub
		allBankAccounts.add(bankAccount);
				
	}

	@Override
	public void addFund(long accountNo, double amount) {
		// TODO Auto-generated method stub
		Iterator<BankAccountBean> it = allBankAccounts.iterator();
		double balance;
		while(it.hasNext()) {
			BankAccountBean tempBank = it.next();
			if(tempBank.getAccountNo()==accountNo) {
				if(!tempBank.isActive()) {
					System.out.println("Account is not active");
					break;
				}
				balance = tempBank.getOpeningBalance()+amount;
				tempBank.setOpeningBalance(balance);
				break;
			}
		}
		
	}

	@Override
	public void deactivateAccount(long accountNo) {
		// TODO Auto-generated method stub
		Iterator<BankAccountBean> it = allBankAccounts.iterator();
		while(it.hasNext()) {
			BankAccountBean tempBank = it.next();
			if(tempBank.getAccountNo()==accountNo) {
				tempBank.setActive(false);
				break;
			}
		}
		
		
	}

	@Override
	public void activateAccount(long accountNo) {
		// TODO Auto-generated method stub
		Iterator<BankAccountBean> it = allBankAccounts.iterator();
		while(it.hasNext()) {
			BankAccountBean tempBank = it.next();
			if(tempBank.getAccountNo()==accountNo) {
				tempBank.setActive(true);
				break;
			}
		}
		
	}

	@Override
	public void withdrawAmount(long accountNo, double amount) {
		// TODO Auto-generated method stub
		Iterator<BankAccountBean> it = allBankAccounts.iterator();
		double balance;
		while(it.hasNext()) {
			BankAccountBean tempBank = it.next();
			if(tempBank.getAccountNo()==accountNo) {
				if(!tempBank.isActive()) {
					System.out.println("Account is not active");
					break;
				}

				if(amount>tempBank.getOpeningBalance()) {
					System.out.println("Insufficient Funds: amount NOT withdrawn");
					break;
				}
				balance = tempBank.getOpeningBalance()- amount;
				tempBank.setOpeningBalance(balance);
				break;
			}
		}
		
	}

	@Override
	public BankAccountBean printAccountDetails(long accountNo) {
		// TODO Auto-generated method stub
		Iterator<BankAccountBean> it = allBankAccounts.iterator();
		double balance;
		while(it.hasNext()) {
			BankAccountBean tempBank = it.next();
			if(tempBank.getAccountNo()==accountNo) {
				return tempBank;
			}
		}
		return null;
	}

	@Override
	public List<BankAccountBean> printAllBankAccountDetail() {
		// TODO Auto-generated method stub
		return allBankAccounts;
	}

	@Override
	public void deleteBankAccount(long accountNo) {
		// TODO Auto-generated method stub
		Iterator<BankAccountBean> it = allBankAccounts.iterator();
		double balance;
		while(it.hasNext()) {
			BankAccountBean tempBank = it.next();
			if(tempBank.getAccountNo()==accountNo) {
				allBankAccounts.remove(tempBank);
			}
		}
		
	}
	
	
}
