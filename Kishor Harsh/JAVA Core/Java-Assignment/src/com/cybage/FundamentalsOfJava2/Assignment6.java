package com.cybage.FundamentalsOfJava2;

//Assignment # 6
//Write a program to calculate area of triangle. Use PI value using static import

import static java.lang.Math.PI;

import java.util.Scanner;

class Circle
{
	static float getPI()
	{
		return (float) PI;
	}
}

public class Assignment6 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Circle.getPI());
		
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter base of triangle");
		int base=sc.nextInt();
		
		System.out.println("Enter height of Triangle");
		int height=sc.nextInt();
		
		
		System.out.println("Area of Triangle: "+0.5*base*height);
		

	}

}
