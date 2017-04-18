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

@WebServlet("/BankInfo")
public class BankInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String bname = request.getParameter("bname");
		String acno = request.getParameter("acno");
		String ssn = request.getParameter("ssn");

		StringBuffer err=new StringBuffer("");
		
		if(Validation.isFieldBlank(bname) || Validation.checkCharSet(bname))
		{
			err.append("Please Enter bank name length should be 2 to 20 charachers");
		}
		if(Validation.isFieldBlank(acno) || Validation.checkNumber(acno) || acno.length()<10)
		{
			err.append("Please Enter Ac number length should be 10 to 20 digits");
		}
		if(Validation.isFieldBlank(ssn) || Validation.checkNumber(ssn) || ssn.length()!=8)
		{
			err.append("Please Enter SSN length should be 8 digits");
		}
		
		HttpSession session =request.getSession();
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		if(err.length()==0)
		{
			/*PersonalInfoVO pInfoVO=(PersonalInfoVO) session.getAttribute("pInfoVO");
			pInfoVO.setBname(bname); 
			pInfoVO.setActno(acno); 
			pInfoVO.setSsn(ssn);
			session.setAttribute("pInfoVO", pInfoVO);*/

			session.setAttribute("bname", bname);
			session.setAttribute("acno", acno);
			session.setAttribute("ssn", ssn);

			response.sendRedirect("jsp/OutputWithJstl.jsp");
		}
		else
		{
			out.println(err);
			RequestDispatcher rd=request.getRequestDispatcher("html/bankInfo.html");
			   rd.include(request, response);
		}
	}

}
