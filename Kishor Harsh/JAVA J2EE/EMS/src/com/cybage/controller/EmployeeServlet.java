package com.cybage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.bean.Employee;
import com.cybage.service.EmployeeService;
import com.cybage.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	
	EmployeeService employeeservice=new EmployeeServiceImpl();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<Employee> empList = employeeservice.getAllEmployees();
		ServletContext context=request.getServletContext();
		context.setAttribute("empList",	 empList);
//		System.out.println(empList);
		RequestDispatcher rs=request.getRequestDispatcher("displayemployee.jsp");
		rs.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Employee employee=new Employee();
		employee.setId(Integer.parseInt(request.getParameter("id")));
		employee.setName(request.getParameter("name"));
		employee.setSalary(Integer.parseInt(request.getParameter("salary")));
		
		boolean flag = employeeservice.add(employee);
		
		if(flag)
		{
			System.out.println("Record inserted successfully!");
		}
		else
		{
			System.out.println("Error in insertion");
		}
		
				
	}

}
