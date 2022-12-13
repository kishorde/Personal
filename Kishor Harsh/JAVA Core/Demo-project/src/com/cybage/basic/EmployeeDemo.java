package com.cybage.basic;
import java.util.*;

class Employee
{
	int employeeId;
	String name;
	static String msg;
	
	
	
//	public Employee()			// default constructor
//	{
//		System.out.println("hey");
//	}
	
//	public Employee(int employeeId1,String name1)	// paramter 
//	{
//		employeeId=employeeId1;
//		name=name1;
//	}

	
	
	
	public Employee(int employeeId,String name)	// paramter 
	{
//		this.employeeId=employeeId;
		this(employeeId);
		this.name=name;
	}
	
	
	public Employee(int employeeId)
	{
		this.employeeId=employeeId;
	}

	String getEmployeeInfo()
	{
		return "Employee Id :"+employeeId + "\n" +"Employee Name : "+name;
	}
	
	// static method:
	static  void displayMsg()
	{
		System.out.println(msg);
	}
}


public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee emp=new Employee(27590,"Kishor Deshmukh");
		
		Employee emp1=new Employee(27591,"Abhishek");
		Employee emp2=new Employee(27592,"Sanskruti");
		
//		emp.employeeId=4;
//		emp.name="Abhishek";
		
		System.out.println(emp.getEmployeeInfo());	
//		Employee.msg = "Kishor"; // Static 
		
		System.out.println(emp1.getEmployeeInfo());
		System.out.println(emp2.getEmployeeInfo());
		
		Employee.msg="hello from java";
		Employee.displayMsg();
		
		Employee.msg="Modified java";
		Employee.displayMsg();
		
		
		
		
		// array of object
		System.out.println("\n Emp Info : ");
		
		Employee employees[]=new Employee[5];
		
		employees[0]=new Employee(1001,"john");
		employees[1]=new Employee(2001,"chiku");
		employees[2]=new Employee(3001,"siku");
		employees[3]=new Employee(4001,"miku");
		employees[4]=new Employee(5001,"piku");
		
		for(Employee e:employees)
		{
			System.out.println(e.getEmployeeInfo());
		}
		
		
		
//		for(int i=0;i<employees.length;i++)
//		{
//			System.out.println(employees.getEmployeeInfo());
//		}
		
		Date d = new Date();
		System.out.println("date: " + d);
		
	}

}
