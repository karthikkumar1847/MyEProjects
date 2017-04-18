package com.servlet.pkg;

import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DB.DatabaseConnection;
import com.servlet.pkg.VO.AllInfoVO;

@WebServlet("/PersonalInfoServlet")
public class PersonalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		AllInfoVO allInfoVo = new AllInfoVO();
		
		String firstName = request.getParameter("fName");
		String lastName = request.getParameter("lName");
		String middleName = request.getParameter("mName");
		String gender = request.getParameter("gender");
		if(gender == null) gender = "";
	
		
		allInfoVo.setFirstName(firstName);
		allInfoVo.setLastName(lastName);
		allInfoVo.setMiddleName(middleName);
		allInfoVo.setGender(gender);
		
		HttpSession session = request.getSession();
		/*session.setAttribute("fn", firstName);
		session.setAttribute("ln", lastName);
		session.setAttribute("mn", middleName);
		session.setAttribute("gender", gender);*/
		session.setAttribute("aInfoVO", allInfoVo);
		
		
		String errors = new String();
		if(isValidNameLength(allInfoVo.getFirstName())) 	
			errors = "Specify First Name ,minimum 2 characters." ;
		
		else if(isValidName(allInfoVo.getFirstName())) 
			errors = "First name must contain alphabets and numbers.";
		
		else if(isValidNameLength(allInfoVo.getMiddleName())) 	
			errors="Specify Middle Name ,minimum 2 characters." ;
		
		else if(isValidName(allInfoVo.getMiddleName())) 	
			errors="Middle name must contain alphabets and numbers." ;
		
		else if(isValidNameLength(allInfoVo.getLastName())) 	
			errors = "Specify Last Name ,minimum 2 characters.";
		
		else if(isValidName(allInfoVo.getLastName())) 	
			errors="Last name must contain alphabets and numbers." ;
		
		else if(isGenderSelected(gender))	
			errors="Select Gender." ;
		
		else errors = "";
		
		
//		response.setContentType("text/html");
//     	response.sendRedirect("html/contactInfo.html");

		if(errors.isEmpty()){
			
		 Connection con = DatabaseConnection.createConnection();
		 int rs = 0;
		        try {
		            Statement st = con.createStatement();
		            String sql = "Insert into personalInfo(first_name,middle_name,last_name,gender) Values('"+firstName+"','"+middleName+"','"+lastName+"','"+gender+"')";

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
			RequestDispatcher view = getServletContext().getRequestDispatcher("/html/personalInfo.html");
			view.include(request, response);
			
		}
			
		}else{
			out.println("<font color=red>"+errors+"</font>");
			RequestDispatcher view = getServletContext().getRequestDispatcher("/html/personalInfo.html");
			view.include(request, response);
			
		}
	}

	
		public boolean isValidNameLength(String name){
			return name.trim().length()<=2 || name.isEmpty() ;
		}
		public boolean isValidName(String name){
			return name.contains("[a-zA-Z]+")||name.contains("[0-9]") ;
			
		}
		public boolean isGenderSelected(String gender){
			
			 return gender.equals("");
		}
		
}
