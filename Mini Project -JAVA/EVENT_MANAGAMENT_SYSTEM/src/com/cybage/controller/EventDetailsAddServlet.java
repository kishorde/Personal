package com.cybage.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.model.AdminCategory;
import com.cybage.model.EventDetails;
import com.cybage.service.AdminService;
import com.cybage.service.AdminServiceImpl;
import com.cybage.service.EventDetailsService;
import com.cybage.service.EventDetailsServiceImpl;

/**
 * Servlet implementation class EventDetailsAddServlet
 */
@WebServlet("/EventDetailsAddServlet")
public class EventDetailsAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	EventDetailsService eventdetailsservice=new EventDetailsServiceImpl(); 
	
	AdminService adminservice=new AdminServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<AdminCategory> categoryList = adminservice.getAllCategory();
		
//		request.setAttribute("categoryList",categoryList);
		
		ServletContext context=getServletContext();
		context.setAttribute("categoryList", categoryList);
		
//		response.sendRedirect("addEvent.jsp");
		
		RequestDispatcher rs=request.getRequestDispatcher("addEvent.jsp");
		rs.forward(request, response);	
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		EventDetails eventdetails=new EventDetails();
		
		PrintWriter out=response.getWriter();
		HttpSession session= request.getSession();
		int orgId = (int) session.getAttribute("userId");
		
		
		eventdetails.setEventOrganizerId(orgId);
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
			System.out.println("event inserted successfully!");
			
			response.sendRedirect("EventDetailsViewServlet");
		}
		else
		{
			System.out.println("Error in insertion");
		}
	}

}

