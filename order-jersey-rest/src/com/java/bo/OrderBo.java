package com.java.bo;

import com.java.bean.OrderBean;

public class OrderBo implements OrderBoIntf{
	OrderBean orderBean = new OrderBean();
	
	@Override
	public OrderBean getOrder(int orderId) {
		
		return orderBean;
	}

	@Override
	public void updateOrder(OrderBean orderBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createOrder(int orderId) {
	
		orderBean.setOrderId(orderId);
		orderBean.setOrderTotal(10000);
		orderBean.setCard("card 002");
		orderBean.setItemCount(25);
		orderBean.setPersonName("MArk jukerberg");
		orderBean.setShippingAddress("fremont CA");
		
	}

	@Override
	public boolean deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		return false;
	}

}
