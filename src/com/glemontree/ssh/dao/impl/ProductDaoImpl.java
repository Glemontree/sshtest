package com.glemontree.ssh.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.glemontree.ssh.dao.ProductDao;
import com.glemontree.ssh.entities.Product;

public class ProductDaoImpl implements ProductDao {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(Product product) {
		System.out.println("DAO中save方法执行了");
		getSession().save(product);
	}

}
