package com.cogent.exceptions;

public class Manager057 {
	public static void main(String ...args) {
		BankAcc b1 = new BankAcc(9092,500);
		b1.withdraw(49);
	}

}

class BankAcc{
	private int accNo;
	private int balance;
	public BankAcc(int accNo, int balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}
	public void withdraw(int amt) {
		if(amt>=balance) {
			throw new InsufficientFundsException("Insuffient Funds: balance = " +balance );
		}
		else {
			balance -= amt;
			System.out.println("You have");
		}
	}
	
	
	
	
	
}
