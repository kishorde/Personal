package com.cybage.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.util.Date;
import java.sql.Date;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		
		try
		{
			
			//loaded drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			//established connection
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbdemo","root","root");
			System.out.println("Connection is established");
			
			
			PreparedStatement pStatement=connection.prepareStatement("insert into student (name,marks,address,DOB) values (?,?,?,?)");
			
			connection.setAutoCommit(false);	
			
			pStatement.setString(1, "Rucha");
			pStatement.setInt(2, 85);
			pStatement.setString(3, "Pune");
			pStatement.setDate(4,new Date (122,10,10));
//			pStatement.setString(4,"2022,10,10");		//also we can use this for seting date 
			pStatement.executeUpdate();			
			
			//Next record to add
			pStatement.setString(1, "alka");
			pStatement.setInt(2, 85);
			pStatement.setString(3, "pcmc");
			pStatement.setDate(4,new Date (122,1,1));
			pStatement.executeUpdate();	
			
			
			connection.commit();
		}
		catch(Exception e)
		{
			connection.rollback();
			e.printStackTrace();
			
			
		}

	}

}