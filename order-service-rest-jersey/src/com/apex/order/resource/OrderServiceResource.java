package com.apex.order.resource;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

import com.apex.order.bean.OrderBean;
import com.apex.order.bo.OrderBO;

@Path("/order")
public class OrderServiceResource {
		 
		@GET
		@Path("/getOrder/{id}")
	//	@Produces(MediaType.APPLICATION_XML)
		
		@Produces(MediaType.APPLICATION_JSON)
		public OrderBean getOrder(@PathParam("id") String id) throws NumberFormatException, JSONException{
			
			OrderBO orderBO = new OrderBO();
			return orderBO.getOrder(Integer.parseInt(id));
			
			/*JSONObject json = new JSONObject(); 
			json = orderBO.getJsonObject(Integer.parseInt("20"));
			return  json.toString();*/
		}
		@Path("/postOrder")
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		public Response createOrder(OrderBean orderBean){
			String result = "Order Saved: "+orderBean+
					"\n Order Id : "+orderBean.getOrderId()+
					"\n Order card : "+orderBean.getCard()+
					"\n Order ItemCount : "+orderBean.getItemCount()+
					"\n Order Order Total : "+orderBean.getOrderTotal()+
					"\n Order Person name : "+orderBean.getPersonName()+
					"\n Order Shipping Address : "+orderBean.getShippingAddress();
			
			return Response.status(201).entity(result).build();
			
		}
		@PUT
		public void updateOrder(OrderBean orderBean){
			
		}
		@DELETE
		public boolean deleteOrder(int orderId){
			return true;
		}
		@GET
		@Path("/allOrders")
		@Produces("application/json")
		public List<OrderBean> getAllOrders(){
			OrderBO orderBO = new OrderBO();
			return orderBO.getAllOrders();
		}
}
