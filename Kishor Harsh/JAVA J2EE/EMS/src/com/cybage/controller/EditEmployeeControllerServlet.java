package com.cybage.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.bean.Employee;
import com.cybage.service.EmployeeService;
import com.cybage.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EditEmployeeControllerServlet
 */
@WebServlet("/EditEmployeeControllerServlet")
public class EditEmployeeControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	EmployeeService employeeservice = new EmployeeServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// u
		int empId = Integer.parseInt(request.getParameter("id"));
		PrintWriter out = response.getWriter();
		out.print(empId);
//		System.out.println("id = "+empid);

		Employee employee = employeeservice.getEmployeeById(empId);
		System.out.println("emp="+employee);

		request.setAttribute("empl", employee);
		RequestDispatcher rs = request.getRequestDispatcher("editEmployee.jsp");
		rs.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Employee employee=new Employee();
		
		employee.setId(Integer.parseInt(request.getParameter("id")));
		employee.setName(request.getParameter("name"));
		employee.setSalary(Integer.parseInt(request.getParameter("salary")));
		
		employeeservice.updateEmployee(employee);
	}

}
