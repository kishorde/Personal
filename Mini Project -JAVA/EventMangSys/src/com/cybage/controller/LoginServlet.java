package com.cybage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.model.Registration;
import com.cybage.service.RegistrationService;
import com.cybage.service.RegistrationServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	RegistrationService registrationservice=new RegistrationServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Registration users = new Registration();
		
		users.setEmail(email);
		users.setPassword(password);
		
		registrationservice.userLogin(users);
		
		HttpSession session= request.getSession();
		
		session.setAttribute("userId",users.getUserID());
		session.setAttribute("userName", users.getName());
		session.setAttribute("userEmail", users.getEmail());
		session.setAttribute("userMobile", users.getContact());
		session.setAttribute("userRole", users.getRole());
		
//		System.out.println("NAME = " + users.getUserName());
		
		if(email.equals("Admin") && password.equals("admin"))
		{
			response.sendRedirect("addCategory.jsp");
		}
		else if(users.getRole().equals("User"))
		{
			response.sendRedirect("UserPage.jsp");
		}
		else if(users.getRole().contentEquals("Organizer")) {
			response.sendRedirect("OrganizerPage.jsp");
		}
		
		
	}

}
