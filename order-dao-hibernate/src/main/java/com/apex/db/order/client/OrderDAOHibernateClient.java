package com.apex.db.order.client;

import com.apex.db.order.dao.OrderDAOHibernateImpl;
import com.apex.db.order.vo.OrderEntity;

public class OrderDAOHibernateClient {

	public static void main(String[] args) {
		OrderEntity orderEntity = new OrderEntity(10,25.52,"324234","john","fremont");
		OrderDAOHibernateImpl orderDao = new OrderDAOHibernateImpl();
		orderDao.placeOrder(orderEntity);
	}

}
