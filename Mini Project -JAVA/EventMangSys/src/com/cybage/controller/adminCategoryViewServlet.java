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
import com.cybage.service.AdminService;
import com.cybage.service.AdminServiceImpl;

/**
 * Servlet implementation class adminCategoryServlet
 */
@WebServlet("/adminCategoryServlet")
public class adminCategoryViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	AdminService adminservice=new AdminServiceImpl();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<AdminCategory> categoryList=adminservice.getAllCategory();
		request.setAttribute("categoryList",categoryList);

		RequestDispatcher rs=request.getRequestDispatcher("viewCategory.jsp");
		rs.forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
