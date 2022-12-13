package com.cybage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.AdminCategory;
import com.cybage.model.EventDetails;
import com.cybage.service.AdminService;
import com.cybage.service.AdminServiceImpl;

/**
 * Servlet implementation class adminCategory
 */
@WebServlet("/adminCategoryServlet")
public class adminCategoryServlet extends HttpServlet {
	
	AdminService adminservice=new AdminServiceImpl();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<AdminCategory> categoryList = adminservice.getAllCategory();
		
//		request.setAttribute("categoryList",categoryList);
		
		ServletContext context=getServletContext();
		context.setAttribute("categoryList", categoryList);
		
//		response.sendRedirect("addEvent.jsp");
		
		RequestDispatcher rs=request.getRequestDispatcher("addEvent.jsp");
		rs.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		AdminCategory admincategory=new AdminCategory();

		admincategory.setCategoryName(request.getParameter("eventCategory"));
		
		boolean check=adminservice.addCategory(admincategory);
		
		if(check)
		{
			System.out.println("Record inserted successfully!");
//			RequestDispatcher rs=request.getRequestDispatcher("adminCategoryViewServlet");
//			rs.forward(request, response);
			
			response.sendRedirect("adminCategoryViewServlet");
			
		}
		else
		{
			System.out.println("Error in insertion");
		}
	}

}
