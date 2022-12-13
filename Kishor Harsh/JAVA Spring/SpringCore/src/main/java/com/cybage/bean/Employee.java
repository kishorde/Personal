package com.cybage.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
	
	private int employeeId;
	private String name;
	private int salary;
	
	public Employee()
	{
		
	}
		
	public Employee(int employeeId, String name, int salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		System.out.println("Employee Constructor.......");
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("after constructor");
	}
	
	@PreDestroy
	public void BeforeDestroy()
	{
		System.out.println("before constructor");
	}
	
	
	
	
}
