package com.cyabage.FunamentalsOfJava1;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scObj = new Scanner(System.in);

		System.out.println("Enter 6 digit number : ");
		int input = scObj.nextInt();

		int a = input / 100000;
		int b = (input / 10000) % 10;
		int c = (input / 1000) % 10;
		int d = (input / 100) % 10;
		int e = (input / 10) % 10;
		int f = input % 10;

		System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);

	}

}
