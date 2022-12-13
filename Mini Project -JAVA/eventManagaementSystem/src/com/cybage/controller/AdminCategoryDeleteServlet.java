package com.cybage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.service.AdminCategoryService;
import com.cybage.service.AdminCategoryServiceImpl;

/**
 * Servlet implementation class AdminCategoryDeleteServlet
 */
@WebServlet("/AdminCategoryDeleteServlet")
public class AdminCategoryDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	AdminCategoryService admincategoryservice=new AdminCategoryServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=(Integer.parseInt(request.getParameter("id")));
		
		boolean flag = admincategoryservice.deleteCategory(id);
		
		if (flag) {
			System.out.println("Record deleted successfully");
			response.sendRedirect("AdminCategoryViewServlet");
		} else {
			
			System.out.println("Some error");
		}
		}

}
