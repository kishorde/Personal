package com.cybage.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtility {

	public static Connection connection=null;
	
	public static Connection getConnection() throws ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
	
	//established connection
//		try(Connection connection1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbdemo","root","root");)
//		{
//			connection=connection1;
//		}
//		catch(SQLException e)
//		{
//			e.printStackTrace();
//		}
//		
//		return connection;
		
		
		try
		{
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbdemo","root","root");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return connection;
		
	}
	
	
	//Close Connection:
	public static void closeConnetion()
	{
		try
		{
			connection.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
