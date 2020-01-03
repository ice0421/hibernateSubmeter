package com.interceptor;

import org.hibernate.EmptyInterceptor;

public class SqlInterceptor extends EmptyInterceptor{
	  private static final long serialVersionUID = 1L;
	
	  public SqlInterceptor(String oldTable, String newTable) {
		  this.newTable = newTable;
		  this.oldTable = oldTable;
	  }
	  
	  private String oldTable;
	  private String newTable;
	
	  public void setNewTable(String newTable) {
		  this.newTable = newTable;
	  }

	  public void setOldTable(String oldTable) {
		  this.oldTable = oldTable;
	  }
	

	@Override
	  public String onPrepareStatement(String sql) {
		  if (null != newTable && !newTable.isEmpty()) {
			  sql = sql.replaceAll(oldTable, newTable);
		  }
	     return sql;
	  }
}