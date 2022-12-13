package com.cybage.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.AdminCategory;
import com.cybage.service.AdminService;
import com.cybage.service.AdminServiceImpl;

/**
 * Servlet implementation class AdminCategoryUpdateServlet
 */
@WebServlet("/AdminCategoryUpdateServlet")
public class AdminCategoryUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	AdminService adminservice=new AdminServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		int categoryId = Integer.parseInt(request.getParameter("id"));
		
		AdminCategory admincategory = adminservice.getCategoryById(categoryId);

		request.setAttribute("admincategory", admincategory);
		RequestDispatcher rs = request.getRequestDispatcher("updateCategory.jsp");
		rs.forward(request, response);

	}
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		AdminCategory admincategory=new AdminCategory();
		
		admincategory.setCategoryId( Integer.parseInt(request.getParameter("categoryId")));
		admincategory.setCategoryName(request.getParameter("categoryName"));
		
		adminservice.updateCategory(admincategory);
		

		response.sendRedirect("AdminCategoryViewServlet");

	}
}
