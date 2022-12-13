package com.cybage.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.model.Booking;
import com.cybage.model.EventDetails;
import com.cybage.service.BookingService;
import com.cybage.service.BookingServiceImpl;

/**
 * Servlet implementation class BookingServlet
 */
@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	BookingService bookingservice=new BookingServiceImpl();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Booking bookevent=new Booking();
		
		PrintWriter out=response.getWriter();
		HttpSession session= request.getSession();
		int userId = (int) session.getAttribute("userId");
//		
		
		System.out.println(userId );
		
		bookevent.setUserId(userId);;
		bookevent.setOrganizerId(Integer.parseInt(request.getParameter("organizerId")));
		bookevent.setEventId(Integer.parseInt(request.getParameter("eventId")));
		
		System.out.println("orgid"+Integer.parseInt(request.getParameter("organizerId")));
		System.out.println("id"+Integer.parseInt(request.getParameter("eventId")));
		
//		bookevent.setEventId(eventId);
		
		
//		HttpSession session=request.getSession();
//		session.setAttribute("mangid", );
		
		boolean flag = bookingservice.BookEvent(bookevent);
		
		if(flag)
		{
			response.sendRedirect("UserViewEvents");
			System.out.println("event inserted successfully!");
		}
		else
		{
			System.out.println("Error in insertion");
		}
		
	}

}
