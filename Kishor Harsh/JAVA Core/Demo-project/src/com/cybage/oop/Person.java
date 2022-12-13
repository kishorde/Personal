package com.cybage.oop;

public class Person {

	private String name;
	private String address;
	
	Person(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getAddress()
	{
		return this.address;
	}
}
