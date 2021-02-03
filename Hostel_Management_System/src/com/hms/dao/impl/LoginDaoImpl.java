package com.hms.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.hms.dao.LoginDao;
import com.hms.pojo.Customer;
import com.hms.pojo.Manager;

public class LoginDaoImpl implements LoginDao {

	private JdbcTemplate jt1;

	public void setJt1(JdbcTemplate jt1) {
		this.jt1 = jt1;
	}

	public boolean customerlogin(String emailId, String password) {
		String getAll = "SELECT * FROM customer WHERE emailId=? AND password=?";
	
		try {
			jt1.queryForObject(getAll, new Object[] { emailId, password },
					new RowMapper<Customer>() {
						@Override
						public Customer mapRow(ResultSet rs, int in) throws SQLException {

							Customer c = new Customer(rs.getString(1), rs.getString(2));
							return c;
						}
					});
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}

	public boolean managerLogin(String emailId, String password) {
		String sql = "SELECT * FROM manager WHERE emailId=? AND password=?";
		try {
			jt1.queryForObject(sql, new Object[] { emailId, password }, new RowMapper<Manager>() {
				@Override
				public Manager mapRow(ResultSet rs, int in) throws SQLException {

					Manager m = new Manager(rs.getString(1), rs.getString(2));
					return m;
				}
			});
		} catch (Exception e) {
			return false;
		}

		return true;
	}

}
