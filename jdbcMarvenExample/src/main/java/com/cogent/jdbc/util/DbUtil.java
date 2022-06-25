package com.cogent.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		Connection con = null;
		try {
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","taku","tika4595");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","taku","tika4595");
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	
	public static void closeDbResources(Connection con, Statement stmt){
		try {
			if(stmt!=null) {
				stmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public static void closeDbResources(Connection con, Statement stmt, ResultSet rs){
		try {
			if(rs!=null) {
				rs.close();
			}
			if(stmt!=null) {
				stmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
