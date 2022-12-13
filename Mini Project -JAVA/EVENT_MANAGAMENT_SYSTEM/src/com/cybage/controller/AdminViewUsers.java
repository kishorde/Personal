package com.cybage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.AdminCategory;
import com.cybage.model.Registration;
import com.cybage.service.RegistrationService;
import com.cybage.service.RegistrationServiceImpl;

/**
 * Servlet implementation class AdminViewUsers
 */
@WebServlet("/AdminViewUsers")
public class AdminViewUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	RegistrationService registrationservice = new RegistrationServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Registration> userlist=registrationservice.getAllUsers();
		
		request.setAttribute("userlist",userlist);

		RequestDispatcher rs=request.getRequestDispatcher("viewUsers.jsp");
		rs.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
