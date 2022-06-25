package com.cogent.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.cogent.jdbc.util.DbUtil;

public class Manager171 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement stmt = null;
		String  name, decider;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
	try {
		con = DbUtil.getConnection();
		con.setAutoCommit(false);
		stmt = con.prepareStatement("INSERT INTO `Test1_tb1`(`sno`, `name`) VALUES (?,?)");
		do {
			System.out.println("Enter ID");
			stmt.setInt(1, sc.nextInt());
			System.out.println("Enter Name");
			stmt.setString(2, sc.next());
			
			stmt.executeUpdate();
			System.out.println("Do you wish to continue");
			decider = sc.next();
			
			
		}while("Y".equals(decider));
		con.commit();
		System.out.println("Done!");
	}catch (Exception e) {
		try {
			con.rollback();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		DbUtil.closeDbResources(con, stmt);
	}

	}

}
