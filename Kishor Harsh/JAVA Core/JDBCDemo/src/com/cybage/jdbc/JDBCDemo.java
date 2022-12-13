package com.cybage.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class JDBCDemo {

//	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//		// TODO Auto-generated method stub
//
//		//Load driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		//define connection url
//		//established connection
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbdemo","root","root");
//		System.out.println("Connection is established");
	
	public static void main(String[] args)  {

		//Load driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//define connection url
			//established connection
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbdemo","root","root");
			System.out.println("Connection is established");
			
			
//			statement object
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from student");
			
			int id,marks;
			String name,address;
			Date date;
			while(resultSet.next())		//resultSet.next() checks for new value
			{
				id=resultSet.getInt(1);
				name=resultSet.getString(2);
				address=resultSet.getString(4);
				marks=resultSet.getInt(3);
				date=resultSet.getDate(5);
				
				System.out.println("id = "+id+" ,name = "+name+" ,address = "+address+" ,marks =  "+marks+" ,DOB = "+date);
//				System.out.println();
			}
		}
		
		catch (Exception exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}
		
		
		
		
		//creating statement
		
		
	}

}
