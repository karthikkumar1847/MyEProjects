package com.apex.db.order.dao;

import org.hibernate.Session;
import com.apex.db.order.util.HibernateConnector;
import com.apex.db.order.util.HibernateUtil;
import com.apex.db.order.vo.OrderEntity;

public class OrderDAOHibernateImpl {
	public void placeOrder(OrderEntity orderEntity){
			//Session session = HibernateUtil.getSessionFactory();
		Session session = HibernateConnector.getInstance().getSession();
		org.hibernate.Transaction tx =  session.beginTransaction();
		session.save(orderEntity);
		tx.commit();
		}
	//read
	
	//update
	
	//delete
	
	//getAll

}
