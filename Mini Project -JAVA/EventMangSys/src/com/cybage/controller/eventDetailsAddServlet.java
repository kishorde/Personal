package com.cybage.controller;

import java.io.IOException;
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

@WebServlet("/eventDetailsServlet")
public class eventDetailsAddServlet extends HttpServlet {
	
	EventDetailsService eventdetailsservice=new EventDetailsServiceImpl(); 
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	
//		List<EventDetails> eventList = eventdetailsservice.getAllEventDetails();
//		request.setAttribute("eventList1",eventList);
//		RequestDispatcher rs=request.getRequestDispatcher("viewEvent.jsp");
//		rs.forward(request, response);
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EventDetails eventdetails=new EventDetails();
		
		eventdetails.setEventName(request.getParameter("eventName"));
		eventdetails.setEventCategory(request.getParameter("eventCategory"));
		eventdetails.setEventCity(request.getParameter("eventCity"));
		eventdetails.setEventDate(request.getParameter("eventDate"));
		eventdetails.setEventPrice(Integer.parseInt(request.getParameter("eventPrice")));
		
//		HttpSession session=request.getSession();
//		session.setAttribute("mangid", );
		
		boolean flag = eventdetailsservice.addEvent(eventdetails);
		
		if(flag)
		{
			System.out.println("Record1 inserted successfully!");
		}
		else
		{
			System.out.println("Error in insertion");
		}
	}

}
