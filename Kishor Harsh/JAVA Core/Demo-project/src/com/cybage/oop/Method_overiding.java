package com.cybage.oop;


class new1Person {

	private String name;
	private String address;
	
	new1Person(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	
//	public String getName()
//	{
//		return this.name;
//	}
//	
//	public String getAddress()
//	{
//		return this.address;
//	}
	
	public String getInfo()
	{
		return this.name + " " +this.address;
	}
}


class new1Student extends new1Person{
	private int rollNo;
	private int marks;
	
	new1Student(String name,String address,int rollNo,int marks)
	{
		super(name,address);
		this.rollNo=rollNo;
		this.marks=marks;                                                              
	}

//	public int getRollNo()
//	{
//		return this.rollNo;
//	}
//	
//	public int getMarks()
//	{
//		return this.marks;
//	}
	
	
	@Override
	public String getInfo()
	{
		
		return super.getInfo()+" " +this.rollNo + " " +this.marks;
	}

	
}







public class Method_overiding {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new1Person person1=new new1Person("Kishor","Osmanabad");
//			System.out.println(person1.getName()+" "+person1.getAddress());
			System.out.println(person1.getInfo());
			
			// sub class object (or child class)
			new1Student student1=new new1Student("Chikuu","Kolhapur",27573,100);
			//System.out.println(student1.getName()+" "+student1.getAddress()+" "+student1.getRollNo()+" "+student1.getMarks());
			System.out.println(student1.getInfo());
			
			new1Person p=new new1Student("Harsh","Nagpur",201,99);
			
			System.out.println(p.getInfo());
			
			
			
	}

}
