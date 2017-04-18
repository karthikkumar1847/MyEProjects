package com.servlet.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DB.DatabaseConnection;
import com.servlet.pkg.VO.AllInfoVO;

@WebServlet("/BankInfoServlet")
public class BankInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AllInfoVO allInfoVo = (AllInfoVO)request.getSession().getAttribute("aInfoVO");
		PrintWriter out = response.getWriter();
		
		String bankName = request.getParameter("bankName");
		String accountNumber = request.getParameter("actno");
		String ssn = request.getParameter("ssn");
		
		allInfoVo.setBankName(bankName);
		allInfoVo.setAccountNumber(accountNumber);
		allInfoVo.setSsn(ssn);
		
		HttpSession session = request.getSession();
	/*	session.setAttribute("bankName", bankName);
		session.setAttribute("actno", accountNumber);
		session.setAttribute("ssn", ssn);*/
		
		session.setAttribute("aInfoVO", allInfoVo);
		
		//response.setContentType("text/html");
		//response.sendRedirect("jsp/output.jsp");
		
		String errors = new String();
		
		 Connection con = DatabaseConnection.createConnection();
		 int rs = 0;
		        try {
		            Statement st = con.createStatement();
		            String sql = "Insert into bankInfo(bank,actno,ssn) Values('"+bankName+"','"+accountNumber+"','"+ssn+"')";

		             rs = st.executeUpdate(sql);

		        } catch (SQLException sqe) {
		            sqe.printStackTrace();
		        }
		     
			if(rs>0){
		RequestDispatcher view = request.getRequestDispatcher("/jsp/OutputWithJSTL.jsp");
		view.forward(request, response);
		}else{
			errors="Unable to add details duo to database Connection Problem..!!";
			out.println("<font color=red>"+errors+"</font>");
			RequestDispatcher view = request.getRequestDispatcher("/html/bankInfo.html");
			view.include(request, response);
			
		}
		

	}

}
