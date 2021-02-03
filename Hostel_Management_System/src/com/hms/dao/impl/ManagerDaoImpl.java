package com.hms.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hms.dao.ManagerDao;
import com.hms.pojo.Manager;

public class ManagerDaoImpl implements ManagerDao {
	
	private JdbcTemplate jt1;
	public void setJt1(JdbcTemplate jt1) {
		this.jt1 = jt1;
	}

	public int addManager(Manager manager) {
		String sql = "INSERT INTO manager VALUES(?,?)";
		return jt1.update(sql, manager.getEmailId(), manager.getPassword());
	}

	
	public Manager searchManagerByEmailId(String emailId) 
	{
		String getAll="SELECT * FROM manager WHERE emailId=?";
		return jt1.queryForObject(getAll, new Object[] {emailId}, new RowMapper<Manager>()
				{
			@Override
			public Manager mapRow(ResultSet rs, int in) throws SQLException 
			{
				Manager m = new Manager(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
				return m;
			}
				});
	}
	
}
