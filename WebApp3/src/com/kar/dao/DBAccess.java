package com.kar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.kar.vo.AllInfoVO;

public class DBAccess {

	public DBAccess() {}

		public void addRecord(AllInfoVO allinfoVo) throws SQLException,Exception{
			 Connection con = CreateConnection.createConnection();
			 PreparedStatement pStmt = null;
			 			 
			        try {
			             pStmt = con.prepareStatement("Insert into UserInfoTable Values(?,?,?,?,?,?,?,?,?,?,?,?)");
			          
			            pStmt.setString(1, allinfoVo.getFirstName());
			            pStmt.setString(2, allinfoVo.getMiddleName());
			            pStmt.setString(3, allinfoVo.getLastName());
			            pStmt.setString(4, allinfoVo.getGender());
			            pStmt.setString(5, allinfoVo.getApt());
			            pStmt.setString(6, allinfoVo.getCity());
			            pStmt.setString(7, allinfoVo.getState());
			            pStmt.setString(8, allinfoVo.getCountry());
			            pStmt.setString(9, allinfoVo.getPhoneNumber());
			            pStmt.setString(10, allinfoVo.getBankName());
			            pStmt.setString(11, allinfoVo.getAccountNumber());
			            pStmt.setString(12, allinfoVo.getSsn());
			            
			            int rowsInserted = pStmt.executeUpdate();
			            
			            if (rowsInserted != 1) {
			            	System.out.println("Not Inserted");
			            
								throw new Exception("Error in inserting the row");
					    }
			        }catch (SQLException sqe) {
			            sqe.printStackTrace();
			            throw sqe;
			    	}catch(Exception e) {
			 		   e.printStackTrace();
			 		   throw e;
			 		}
			 	     finally {
			 	    	 pStmt.close();
			 	    	 con.close();
			 	     }
			     
		}
	

}
