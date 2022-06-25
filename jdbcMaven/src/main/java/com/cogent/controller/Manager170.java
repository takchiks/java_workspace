package com.cogent.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.cogent.jdbc.util.DbUtil;

public class Manager170 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;
		
	try {
		con = DbUtil.getConnection();
		stmt = con.createStatement();
		populateDb(stmt);
		System.out.println("Done!");
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		DbUtil.closeDbResources(con, stmt);
	}


	}
	public static void populateDb(Statement stmt) {
		File file = new File("db.properties");
		FileReader fr = null;
		BufferedReader br = null;
		String query = null;
		
		
		try {
		fr = new FileReader(file);		
		 br = new BufferedReader(fr);
		 query = br.readLine();
		 
		 while(query!=null) {
			 stmt.executeUpdate(query);
			 query = br.readLine();
		 }
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
