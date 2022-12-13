package com.cybage.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.Employee;

/**
 * Servlet implementation class employeeServlet
 */
@WebServlet("/employeeServlet")
public class employeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Kishor",20000));
		employees.add(new Employee(2,"chicku",45000));
		employees.add(new Employee(3,"ujwal",35000));
		employees.add(new Employee(4,"harsh",25000));
		employees.add(new Employee(5,"shrikant",15000));
		
		ServletContext context=getServletContext();
		context.setAttribute("empList", employees);
		
		response.sendRedirect("employee.jsp");
		
	}


}
