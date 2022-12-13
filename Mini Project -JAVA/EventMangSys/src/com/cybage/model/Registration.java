package com.cybage.model;

public class Registration {

	int userID;
	String name;
	String email;
	String password;
	String role;
	String contact;
	
	public Registration()
	{
		
	}
	
	
	public Registration(int userID, String name, String email, String password, String role, String contact) {
		super();
		this.userID = userID;
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
		this.contact = contact;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	
}
