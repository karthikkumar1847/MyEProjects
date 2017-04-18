package com.apex.order.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.apex.order.vo.Order;


@Repository
public class OrderDAOImpl implements OrderDAO{

	private static String dbURL = "jdbc:mysql://localhost:3306/test";
    private static String dbUser = "root";
    private static String dbPassword = "";
	   public static Connection createConnection(){
	        Connection con = null;
	             
	        try {
	            try {
	                Class.forName("com.mysql.jdbc.Driver");
	            } catch (ClassNotFoundException ex) {
	                System.out.println("Error: unable to load driver class!");
	                System.exit(1);
	            }
	            con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	        } catch (SQLException sqe) {
	            System.out.println("Error: While Creating connection to database");
	            sqe.printStackTrace();
	        }
			return con;
	  
	   }

	@Override
	public void placeOrder(Order order) {
		System.out.println("Starting of OrderDAOImpl: placeOrder(Order order)");
		 Connection con = createConnection();
		 PreparedStatement pStmt = null;
		 			 
		        try {
		             pStmt = con.prepareStatement("Insert into `order`(`itemcount`,`order_total`,`card`,`person_name`,`shipping_address`) Values(?,?,?,?,?)");
		          
		            pStmt.setInt(1, order.getItemCount());
		            pStmt.setDouble(2, order.getOrderTotal());
		            pStmt.setString(3, order.getCard());
		            pStmt.setString(4, order.getPersonName());
		            pStmt.setString(5, order.getShippingAddress());
		      
		            
		            int rowsInserted = pStmt.executeUpdate();
		            
		            if (rowsInserted != 1) {
		            	System.out.println("Not Inserted");
		            
							throw new Exception("Error in inserting the row");
				    }
		        }catch (SQLException sqe) {
		        	System.out.println(sqe.getErrorCode());
		        	System.out.println(sqe.getMessage());
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
		        System.out.println("Completed OrderDAOImpl: placeOrder(Order order)");
	}

	@Override
	public Order getOrder(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

}
