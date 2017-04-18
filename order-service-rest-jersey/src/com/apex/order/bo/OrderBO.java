package com.apex.order.bo;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.apex.order.bean.OrderBean;
	
	
public class OrderBO {

	private OrderBean orderBean = new OrderBean();
		
	public OrderBean getOrder(int orderId){
		//OrderBean orderBean = new OrderBean();
		orderBean.setOrderId(orderId);
		orderBean.setItemCount(10);
		orderBean.setOrderTotal(1000.00);
		orderBean.setCard("43324");
		orderBean.setPersonName("John");
		orderBean.setShippingAddress("Fremont");
		
		return orderBean;
	}
	public JSONObject getJsonObject(int orderId) throws JSONException{
		
		JSONObject json = new JSONObject();
		
		orderBean.setOrderId(orderId);
		orderBean.setItemCount(10);
		orderBean.setOrderTotal(1000.00);
		orderBean.setCard("43324");
		orderBean.setPersonName("John");
		orderBean.setShippingAddress("Fremont");
		json.put("order_Id", orderBean.getOrderId());
		json.put("Item_Count", orderBean.getItemCount());
		json.put("Order_Total", orderBean.getOrderTotal());
		json.put("Card", orderBean.getCard());
		json.put("Person_Name", orderBean.getPersonName());
		json.put("Shipping_Address", orderBean.getShippingAddress());
		return json;
		
	}
	
	public void createOrder(OrderBean orderBean){
		
	}
	public void updateOrder(OrderBean orderBean){
		
	}
	public boolean deleteOrder(int orderId){
		return true;
	}
	public List<OrderBean> getAllOrders(){
		List<OrderBean> al= new  ArrayList<OrderBean>();
		al.add(orderBean);
		return  al;
	}
}
