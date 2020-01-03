package com.dao.impl;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.TestDao;
import com.entity.TestEntity;
import com.interceptor.HibernateSessionFactory;
import com.interceptor.SqlInterceptor;

public class TestDaoImpl implements TestDao{

	@Override
	public void save(String oldName, String newName, TestEntity test) {
		SqlInterceptor interceptor = new SqlInterceptor(oldName, newName);
		Session session = HibernateSessionFactory.getSession(interceptor);
		Transaction t = session.beginTransaction();
		session.save(test);
		t.commit();
		session.close();
	}

	@Override
	public TestEntity selectByCon(String oldName, String newName) {
		SqlInterceptor interceptor = new SqlInterceptor(oldName, newName);
		Session session = HibernateSessionFactory.getSession(interceptor);
		TestEntity test= (TestEntity) session.get(TestEntity.class, 1);
		session.close();
		return test;
	}

}
