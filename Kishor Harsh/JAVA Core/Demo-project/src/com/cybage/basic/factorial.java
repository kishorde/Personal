package com.cybage.basic;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6;
		int fact = 1;
		
		for(int i=1;i<=n;i++)
		{
			fact = fact * i;
		}
		
		System.out.println("Factorial is: " + fact);

	}

}
