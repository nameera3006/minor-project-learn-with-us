package com.tech.blog.helper;

import java.sql.*;


public class ConnectionProvider {

	public static Connection con;
	public static Connection getConnection()
	{
	
		try {

			if(con==null) {
			//driver class load
			Class.forName("com.mysql.jdbc.Driver");
			
			//create a connection

			String url = "jdbc:mysql://localhost:3307/techblog";
			String username = "admin";
			String pwd = "Admin$123";
		    con = DriverManager.getConnection(url, username, pwd);

			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
		
	}
	
}
