package com.rv.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		PrintWriter out=response.getWriter();
		if(uname.equals("ramesh") && pwd.equals("ramesh"))
		{
			response.sendError(200,"welcome..!!");
		}
		else
		{
			//response.sendError(400,"Wrong Id or Password");
			out.println("Wrong Id or Password");
			RequestDispatcher rd=request.getRequestDispatcher("html/login.html");
			   rd.include(request, response);
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
