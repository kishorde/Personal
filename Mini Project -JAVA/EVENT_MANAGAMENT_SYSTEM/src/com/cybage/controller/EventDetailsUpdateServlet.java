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

import com.cybage.model.EventDetails;
import com.cybage.service.EventDetailsService;
import com.cybage.service.EventDetailsServiceImpl;

/**
 * Servlet implementation class EventDetailsUpdateServlet
 */
@WebServlet("/EventDetailsUpdateServlet")
public class EventDetailsUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	EventDetailsService eventdetailsservice=new EventDetailsServiceImpl(); 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int eventId = Integer.parseInt(request.getParameter("id"));
		PrintWriter out = response.getWriter();
		out.print(eventId);

		EventDetails eventdetails = eventdetailsservice.getEventByIdForUpdate(eventId);

		System.out.println(eventdetails.toString());
		
		request.setAttribute("eventdetails", eventdetails);
		RequestDispatcher rs = request.getRequestDispatcher("updateEventDetails.jsp");
		rs.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EventDetails eventdetails=new EventDetails();
//		eventdetails.setCategoryId( Integer.parseInt(request.getParameter("categoryId")));
//		eventdetails.setCategoryName(request.getParameter("categoryName"));
		
		System.out.println(request.getParameter("eventId"));
		eventdetails.setEventId(Integer.parseInt(request.getParameter("eventId")));
		eventdetails.setEventName(request.getParameter("eventName"));
		eventdetails.setEventCity(request.getParameter("eventCity"));
		eventdetails.setEventDate(request.getParameter("eventDate"));
		eventdetails.setEventPrice(Integer.parseInt(request.getParameter("eventPrice")));
		
		boolean flag= eventdetailsservice.updateEventDetails(eventdetails);
	
		if(flag)
		{
			response.sendRedirect("EventDetailsViewServlet");
			System.out.println("updatedddddddd");
			
		}
		else
		{
			System.out.println("errorrrrrrrrrr");
		}
	}

}
