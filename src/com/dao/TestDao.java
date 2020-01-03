package com.dao;


import com.entity.TestEntity;

public interface TestDao {
	void save(String oldName, String newName, TestEntity test);
	TestEntity selectByCon(String oldName, String newName);
}
