package com.cybage.jdbc;

public class Student {

	private int id;
	private String address,name;
	
	
	
	public Student(int id, String name,String address) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", address=" + address + ", name=" + name + "]";
	}
	
	
	
}
