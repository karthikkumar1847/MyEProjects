package com.spngann.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.spngann.vo.AllInfoVO;

@Repository
public class AllInfoDAOImpl implements AllInfoDAO {

	public AllInfoDAOImpl(){
		// TODO Auto-generated constructor stub
	}

	public void addRecord(AllInfoVO allinfoVo) {
		// TODO Auto-generated method stub
		System.out.println("Starting of AllInfoDAOImpl: addRecord(AllInfoVO allinfoVo)");
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
		            pStmt.setLong(9, allinfoVo.getPhoneNumber());
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
		            throw new RuntimeException(sqe.getMessage());
		    	}catch(Exception e) {
		 		   e.printStackTrace();
		 		  throw new RuntimeException(e.getMessage());
		 		}
		 	     finally {
		 	    	 try {
						pStmt.close();
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						throw new RuntimeException(e.getMessage());
					}
		 	    	 
		 	     }
		        System.out.println("Completed AllInfoDAOImpl: addRecord(AllInfoVO allinfoVo)");
	}

	public AllInfoVO getRecord(AllInfoVO allInfoVO) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateRecord(AllInfoVO allInfoVO) {
		// TODO Auto-generated method stub
		
	}

	public AllInfoVO deleteRecord(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}


}
