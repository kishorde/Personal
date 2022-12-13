package com.cybage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.EventDetails;
import com.cybage.service.EventDetailsService;
import com.cybage.service.EventDetailsServiceImpl;

/**
 * Servlet implementation class eventDetailsViewServlet
 */
@WebServlet("/eventDetailsViewServlet")
public class eventDetailsViewServlet extends HttpServlet {
	
	EventDetailsService eventdetailsservice=new EventDetailsServiceImpl(); 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int a=1;
		List<EventDetails> eventList = eventdetailsservice.getAllEventDetails(a);
		request.setAttribute("eventlist",eventList);

		RequestDispatcher resultset=request.getRequestDispatcher("viewEvent.jsp");
		resultset.forward(request, response);}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
