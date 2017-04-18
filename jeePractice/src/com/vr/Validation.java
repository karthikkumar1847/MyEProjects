package com.vr;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validation
 */
@WebServlet("/Validation")
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	public static boolean isFieldBlank(String s){
		return s.length()<2 ||s.length()>20;
	}

	public static boolean checkCharSet(String s){
		return !s.matches("[a-zA-Z]+");
	}
	
	public static boolean checkNumber(String s){
		return !s.matches("[0-9]+");
	}
}
