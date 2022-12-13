package com.cybage.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.model.EventDetails;
import com.cybage.model.Registration;
import com.cybage.service.RegistrationService;
import com.cybage.service.RegistrationServiceImpl;

/**
 * Servlet implementation class UserProfileUpdateServlet
 */
@WebServlet("/UserProfileUpdateServlet")
public class UserProfileUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	RegistrationService registrationservice = new RegistrationServiceImpl();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		  int userId = Integer.parseInt(request.getParameter("id")); 
		HttpSession session= request.getSession();
		
		int userId= (int) session.getAttribute("userId");
		System.out.println("userId in get:"+userId);
		  
		  Registration userDetails = registrationservice.getUserProfileDetailsById(userId);
		  
		  System.out.println(userDetails.toString());
		  
		  request.setAttribute("userDetails", userDetails); 
		  RequestDispatcher rs = request.getRequestDispatcher("updateUserProfile.jsp"); 
		  rs.forward(request,response);
		 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Registration user=new Registration();
//		eventdetails.setCategoryId( Integer.parseInt(request.getParameter("categoryId")));
//		eventdetails.setCategoryName(request.getParameter("categoryName"));
		
		System.out.println(request.getParameter("eventId"));
		user.setUserID(Integer.parseInt(request.getParameter("userId")));
		user.setName(request.getParameter("userName"));
		user.setEmail(request.getParameter("userEmail"));
		user.setPassword(request.getParameter("userPassword"));
		user.setContact(request.getParameter("userContact"));
		
		boolean flag= registrationservice.updateUserProfile(user);
	
		if(flag)
		{
			
			System.out.println("updatedddddddd");
		}
		else
		{
			System.out.println("errorrrrrrrrrr");
		}
	}

}
