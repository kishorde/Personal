package com.cybage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.service.EventDetailsService;
import com.cybage.service.EventDetailsServiceImpl;

/**
 * Servlet implementation class eventDetailsDeleteServlet
 */
@WebServlet("/eventDetailsDeleteServlet")
public class eventDetailsDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	EventDetailsService eventdetailservice=new EventDetailsServiceImpl();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		
		
		eventdetailservice.deleteEventDetails(id);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
