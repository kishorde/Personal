package com.cybage.service;

import java.util.List;

import com.cybage.bean.Employee;
import com.cybage.dao.EmployeeDAO;
import com.cybage.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO employeedao=new EmployeeDAOImpl();
	
	@Override
	public boolean add(Employee employee) {
		// TODO Auto-generated method stub
		return employeedao.add(employee);
	}

	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return employeedao.getEmployeeById(empId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeedao.getAllEmployees();
	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return employeedao.deleteEmployee(empId);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeedao.updateEmployee(employee);
	}

}
