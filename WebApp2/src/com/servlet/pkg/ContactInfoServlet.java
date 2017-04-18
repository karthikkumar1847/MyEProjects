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

@WebServlet("/WebApp2/ContactInfoServlet")
public class ContactInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		AllInfoVO allInfoVo = (AllInfoVO)request.getSession().getAttribute("aInfoVO");
		PrintWriter out = response.getWriter();
		
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
		
		HttpSession session = request.getSession();
		/*session.setAttribute("apt", apt);
		session.setAttribute("city", city);
		session.setAttribute("state", state);
		session.setAttribute("country", country);
		session.setAttribute("phno", phoneNumber);*/
		
		session.setAttribute("aInfoVO", allInfoVo);
		
		//response.setContentType("text/html");
		//response.sendRedirect("html/bankInfo.html");
		String errors = new String();
		
		 Connection con = DatabaseConnection.createConnection();
		 int rs = 0;
		        try {
		            Statement st = con.createStatement();
		            String sql = "Insert into contactInfo(apt,city,state,country,phone) Values('"+apt+"','"+city+"','"+state+"','"+country+"','"+phoneNumber+"')";

		             rs = st.executeUpdate(sql);

		        } catch (SQLException sqe) {
		            sqe.printStackTrace();
		        }
		     
			if(rs>0){
		RequestDispatcher view = getServletContext().getRequestDispatcher("/jsp/success.jsp");
		view.forward(request, response);
		}else{
			errors="Unable to add details duo to database Connection Problem..!!";
			out.println("<font color=red>"+errors+"</font>");
			RequestDispatcher view = getServletContext().getRequestDispatcher("/html/contactInfo.html");
			view.include(request, response);
			
		}
		
	
	}

}
