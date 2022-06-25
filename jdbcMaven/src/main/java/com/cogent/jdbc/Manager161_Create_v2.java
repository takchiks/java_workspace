package com.cogent.jdbc;
import java.sql.Connection;
import java.sql.Statement;

import com.cogent.jdbc.util.DbUtil;

public class Manager161_Create_v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;
		
	try {
		con = DbUtil.getConnection();
		stmt = con.createStatement();
		String query = "Create table Test3_tb1(sno int, name varchar(20));";
		stmt.execute(query);
		System.out.println("Done!");
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		DbUtil.closeDbResources(con, stmt);
	}
		

	}

}
