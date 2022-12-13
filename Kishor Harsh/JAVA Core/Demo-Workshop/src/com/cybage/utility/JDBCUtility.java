package com.cybage.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtility {

	public static Connection connection=null;
	
	public static Connection getConnection() throws ClassNotFoundException
	{
		
		//get connection
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		try
		{
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Product","root","root");
			System.out.println("dskhcb");
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
