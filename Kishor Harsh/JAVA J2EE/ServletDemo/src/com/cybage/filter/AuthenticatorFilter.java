package com.cybage.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class AuthenticatorFilter
 */
@WebFilter("/Login")
public class AuthenticatorFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthenticatorFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		
		PrintWriter out = response.getWriter();
		String pass =request.getParameter("password");
		
		if(pass.equals("1234"))
		{
			chain.doFilter(request, response);
		}
		else
		{
			out.println("You have entered wrong password");
			RequestDispatcher rs=request.getRequestDispatcher("login.html");
			rs.include(request, response);
		}
			
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
