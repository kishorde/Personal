package com.cyabage.FunamentalsOfJava1;

import java.util.Scanner;

//Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
//Test Data
//Input an integer between 0 and 1000: 565
//Expected Output :
//The sum of all digits in 565 is 16(SumOfDigit)

public class Assignment3 {

	public static void main(String[] args) {
		Scanner scObj = new Scanner(System.in);

		System.out.print("Enter number :");
		int input = scObj.nextInt();

		int temp = input;
		int num, sum = 0;

		if (input > 0 && input < 1000) {
			while (input > 0) {
				num = input % 10;
				sum = sum + num;
				input = input / 10;
			}
			System.out.println("The sum of all digits in " + temp + " is " + sum);
		} else {
			System.out.println("Invalid input!!!");
		}
	}
}
