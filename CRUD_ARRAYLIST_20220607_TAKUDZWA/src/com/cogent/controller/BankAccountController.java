package com.cogent.controller;

import java.util.Scanner;

import com.cogent.model.BankAccountBean;
import com.cogent.service.BankAccountService;
import com.cogent.service.BankAccountServiceImpl;

public class BankAccountController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		BankAccountController bankAccountController = new BankAccountController();

		System.out.println("Welcome to our Bank:");
		outer: while (true) {
			System.out.println("___________________________");

			System.out.println("\nChoose One Option--->(NUMBER)");

			System.out.println("1. Create Account");
			System.out.println("2. Add Funds");
			System.out.println("3. Deactivate Account");
			System.out.println("4. Activate Account");
			System.out.println("5. Withdraw Amount");
			System.out.println("6. Find Account");
			System.out.println("7. Print All Accounts");
			System.out.println("8. Delete Account ");
			System.out.println("9. Close App");

			choice = sc.nextInt();

			switch (choice) {
				case 1:
					bankAccountController.createAccount();
					break;
				case 2:
					bankAccountController.addFund();
					break;
				case 3:
					bankAccountController.deactivateAccount();
					break;
				case 4:
					bankAccountController.activateAccount();
					break;
				case 5:
					bankAccountController.withdrawAmount();
					break;
				case 6:
					bankAccountController.printAccountDetails();
					break;
				case 7:
					bankAccountController.printAllBankAccounts();
					break;
				case 8:
					bankAccountController.deleteBankAccount();
					break;
				case 9:
					break outer;
				default:
					System.out.println("Enter Valid Option::");
					break;
					
			

			}

		}

		System.out.println("Thank you for visiting our Bank");


	}

	public void createAccount() {
		Scanner sc = new Scanner(System.in);
		BankAccountBean bankAccount = new BankAccountBean();
		System.out.println("Please enter the account details:");

		System.out.println("Enter the account number:");
		bankAccount.setAccountNo(sc.nextLong());
		System.out.println("Enter Account Holder Name");
		bankAccount.setAccountHolderName(sc.next());
		System.out.println("Enter Opening Balance");
		bankAccount.setOpeningBalance(sc.nextDouble());
		System.out.println("Enter Account type: Current or Saving");
		String accountType = sc.next();
		if(accountType.trim().charAt(0)=='C'||accountType.trim().charAt(0)=='c')
			bankAccount.setAccountType("CURRENT");
		else
			bankAccount.setAccountType("SAVINGS");
		System.out.println("Enter is Account Active: true or false");
		bankAccount.setActive(sc.nextBoolean());		
		
		
		BankAccountService bankAccountService = new BankAccountServiceImpl();
		bankAccountService.createAccount(bankAccount);
	}

	public void addFund() {
		Scanner sc = new Scanner(System.in);

		BankAccountService bankAccountService = new BankAccountServiceImpl();
		long accNo;
		double amount;
		System.out.println("Add Funds:");
		System.out.println("Enter Account Number:");
		accNo = sc.nextLong();
		System.out.println("Enter Amount:");
		amount = sc.nextDouble();
		bankAccountService.addFund(accNo, amount);
		System.out.println("You have succefully added funds: $" + amount +"to account number"+ accNo);
		
		
	}
	public void deactivateAccount() {
		Scanner sc = new Scanner(System.in);

		BankAccountService bankAccountService = new BankAccountServiceImpl();
		long accNo;
		System.out.println("Deactivate:");
		System.out.println("Enter Account Number:");
		accNo = sc.nextLong();
		bankAccountService.deactivateAccount(accNo);	
		System.out.println("You have succefully deactivated account number"+ accNo);
			
	}
	public void activateAccount() {
		Scanner sc = new Scanner(System.in);

		BankAccountService bankAccountService = new BankAccountServiceImpl();
		long accNo;
		System.out.println("Activate:");
		System.out.println("Enter Account Number:");
		accNo = sc.nextLong();
		bankAccountService.activateAccount(accNo);	
		System.out.println("You have succefully activated account number"+ accNo);
		
	}
	public void withdrawAmount() {

		Scanner sc = new Scanner(System.in);

		BankAccountService bankAccountService = new BankAccountServiceImpl();
		long accNo;
		double amount;
		System.out.println("Withdraw:");
		System.out.println("Enter Account Number:");
		accNo = sc.nextLong();
		System.out.println("Enter Amount:");
		amount = sc.nextDouble();
		bankAccountService.withdrawAmount(accNo, amount);
		System.out.println("You have succefully withdraw: $" + amount +"to account number"+ accNo);
		
		
	}
	public void printAccountDetails() {

		Scanner sc = new Scanner(System.in);

		BankAccountService bankAccountService = new BankAccountServiceImpl();
		long accNo;
		System.out.println("Print Account:");
		System.out.println("Enter Account Number:");
		accNo = sc.nextLong();
		System.out.println(bankAccountService.printAccountDetails(accNo));
	}

	public void printAllBankAccounts() {
		System.out.println("All Accounts:");
		BankAccountService bankAccountService = new BankAccountServiceImpl();
		System.out.println(bankAccountService.printAllBankAccountDetail());
	}
	public void deleteBankAccount() {

		Scanner sc = new Scanner(System.in);

		BankAccountService bankAccountService = new BankAccountServiceImpl();
		long accNo;
		System.out.println("Delete:");
		System.out.println("Enter Account Number:");
		accNo = sc.nextLong();
		
		bankAccountService.deleteBankAccount(accNo);
		
	}

}
