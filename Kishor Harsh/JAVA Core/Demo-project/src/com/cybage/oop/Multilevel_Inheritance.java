package com.cybage.oop;

class X
{
	
	X(){
		System.out.println("X Const");
	}
}
class Y extends X
{
	
	Y()
	{
//		super(a);
		System.out.println("Y Const");
	}
}
class Z extends Y
{
	
	Z()
	{
//		super(a);
		System.out.println("z Const");
	}
}

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Z z=new Z();

	}

}
