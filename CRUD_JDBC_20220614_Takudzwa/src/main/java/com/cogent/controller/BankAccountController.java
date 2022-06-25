package com.cogent.controller;

import java.util.Iterator;
import java.util.Scanner;

import com.cogent.model.BankAccount;
import com.cogent.service.BankAccountService;
import com.cogent.service.BankAccountServiceImpl;

public class BankAccountController {
	private static BankAccountService bankService = new BankAccountServiceImpl();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		BankAccountController bankAccountController = new BankAccountController();

		System.out.println("Welcome to our Bank:");
		outer: while (true) {
			System.out.println("___________________________");

			System.out.println("\nChoose One Option--->(NUMBER)");

			System.out.println("1. Open Bank Account");
			System.out.println("2. Tranfer Funds");
			System.out.println("3. Add Funds");
			System.out.println("4. Print Account Details");
			System.out.println("5. Print All Active Accounts");
			System.out.println("6. Close App");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				bankAccountController.openBankAccount();
				break;
			case 2:
				bankAccountController.transfer();
				break;
			case 3:
				bankAccountController.addFunds();
				break;
			case 4:
				bankAccountController.findAccount();
				break;

			case 5:
				bankAccountController.printAllActive();
				break;
			case 6:
				break outer;
			default:
				System.out.println("Enter Valid Option::");
				break;

			}

		}

		System.out.println("Thank you for visiting our Bank");

	}

	public static void openBankAccount() {
		Scanner sc = new Scanner(System.in);
		BankAccount bankAccount = new BankAccount();
		System.out.println("---Enter Account Details---");
		System.out.println("Enter Account Number:");
		bankAccount.setAccountNo(sc.nextLong());
		System.out.println("Enter Account HOLDER:");
		bankAccount.setAccountHolderName(sc.next("[A-Za-z]{1,30}$"));
		System.out.println("Enter Account Type: SAVING/CURRENT ");
		String typeAcc = sc.next();
		while(!(typeAcc.substring(0,1).equalsIgnoreCase("C") || typeAcc.substring(0,1).equalsIgnoreCase("S"))) {
			System.out.println("Enter correct Account Type: SAVING/CURRENT ");
			typeAcc = sc.next();
			
		}
		typeAcc = typeAcc.substring(0,1).equalsIgnoreCase("C")?"CURRENT":"SAVING";
		bankAccount.setAccountType(typeAcc);

		System.out.println("Is account active: true/false");
		bankAccount.setIsactive(sc.nextBoolean());

		System.out.println("Enter Balance:");
		bankAccount.setBalance(sc.nextDouble());
		
		
		bankService.openNewAccount(bankAccount);
	}

	public static void transfer() {

		Scanner sc = new Scanner(System.in);
		System.out.println("---Transfer From Creditor to  Debtor---");
		System.out.println("Enter Debtor Account Number:");
		long accNo = sc.nextLong();
		BankAccount debtor = bankService.printAllDetail(accNo);
		while (debtor == null) {
			System.out.println("Wrong Account Number: \nEnter Debtor Account Number:");
			accNo = sc.nextLong();
			debtor = bankService.printAllDetail(accNo);

		}
		System.out.println("1: " + debtor);

		System.out.println("Enter Creditor Account Number:");
		accNo = sc.nextLong();
		BankAccount creditor = bankService.printAllDetail(accNo);

		while (creditor == null || debtor.equals(creditor)) {
			System.out.println("Enter Correct Debtor Account Number:");
			accNo = sc.nextLong();
			creditor = bankService.printAllDetail(accNo);

		}
		System.out.println("2: " + debtor);
		System.out.println("Enter Amount:");
		double amount = sc.nextDouble();

		while (amount < 0) {
			System.out.println("Enter Correct Amount: ");
			amount = sc.nextDouble();

		}
		if (creditor.isIsactive() || debtor.isIsactive()) {
			bankService.fundTransfer(debtor, creditor, amount);
			System.out.println(" Debtor:" + debtor.getAccountHolderName() + " has balance "+ debtor.getBalance());
			System.out.println(" Creditor:" + creditor.getAccountHolderName() + " has balance "+ creditor.getBalance());
		} else {
			String msg = (!debtor.isIsactive()) && (!creditor.isIsactive())?"Both Accounts are NOT active":(!creditor.isIsactive())?
					"Creditor is NOT active":"Debtor is NOT active";
			System.out.println(msg);

		}

	}

	public static void addFunds() {

		Scanner sc = new Scanner(System.in);
		System.out.println("---Add Funds---");
		System.out.println("Enter Account Number:");
		long accNo = sc.nextLong();
		BankAccount bankAccount = bankService.printAllDetail(accNo);

		while (bankAccount == null) {
			System.out.println("Enter Correct Account Number:");
			accNo = sc.nextLong();
			bankAccount = bankService.printAllDetail(accNo);
		}
		System.out.println("1: " + bankAccount);
		System.out.println("Enter Amount:");
		double amount = sc.nextDouble();

		while (amount < 0) {
			System.out.println("Enter Correct Amount: ");
			amount = sc.nextDouble();

		}
		if(bankAccount.isIsactive()) {
		bankService.addFund(bankAccount, amount);
		System.out.println("Account Name: "+bankAccount.getAccountHolderName()+"\nNew Balance:" + bankAccount.getBalance()+"\n\n");
		}else {

			System.out.println("Account: "+bankAccount.getAccountNo() + "  "+ bankAccount.getAccountHolderName()+" is NOT ACTIVE \nBalance is still:" + bankAccount.getBalance()+"\n\n");
			
		}

	}

	public static void findAccount() {

		Scanner sc = new Scanner(System.in);
		System.out.println("---Print Account Details---");
		System.out.println("Enter Account Number:");
		long accNo = sc.nextLong();
		BankAccount bankAccount = bankService.printAllDetail(accNo);

		while (bankAccount == null) {
			System.out.println("Enter Correct Account Number:");
			accNo = sc.nextLong();
			bankAccount = bankService.printAllDetail(accNo);
		}
		System.out.println("1: " + bankAccount);
	}

	public static void printAllActive() {
		System.out.println("---Printing All Active Account---");

		Iterator<BankAccount> iterator = bankService.printAllActiveAccounts().iterator();
		int i = 0;
		while (iterator.hasNext()) {
			i++;
			System.out.println(i + ": " + iterator.next());
		}

	}

}
