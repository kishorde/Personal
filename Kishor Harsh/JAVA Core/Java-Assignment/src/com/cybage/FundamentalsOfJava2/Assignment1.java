package com.cybage.FundamentalsOfJava2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//Write a Java program to get the last date of the month also  get current full date and time.(use java 8 date time api)


public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		System.out.println("Current date is "+date);

		LocalTime time=LocalTime.now();
		System.out.println("Current time is "+time);
		
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println("Current date and time common : "+datetime);
	}

}
