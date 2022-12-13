package com.cybage.oop;




class AddDemo
{
	int add(int n1,int n2)
	{
		System.out.print("Add int :");
		return n1+n2;
	}
	float add(float n1,float n2)
	{
		System.out.print("Add float :");
		return n1+n2;
	}
	
	double add(double n1,double n2)
	{
		System.out.print("Add double :");
		return n1+n2;
	}
	
	byte add(byte n1,byte n2)
	{
		System.out.print("Add byte :");
		return (byte)(n1+n2);
	}
	
	long add(long n1,long n2)
	{
		System.out.print("Add Long :");
		return n1+n2;
	}
	
	
	
	
}


public class StaticPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddDemo d1=new AddDemo();
		System.out.println(d1.add(4, 5));
		System.out.println(d1.add(6.6f, 5.5f));
		System.out.println(d1.add(4.55555555, 5.1111111));
		System.out.println(d1.add((byte)4, (byte)5));
		System.out.println(d1.add((long)5,(long)6));

	}

}
