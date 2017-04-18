package com.vr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vr.VO.PersonalInfoVO;

@WebServlet("/ContactInfo")
public class ContactInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String addr = request.getParameter("addr");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		String phno = request.getParameter("phno");

		StringBuffer err=new StringBuffer("");
		
		if(Validation.isFieldBlank(addr) || Validation.checkCharSet(addr))
		{
			err.append("Please Enter address length should be 2 to 20 charachers");
		}
		if(Validation.isFieldBlank(city) || Validation.checkCharSet(city))
		{
			err.append("Please Enter city length should be 2 to 20 charachers");
		}
		if(Validation.isFieldBlank(state) || Validation.checkCharSet(state))
		{
			err.append("Please Enter state length should be 2 to 20 charachers");
		}
		if(Validation.isFieldBlank(country) || Validation.checkCharSet(country))
		{
			err.append("Please Enter country length should be 2 to 20 charachers");
		}
		if(Validation.isFieldBlank(phno) || Validation.checkNumber(phno) || phno.length()!=10)
		{
			err.append("Please Enter phone number length should be 10 digits");
		}
		
		HttpSession session =request.getSession();
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		if(err.length()==0)
		{			
			/*//getting bean object exist in seesion 
			PersonalInfoVO pInfoVO=(PersonalInfoVO) session.getAttribute("pInfoVO");
			pInfoVO.setAdd(addr); 
			pInfoVO.setCity(city); 
			pInfoVO.setState(state);
			pInfoVO.setCountry(country); 
			pInfoVO.setPhno(phno);
			session.setAttribute("pInfoVO", pInfoVO);*/
			
			//to generate output using jsp
			session.setAttribute("addr", addr);
			session.setAttribute("city", city);
			session.setAttribute("state", state);
			session.setAttribute("country", country);
			session.setAttribute("phno", phno);
			response.sendRedirect("html/bankInfo.html");
		}
		else
		{
			out.println(err);
			RequestDispatcher rd=request.getRequestDispatcher("html/contactInfo.html");
			   rd.include(request, response);
		}
	}

}
