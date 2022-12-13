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

import com.cybage.model.Booking;
import com.cybage.service.BookingService;
import com.cybage.service.BookingServiceImpl;

/**
 * Servlet implementation class ViewOrganizerBookedEvents
 */
@WebServlet("/ViewOrganizerBookedEvents")
public class ViewOrganizerBookedEvents extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BookingService bookingservice=new BookingServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		int id = (int)(session.getAttribute("userId"));
		System.out.println("ID= "+id); 
		List<Booking> bookingOrglist = bookingservice.getBookedEventDetailsByOrganizerId(id);
		
//		System.out.println(bookingOrglist.toString());
		request.setAttribute("bookingOrglist",bookingOrglist);

		
		RequestDispatcher resultset=request.getRequestDispatcher("OrgEventBookedList.jsp");
		resultset.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
