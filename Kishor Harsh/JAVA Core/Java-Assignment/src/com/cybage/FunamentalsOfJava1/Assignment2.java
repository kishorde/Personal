package com.cyabage.FunamentalsOfJava1;

//class Date.  Overload constructor to initialize attributes.
//Create Date objects using non-parameterized & parameterized constructors both.
//Print values of day, month & year for every object.(Date)

class Date {
	int day;
	String month;
	int year;

	Date() {
		System.out.println("Empty Date");
	}

	Date(int day, String month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	Date(int day) {
		this.day = day;
	}

	Date(String month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();

		Date date1 = new Date(03, "August", 2000);
		System.out.println(date1.toString());

		Date date2 = new Date(10, "September", 2022);
		System.out.println(date2.toString());

		Date date3 = new Date(22);
		System.out.println(date3.toString());

		Date date4 = new Date("March");
		System.out.println(date4.toString());

	}

}
