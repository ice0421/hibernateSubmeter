package com.interceptor;

import java.io.Serializable;

import org.hibernate.EmptyInterceptor;
import org.hibernate.Interceptor;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 全局拦截器
 * @author 卞启威
 *
 */
public class HibernateInterceptor extends EmptyInterceptor{
	private static final Logger log = LoggerFactory.getLogger(HibernateInterceptor.class);
	private static final long serialVersionUID = 1L;
	
	public String onPrepareStatement(String sql) {
		return sql;
	}
}



/********************Hibernate SESSION 级别拦截器使用********************

	//在DAO对象增加如下方法即可
	
	//定义拦截器
	private Interceptor interceptor = new EmptyInterceptor(){
		public String onPrepareStatement(String sql) {
			//log.info(sql);
			//此处可以处理hibernate解析后的sql
			return sql;
			//return sql.replaceAll("hx_test_table", "hx_test_table_1");
		}
	};
	
	@Override
	public Session getSession() {
		try {
			//此方式设置的拦截器，属于session作用域
			return HibernateSessionFactory.getSession(interceptor);
		} catch (RuntimeException e) {
			log.error(e.getMessage());
			throw e;
		}
	}
 
***********************************************************/