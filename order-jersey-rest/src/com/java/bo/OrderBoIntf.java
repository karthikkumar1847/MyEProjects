package com.java.bo;

import com.java.bean.OrderBean;

public interface OrderBoIntf {

	public OrderBean getOrder(int orderId);
	public void updateOrder(OrderBean orderBean);
	public void createOrder(int orderId);
	public boolean deleteOrder(int orderId);
}
