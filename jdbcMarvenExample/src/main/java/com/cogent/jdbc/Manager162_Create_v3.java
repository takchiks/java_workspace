package com.cogent.jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.cogent.jdbc.util.DbUtil;

public class Manager162_Create_v3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
	try {
		con = DbUtil.getConnection();
		stmt = con.createStatement();
		
		String query = "Select * from Test1_tb1;";
		rs = stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+""+rs.getString(2)+rs.getInt(1));
		}
		System.out.println("Done!");
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		DbUtil.closeDbResources(con, stmt,rs);
	}
		

	}

}
