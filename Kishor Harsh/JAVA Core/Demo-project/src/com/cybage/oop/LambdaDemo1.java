package com.cybage.oop;

interface MathOperations
{
	public int add(int n1,int n2);
	
}
public class LambdaDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathOperations addition=(int n1,int n2)->{return n1+n2;};
//		MathOperations addition=(n1,n2)->(n1+n2);	//or
		
		System.out.println(addition.add(50, 20));
		
	}

}
