package com.cybage.exception;

public class ThrowDemo1 {

	public static void method1() {
		int a =10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		
		
	}
	
	public static void method2() {
		try {
			method1();
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method2();

	}

}
