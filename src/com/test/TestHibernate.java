package com.test;

import com.dao.TestDao;
import com.dao.impl.TestDaoImpl;
import com.entity.TestEntity;


public class TestHibernate {
	public static void main(String[] args) {
		TestDao dao = new TestDaoImpl();
//		TestEntity test = new TestEntity(2, "bb", 1, 1);
//		
//		dao.save("test_mapz", "test_mapz_201912", test);
		
		TestEntity test = dao.selectByCon("test_mapz", "test_mapz_201912");
		System.out.println(test.toString());
	}
}
