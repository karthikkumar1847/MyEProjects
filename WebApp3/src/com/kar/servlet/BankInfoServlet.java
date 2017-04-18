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


@WebServlet("/BankInfoServlet")
public class BankInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AllInfoVO allInfoVo = (AllInfoVO)request.getSession().getAttribute("aInfoVO");
		
		String bankName = request.getParameter("bankName");
		String accountNumber = request.getParameter("actno");
		String ssn = request.getParameter("ssn");
		
		allInfoVo.setBankName(bankName);
		allInfoVo.setAccountNumber(accountNumber);
		allInfoVo.setSsn(ssn);
			
		String errors = "";
		AllInfoBO allInfoBo = new AllInfoBO();
		
		try{
			allInfoBo.addBankInfo(allInfoVo);
		}catch(AddingInfoValidationException e){
			errors = e.getErrorMessage();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		if(errors.equals("")){
			 	
			request.getSession().setAttribute("aInfoVO", allInfoVo);
			RequestDispatcher view = request.getRequestDispatcher("/jsp/OutputWithJSTL.jsp");
			view.forward(request, response);
		}else{
			request.getSession().setAttribute("errors", errors);
			RequestDispatcher view = request.getRequestDispatcher("/jsp/bankInfo.jsp");
			view.forward(request, response);
			
		}
	

	}

}
