package com.cyabage.FunamentalsOfJava1;

//Write a Java method to display the middle character of a string. 
//Note: a) If the length of the string is odd there will be two middle characters.
//b) If the length of the string is even there will be one middle character. (MiddleChar)

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "kishorde";
		int len = str.length();

		if (len % 2 == 0) {
			System.out.println("length of string is even");
			System.out.println("Middle char is : " + str.charAt((len - 1) / 2) + str.charAt(len / 2));
		} else {
			System.out.println("length of string is odd");
			System.out.println("Middle char is : " + str.charAt(len / 2));

		}

	}

}