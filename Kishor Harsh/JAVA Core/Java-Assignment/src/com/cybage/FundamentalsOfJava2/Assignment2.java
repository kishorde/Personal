package com.cybage.FundamentalsOfJava2;

//Create an array of Employees & display nos. of Employee objects created.
class Employee
{
	int empId;
	String name;
	Employee(int empId,String name)
	{
		this.empId=empId;
		this.name=name;
	}
	
	static int obj=0;
	public void objectCount()
	{
		System.out.println(obj++);
		
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp[]=new Employee[5];
		
		emp[0]=new Employee(1, "Kishor");
		emp[1]=new Employee(2, "Kishor1");
		
		emp.objectCount();
		
		
		

	}

}