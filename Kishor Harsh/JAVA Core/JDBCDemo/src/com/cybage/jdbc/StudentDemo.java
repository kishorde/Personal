package com.cybage.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDemo {

	public static void main(String[] args) {
	
		try
		{
			
			//loaded drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			//established connection
//			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbdemo","root","root");
			Connection connection=JDBCUtility.getConnection();		// also we can use utility method in which we have made a static method getconnection() and here we are calling that method
			
			System.out.println("Connection is established");
			
			Student student=new Student(1,"Kishor","Osmanabad");
			Student student1=new Student(2,"chicku","Kolhapur");
			
//			PreparedStatement pStatement=connection.prepareStatement("insert into student1 (id,name,address) values (?,?,?)");
//				
////			for adding object 1 data
//			
//			pStatement.setInt(1, student.getId());
//			pStatement.setString(2, student.getName());
//			pStatement.setString(3, student.getAddress());
////			
//			int res = pStatement.executeUpdate();

			
			
//			for adding object 2 data
			
//			pStatement.setInt(1, student1.getId());
//			pStatement.setString(2, student1.getName());
//			pStatement.setString(3, student1.getAddress());
//			
//			int res = pStatement.executeUpdate();
//			
			
			
//			update
//			Student student1=new Student();
			PreparedStatement pStatement1=connection.prepareStatement("update student1 set name=? where id=?");
			// put the preparedStatement in try catch block to automatically close the resource using arm and remove upper try
//			try(PreparedStatement pStatement1=connection.prepareStatement("update student1 set name=? where id=?");)
//			{
//				pStatement1.setString(1,student1.setName("Kishor"));
//				pStatement1.setInt(2,2);
//				
//				int res=pStatement1.executeUpdate();
//			}
			
			
			
			pStatement1.setString(1,student1.setName("Kishor"));
			pStatement1.setInt(2,2);
			
			int res=pStatement1.executeUpdate();
			if(res>0)
			{
				System.out.println("Record Inserted Succesfully!");
			}
			else
			{
				System.out.println("Error!!!");
			}
			
			
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			JDBCUtility.closeConnetion();
		}
	}
}