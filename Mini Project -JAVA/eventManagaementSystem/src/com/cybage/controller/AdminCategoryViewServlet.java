package com.cybage.controller;

import java.io.IOException;
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
 * Servlet implementation class AdminCategoryViewServlet
 */
@WebServlet("/AdminCategoryViewServlet")
public class AdminCategoryViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	AdminCategoryService admincategoryservice=new AdminCategoryServiceImpl();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<AdminCategory> categoryList=admincategoryservice.getAllCategory();
		request.setAttribute("categoryList",categoryList);

		RequestDispatcher rs=request.getRequestDispatcher("viewCategory.jsp");
		rs.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
