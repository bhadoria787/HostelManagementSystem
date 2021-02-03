package com.hms.dao;

public interface LoginDao {
	
	boolean customerlogin(String emailId, String password);
	boolean managerLogin(String emailId, String password);

}
