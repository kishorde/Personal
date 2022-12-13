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

import com.cybage.model.AdminCategory;
import com.cybage.service.AdminCategoryService;
import com.cybage.service.AdminCategoryServiceImpl;

/**
 * Servlet implementation class AdminCategoryAddServlet
 */
@WebServlet("/AdminCategoryAddServlet")
public class AdminCategoryAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AdminCategoryService admincategoryservice = new AdminCategoryServiceImpl();
	   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<AdminCategory> organizereventdetailslist = admincategoryservice.getAllCategory();
		//ServletContext context = request.getServletContext();
		
		request.setAttribute("eventdetails", organizereventdetailslist);
		
		PrintWriter out = response.getWriter();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("addCategory.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AdminCategory admincategory = new AdminCategory();

		admincategory.setCategoryName(request.getParameter("cname"));
		

		boolean flag = admincategoryservice.addCategory(admincategory);
		
		if (flag) 
		{
			System.out.println("Category added successfully");
			response.sendRedirect("AdminCategoryAdd");
		} else {
			System.out.println(" error in servlet");
		}
	}
	

}








