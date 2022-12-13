package com.cybage.sessionManagement;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookiesDemo
 */
@WebServlet("/CookiesDemo")
public class CookiesDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies!=null)
		{
			for(Cookie cookie:cookies)
//				System.out.println(" cookies = "+cookie);
			System.out.println("cookie value : "+cookie.getValue()+"\ncookie name : "+cookie.getName());
			
		}
		else
		{
			Cookie cookie = new Cookie("sessionId","898@99#123");

			cookie.setMaxAge(0);
			response.addCookie(cookie);
			System.out.println("1st request");
		}
		
		
	}

}
