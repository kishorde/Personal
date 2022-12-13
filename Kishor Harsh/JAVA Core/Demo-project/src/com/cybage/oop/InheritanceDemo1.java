// In one file different classes 


package com.cybage.oop;

class newPerson {

	private String name;
	private String address;
	
	newPerson(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getAddress()
	{
		return this.address;
	}
}


class newStudent extends newPerson{
	private int rollNo;
	private int marks;
	
	newStudent(String name,String address,int rollNo,int marks)
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



public class InheritanceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newPerson person1=new newPerson("Kishor","Osmanabad");
		System.out.println(person1.getName()+" "+person1.getAddress());

		
		// sub class object (or child class)
		newStudent student1=new newStudent("Chikuu","Kolhapur",27573,100);
		System.out.println(student1.getName()+" "+student1.getAddress()+" "+student1.getRollNo()+" "+student1.getMarks());
	

	}

}
