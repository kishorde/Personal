package com.cybage.exception;

public class ThrowDemo {
	
	
	public static void demo()
	{
		
		System.out.println("Inside Demo");
		
//		try {
		int a=10/0;
		System.out.println("a="+a);
//		}
//		catch (ArithmeticException e)
//		{
//			e.printStackTrace();
//		}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		try
//		{
//			throw new NullPointerException();
//		}
//		catch (NullPointerException e)
//		{
//			e.printStackTrace();
//		}
		
		try {
		demo();
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("After catch");
	}

}
