package com.kar.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.kar.bo.AllInfoBO;
import com.kar.validation.AddingInfoValidationException;
import com.kar.vo.AllInfoVO;

@WebServlet("/ContactInfoServlet")
public class ContactInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		AllInfoVO allInfoVo = (AllInfoVO)request.getSession().getAttribute("aInfoVO");

		
		String apt = request.getParameter("aptName");
		String city = request.getParameter("cityName");
		String state = request.getParameter("stateName");
		String country = request.getParameter("countryName");
		String phoneNumber = request.getParameter("phoneNumber");
		
		allInfoVo.setApt(apt);
		allInfoVo.setCity(city);
		allInfoVo.setState(state);
		allInfoVo.setCountry(country);
		allInfoVo.setPhoneNumber(phoneNumber);
		
		String errors = "";
		AllInfoBO allInfoBo = new AllInfoBO();
		
		try{
			allInfoBo.addContactInfo(allInfoVo);
		}catch(AddingInfoValidationException e){
			errors = e.getErrorMessage();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		if(errors.equals("")){
			
			request.getSession().setAttribute("aInfoVO", allInfoVo);
			RequestDispatcher view = request.getRequestDispatcher("/html/bankInfo.html");
			view.forward(request, response);
		}else{
			request.getSession().setAttribute("errors", errors);
			RequestDispatcher view = request.getRequestDispatcher("/jsp/contactInfo.jsp");
			view.forward(request, response);
			
		}
	
	}

}
