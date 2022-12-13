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
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session=request.getSession();
		session.invalidate();
		
//		response.sendRedirect("LoginSession.html");	// we can logout like this also
		
		
		// after invalidate session gets closed so we cant get uName vale
		// it will throw error.
		PrintWriter out=response.getWriter();
		out.println("Hello"+session.getAttribute("uName"));
		
		
		// line 26 and below code is for same purpose
		//used for opening another page
		RequestDispatcher dispatcher=request.getRequestDispatcher("LoginSession.html");
		dispatcher.include(request, response);
		
		
		
	
	}

}
