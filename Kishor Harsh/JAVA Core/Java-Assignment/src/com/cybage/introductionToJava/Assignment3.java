package com.cybage.introductionToJava;

import com.*;
import com.cybage.Demo.Help;

class One
{
	private int num=1;
	
	private void shownum()
	{
		System.out.println("num value is: "+num);
	}
}
class Two
{
	public int num=2;
	
	public void shownum()
	{
		System.out.println("num value is: "+num);
	}
}

class Three extends Help 
{
	
	protected int num=3;
	protected void shownum()
	{
		System.out.println("num value is: "+num);
	}
}

class Four
{
	int num=4;
	void shownum()
	{
		System.out.println("num value is: "+num);
	}
}


public class Assignment3 extends Help{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		One obj1=new One();
//		System.out.println(obj1.num);
//		obj1.shownum();
		
		Two obj2=new Two();
		System.out.println(obj2.num);
		obj2.shownum();
		
		Three obj3=new Three();
		System.out.println(obj3.num);
		obj3.shownum();
//		obj3.display();
		
		Four obj4=new Four();
		System.out.println(obj4.num);
		obj3.shownum();
		
			
		
		
		
		
			
	}

}
