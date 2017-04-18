package com.java.resource;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.java.bean.OrderBean;
import com.java.bo.OrderBo;
import com.java.bo.OrderBoIntf;


@Path("/order")
public class Resource {

	
	@Path("/getOrder")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public OrderBean getOrder(@QueryParam("id") String orderId) {
		OrderBoIntf orderBo = new OrderBo();
		orderBo.createOrder(Integer.parseInt(orderId));
		return orderBo.getOrder(Integer.parseInt(orderId));
	}

	@PUT
	public void updateOrder(OrderBean orderBean) {
		// TODO Auto-generated method stub
		
	}

	@POST
	public void createOrder(int orderId) {
	

		
	}

	@DELETE
	public boolean deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		return false;
	}
}
