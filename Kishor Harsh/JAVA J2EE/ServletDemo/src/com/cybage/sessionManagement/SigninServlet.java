package com.cybage.sessionManagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SigninServlet
 */
@WebServlet("/SigninServlet")
public class SigninServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		HttpSession session=request.getSession();		//request.getSession() will return the session object
		System.out.println("Is session new :"+session.isNew());
		System.out.println("Session Id : "+session.getId());
		System.out.println("Creation time : "+session.getCreationTime());
		System.out.println("Last Access time : "+session.getLastAccessedTime());
		
		session.setMaxInactiveInterval(1000*60 *60); //after 60 min session will automatically get expired if you are not active
		System.out.println();
	
		
		
		
		
		if(username.equals("Kishor") && password.equals("1234"))
		{
			session.setAttribute("uName", username);
			RequestDispatcher dispatcher=request.getRequestDispatcher("GreetServlet");	//to which page we want to forward
			dispatcher.forward(request, response);
			
		}
		else
		{
			out.print("<h1>Invalid credential</h1>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("LoginSession.html");
			dispatcher.include(request, response);
		}
		
		
		
	}

}
