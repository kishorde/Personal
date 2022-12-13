package com.cyabage.FunamentalsOfJava1;

class Employee {
	private String name;
	private int empId;

	Employee() {
		System.out.println("Default Constructor");
	}

	Employee(String name, int empId) {
		this.name = name;
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();

		Employee emp1 = new Employee("Kishor", 275);

		System.out.println("Emp Id: " + emp1.getEmpId());
		System.out.println("Emp Name :" + emp1.getName());

	}

}
