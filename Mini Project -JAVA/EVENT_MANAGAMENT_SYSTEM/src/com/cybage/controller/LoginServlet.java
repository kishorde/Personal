package com.cybage.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Registration users = new Registration();
		
		users.setEmail(email);
		users.setPassword(password);
		
		Registration registration = registrationservice.userLogin(users);
		
		System.out.println("user role : " + registration.getRole());
//		String s =users.setRole(registration.getRole());
		
		
		HttpSession session= request.getSession();
		
		System.out.println("Before setting user id in registration: "+registration.getUserID());
		session.setAttribute("userId",registration.getUserID());
		session.setAttribute("userName", registration.getName());
		session.setAttribute("userEmail", registration.getEmail());
		session.setAttribute("userMobile", registration.getContact());
		
		
		if(email.equals("Admin") && password.equals("admin"))
		{
			response.sendRedirect("adminPage.jsp");
		}
		else if(registration.getEmail().equals(email) && registration.getPassword().equals(password) && registration.getRole().equals("Organizer"))
		{
			response.sendRedirect("organizerPage.jsp");
		}
		else if(registration.getEmail().equals(email) && registration.getPassword().equals(password) && registration.getRole().equals("User")) {
			response.sendRedirect("userPage.jsp");
		}

		
	}

}
