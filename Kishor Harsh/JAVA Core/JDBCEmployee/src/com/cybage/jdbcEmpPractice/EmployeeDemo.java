package com.cybage.jdbcEmpPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class EmployeeDemo {
	
	public void Insert()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbdemo","root","root");
			System.out.println("Connection Successful!!!");
			
			System.out.println("Insert Data:-");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter Id :");
			int id=sc.nextInt();
			System.out.print("Enter Name :");
			String name=sc.next();
			System.out.print("Enter salary :");
			int salary=sc.nextInt();
			
			
			PreparedStatement pStatement=connection.prepareStatement("insert into employee (id,name,salary) values(?,?,?)");
			
			
			Employee emp=new Employee(id,name,salary);
			
			pStatement.setInt(1, emp.getId());
			pStatement.setString(2, emp.getName());
			pStatement.setInt(3, emp.getSalary());
			
			int result = pStatement.executeUpdate();
			
			if(result>0)
			{
				System.out.println("Inserted Sussussfully!!!");
			}
			else
			{
				System.out.println("Insertion Failed!!!");
			}

			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public void update()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbdemo","root","root");
			System.out.println("Connection Successful!!!");
			
			System.out.println("Update Data:-");
			
			Scanner sc=new Scanner(System.in);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDemo emp=new EmployeeDemo();
		
		emp.Insert();
		

	}

}
