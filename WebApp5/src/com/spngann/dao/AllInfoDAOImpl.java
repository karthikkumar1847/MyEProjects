package com.spngann.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spngann.util.HibernateConnector;
import com.spngann.vo.AllInfoVO;

@Repository
public class AllInfoDAOImpl implements AllInfoDAO {


	/*@Autowired
	private SessionFactory session;*/
	
	
	/*private HibernateTemplate hibernateTemplate;

	public AllInfoDAOImpl(){
		// TODO Auto-generated constructor stub
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
*/

	public void addRecord(AllInfoVO allinfoVo) {
		// TODO Auto-generated method stub
		System.out.println("Starting of AllInfoDAOImpl: addRecord(AllInfoVO allinfoVo)");
		Session session = HibernateConnector.getInstance().getSession();
		Transaction tx = session.beginTransaction();
		session.save(allinfoVo);
		tx.commit();
		session.close();
		
		//hibernateTemplate.save(allinfoVo);
		
		//session.getCurrentSession().save(allinfoVo);
		
		System.out.println("Completed AllInfoDAOImpl: addRecord(AllInfoVO allinfoVo)");
	}

	public AllInfoVO getRecord(AllInfoVO allInfoVO) {
		return null;
	}

	public void updateRecord(AllInfoVO allInfoVO) {
		
	}

	public AllInfoVO deleteRecord(String ssn) {
		return null;
	}


}
