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
import com.cybage.service.AdminService;
import com.cybage.service.AdminServiceImpl;

/**
 * Servlet implementation class AdminCategoryAddServlet
 */
@WebServlet("/AdminCategoryAddServlet")
public class AdminCategoryAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	AdminService adminservice=new AdminServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		RequestDispatcher requestdispatcher=request.getRequestDispatcher("AdminCategoryViewServlet");
		requestdispatcher.forward(request, response);	
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AdminCategory admincategory=new AdminCategory();

		admincategory.setCategoryName(request.getParameter("eventCategory"));
		
		boolean check=adminservice.addCategory(admincategory);
		
		if(check)
		{
			System.out.println("Record inserted successfully!");
			
//			RequestDispatcher rs=request.getRequestDispatcher("AdminCategoryAddServlet");
//			rs.forward(request, response);
			
			response.sendRedirect("AdminCategoryViewServlet");
			
		}
		else
		{
			System.out.println("Error in insertion");
		}
	}

}
