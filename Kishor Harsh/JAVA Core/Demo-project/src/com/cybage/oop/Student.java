package com.cybage.oop;

public class Student extends Person{
	private int rollNo;
	private int marks;
	
	Student(String name,String address,int rollNo,int marks)
	{
		super(name,address);
		this.rollNo=rollNo;
		this.marks=marks;                                                              
	}

	public int getRollNo()
	{
		return this.rollNo;
	}
	
	public int getMarks()
	{
		return this.marks;
	}
	
}
