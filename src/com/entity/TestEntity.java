package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "test_mapz", catalog = "tmkj")
public class TestEntity {
	private int id;
	private String name;
	private int age;
	private int empNo;
	
	
	public TestEntity() {
		super();
	}
	public TestEntity(int id, String name, int age, int empNo) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.empNo = empNo;
	}
	
	@Id
	@Column(name = "id", unique = true, nullable = false, length = 11)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "name", length = 32)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "age", length = 10)
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Column(name = "empNo", length = 20)
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	@Override
	public String toString() {
		return Messages.getString("TestEntity.0") + id + Messages.getString("TestEntity.1") + name + Messages.getString("TestEntity.2") + age //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				+ Messages.getString("TestEntity.3") + empNo + Messages.getString("TestEntity.4"); //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	
}
