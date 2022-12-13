package com.cybage.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/Login")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();		//for printing response in page created object
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
//		
		
		if(username.equals("Kishor") && password.equals("1234"))
		{
//			out.print("<h1>"+"Welcome "+username+"</h1>");
			/*
			ServletContext context =getServletContext();
			
			context.setAttribute("uname", username); 	//seting uname value as username so that we can access it in welcomeservlet
			
			response.sendRedirect("WelcomeServlet");*/
			
			
			
			//Request Dispatcher : 2 methods
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("WelcomeServlet");	//to which page we want to forward
			dispatcher.forward(request, response);
			
		}
		else
		{
			
			out.print("invalid credential");
			RequestDispatcher dispatcher=request.getRequestDispatcher("login.html");
			dispatcher.include(request, response);
		}
		
		
//		System.out.println(username);
//		System.out.println(password);
	}

}
