package com.kar.servlet;

import java.io.IOException;
import com.kar.bo.AllInfoBO;
import com.kar.validation.AddingInfoValidationException;
import com.kar.vo.AllInfoVO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PInfoServlet")
public class PersonalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String errors="";
		AllInfoVO allInfoVo = new AllInfoVO(); //tight coupling
		
		String firstName = request.getParameter("fName");
		String lastName = request.getParameter("lName");
		String middleName = request.getParameter("mName");
		String gender = request.getParameter("gender");
		if(gender == null) gender = "";
	
		
		allInfoVo.setFirstName(firstName);
		allInfoVo.setLastName(lastName);
		allInfoVo.setMiddleName(middleName);
		allInfoVo.setGender(gender);

		AllInfoBO allInfoBo = new AllInfoBO();
		
		try{
			allInfoBo.addPersonalInfo(allInfoVo);
		}catch(AddingInfoValidationException e){
			errors = e.getErrorMessage();
		} catch (Exception e){
			 e.printStackTrace();
		}
	
		if(errors.equals("")){
			request.getSession().setAttribute("aInfoVO", allInfoVo);
			RequestDispatcher view = getServletContext().getRequestDispatcher("/html/contactInfo.html");
			view.forward(request, response);
		}
			
		else{
			request.getSession().setAttribute("errors", errors);
			RequestDispatcher view = getServletContext().getRequestDispatcher("/jsp/personalInfo.jsp");
			view.forward(request, response);
			
		}
	}

}
