package com.cybage.oop;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// super class object (or parent class)
		
		Person person1=new Person("Kishor","Osmanabad");
		System.out.println(person1.getName()+" "+person1.getAddress());

		
		// sub class object (or child class)
		Student student1=new Student("Chiku","Kolhapur",27573,100);
		System.out.println(student1.getName()+" "+student1.getAddress()+" "+student1.getRollNo()+" "+student1.getMarks());
	}

}
