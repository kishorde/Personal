package com.cybage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.service.EmployeeService;
import com.cybage.service.EmployeeServiceImpl;

/**
 * Servlet implementation class DeleteControllerServlet
 */
@WebServlet("/DeleteControllerServlet")
public class DeleteControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	EmployeeService employeeservice = new EmployeeServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		
		employeeservice.deleteEmployee(id);
		System.out.println("delete");

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
