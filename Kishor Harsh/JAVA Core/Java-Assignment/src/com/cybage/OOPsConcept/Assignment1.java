package com.cybage.OOPsConcept;

//Assignment # 1
//Create a class hierarchy:  Employee
//                                               Manager
//                                               SalesManager
// Override calculateSalary() method.  Manager  will have allowance field &
//SalesManager will have  commission field.


class Employee
{
	int salary=50000;
	public int calulateSalary()
	{
		return salary;
	}
}

class Manager extends Employee
{
	int salary=20000;
	@Override
	public int calculateSalary(int allowance)
	{
		return salary*allowance;
	}
}

class SalesManager
{
	
}


public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
