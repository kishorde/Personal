package com.cybage.dao;

import java.util.List;

import com.cybage.bean.Employee;

public interface EmployeeDAO {
	
	public boolean add(Employee employee);
	public Employee getEmployeeById(int empId);
	public List<Employee> getAllEmployees();
	public boolean deleteEmployee(int empId);
	boolean updateEmployee(Employee employee);

}
