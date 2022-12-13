package com.cybage.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.model.EventDetails;
import com.cybage.service.EventDetailsService;
import com.cybage.service.EventDetailsServiceImpl;

/**
 * Servlet implementation class EventDetailsViewServlet
 */
@WebServlet("/EventDetailsViewServlet")
public class EventDetailsViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	EventDetailsService eventdetailsservice=new EventDetailsServiceImpl(); 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session= request.getSession();
		int id = (int)(session.getAttribute("userId"));
		System.out.println("ID= "+id);
		
		List<EventDetails> eventList = eventdetailsservice.getEventDetailsById(id);
		request.setAttribute("eventlist",eventList);

		RequestDispatcher resultset=request.getRequestDispatcher("viewEvent.jsp");
		resultset.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
