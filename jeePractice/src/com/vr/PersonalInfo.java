package com.vr;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.LinkedHashSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vr.VO.PersonalInfoVO;

@WebServlet("/PersonalInfo")
public class PersonalInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String fn = request.getParameter("fname");
		String ln = request.getParameter("lname");
		String mn = request.getParameter("mname");
		String gender = request.getParameter("gender");
		
		StringBuffer err=new StringBuffer("");
		
		if(Validation.isFieldBlank(fn) || Validation.checkCharSet(fn))
		{
			err.append("Please Enter FirstName length should be 2 to 20 charachers");
		}
		if(Validation.isFieldBlank(ln) || Validation.checkCharSet(ln))
		{
			err.append("Please Enter LastName length should be 2 to 20 charachers");
		}
		if(Validation.isFieldBlank(mn) || Validation.checkCharSet(mn))
		{
			err.append("Please Enter MiddleName length should be 2 to 20 charachers");
		}
		if(gender==null)
		{
			err.append("Please select gender");
		}
		
		HttpSession session = request.getSession();
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		if(err.length()==0)
		{
			/*// creating object for bean class
			PersonalInfoVO pInfoVO = new PersonalInfoVO();
			//setting attributes to bean object using setter methods
			pInfoVO.setFn(fn);
			pInfoVO.setLn(ln);
			pInfoVO.setMn(mn);
			pInfoVO.setGender(gender);
			session.setAttribute("pInfoVO", pInfoVO);*/
			
			//to generate output using jsp
			session.setAttribute("fn", fn);
			session.setAttribute("ln", ln);
			session.setAttribute("mn", mn);
			session.setAttribute("gender", gender);
			response.sendRedirect("html/contactInfo.html");
		}
		else
		{
			out.println(err);
			RequestDispatcher rd=request.getRequestDispatcher("html/PersonalInfo.html");
			   rd.include(request, response);
		}
	}

	
	
	
}
