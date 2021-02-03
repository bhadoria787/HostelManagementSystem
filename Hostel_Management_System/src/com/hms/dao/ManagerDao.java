package com.hms.dao;

import com.hms.pojo.Manager;

public interface ManagerDao {
	
	int addManager(Manager manager);
	Manager searchManagerByEmailId(String emailId);

}
