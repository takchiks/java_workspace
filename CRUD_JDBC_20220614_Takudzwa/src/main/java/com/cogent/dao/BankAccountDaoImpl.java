package com.cogent.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cogent.exceptions.InsuffienctFundsException;
import com.cogent.model.BankAccount;
import com.cogent.util.DbUtil;

public class BankAccountDaoImpl implements BankAccountDao {
	private Connection con;
	private Statement stmt;
	private PreparedStatement preStmt;

	@Override
	public void openNewAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		try {
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			String query = "Insert into BankAccount_tbl values (" + bankAccount.getAccountNo() + ",'"
					+ bankAccount.getAccountHolderName() + "','" + bankAccount.getAccountType() + "',"
					+ bankAccount.isIsactive() + ",'" + bankAccount.getBalance() + "')";

			if (1 == stmt.executeUpdate(query)) {
				System.out.println("Successful Creation of Bank Account:"+ bankAccount);
			} else {
				System.out.println("Error creating " + bankAccount);
				throw new RuntimeException("Error while creating the Bank Account");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtil.closeDbResources(con, preStmt);
		}

	}

	@Override
	public void fundTransfer(BankAccount debtor, BankAccount creditor, double amount) {
		// TODO Auto-generated method stub
		try {
			con = DbUtil.getConnection();
			con.setAutoCommit(false);
			stmt = con.createStatement();

			if((creditor.getBalance() < amount)) {
				throw new InsuffienctFundsException(creditor.getAccountHolderName()+" has insufficient funds");
			}
			
			String query = "Update BankAccount_tbl SET balance=" + (debtor.getBalance() + amount)
					+ " where accountNo = " + debtor.getAccountNo() + " AND accountHolderName = '"
					+ debtor.getAccountHolderName() + "';";
			stmt.executeUpdate(query);

			query = "Update BankAccount_tbl SET balance=" + (creditor.getBalance() - amount) + " where accountNo = "
					+ creditor.getAccountNo() + " AND accountHolderName = '" + creditor.getAccountHolderName() + "';";
			stmt.executeUpdate(query);

			con.commit();

		} catch (SQLException se) {
			se.printStackTrace();

		} catch(InsuffienctFundsException ife) {
			ife.printStackTrace();
		} finally {
			DbUtil.closeDbResources(con, stmt);
		}

	}

	@Override
	public void addFund(BankAccount bankAccount, double amount) {
		// TODO Auto-generated method stub
		try {
			con = DbUtil.getConnection();
			stmt = con.createStatement();

			String query = "Update BankAccount_tbl SET balance=" + (bankAccount.getBalance() + amount)
					+ " where accountNo = " + bankAccount.getAccountNo() + " AND accountHolderName = '"
					+ bankAccount.getAccountHolderName() + "';";
			stmt.executeUpdate(query);

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {

		}

	}

	@Override
	public BankAccount printAllDetail(long accountNo) {
		// TODO Auto-generated method stub
		BankAccount bankAccount = new BankAccount();
		try {
			con = DbUtil.getConnection();
			stmt = con.createStatement();

			String query = "SELECT * FROM BankAccount_tbl where accountNo = " + accountNo + ";";
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				bankAccount.setAccountNo(rs.getLong(1));
				bankAccount.setAccountHolderName(rs.getString(2));
				bankAccount.setAccountType(rs.getString(3));
				bankAccount.setBalance(rs.getDouble(5));
				bankAccount.setIsactive(rs.getBoolean(4));
			}

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {

		}
		return null != bankAccount.getAccountNo() && accountNo == bankAccount.getAccountNo() ?bankAccount:null;
	}

	@Override
	public List<BankAccount> printAllActiveAccounts() {
		// TODO Auto-generated method stub
		List<BankAccount> list = new ArrayList();
		try {
			con = DbUtil.getConnection();
			stmt = con.createStatement();

			String query = "SELECT * FROM BankAccount_tbl ;";
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				if (rs.getBoolean(4)) {

					BankAccount bankAccount = new BankAccount();
					bankAccount.setAccountNo(rs.getLong(1));
					bankAccount.setAccountHolderName(rs.getString(2));
					bankAccount.setAccountType(rs.getString(3));
					bankAccount.setBalance(rs.getDouble(5));
					bankAccount.setIsactive(rs.getBoolean(4));

					list.add(bankAccount);
				}
			}

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {

		}
		return list;
	}

}
