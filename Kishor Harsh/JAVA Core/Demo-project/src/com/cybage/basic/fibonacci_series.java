package com.cybage.basic;

public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		int n1=0;
		int n2=1;
		int val;
		
		for(int i=0;i<n;i++)
		{
			System.out.print(n1 + " ");
			val=n1+n2;
			n1=n2;
			n2=val;
		}

	}

}
