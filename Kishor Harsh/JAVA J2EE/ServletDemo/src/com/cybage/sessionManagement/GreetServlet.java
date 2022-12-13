package com.cybage.sessionManagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GreetServlet
 */
@WebServlet("/GreetServlet")
public class GreetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		System.out.println("This is a new : "+session.isNew());	// returns true or false
		
		out.println("<h1>Welcome : "+session.getAttribute("uName")+"</h1>");
		out.println("<a href='TestServlet'>Click here</a>");
	}

}
