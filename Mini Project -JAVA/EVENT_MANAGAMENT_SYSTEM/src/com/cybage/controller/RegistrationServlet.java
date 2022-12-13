package com.cybage.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.EventDetails;
import com.cybage.model.Registration;
import com.cybage.service.RegistrationService;
import com.cybage.service.RegistrationServiceImpl;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	RegistrationService registrationservice = new RegistrationServiceImpl();
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Registration registration=new Registration();
		
		
		
		registration.setName(request.getParameter("username"));
		registration.setEmail(request.getParameter("useremail"));
		registration.setPassword(request.getParameter("userpassword"));
		registration.setRole(request.getParameter("userrole"));
		registration.setContact(request.getParameter("usercontact"));
		
//		HttpSession session=request.getSession();
//		session.setAttribute("mangid", );
		
		boolean flag = registrationservice.AddUser(registration);
		
		if(flag)
		{
			
			RequestDispatcher reqdis=request.getRequestDispatcher("Login.jsp");
			reqdis.forward(request, response);
			
			
		}
		else
		{
			System.out.println("Error in insertion");
		}
		
		
	}

}
