package com.hms.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.hms.dao.CustomerDao;
import com.hms.pojo.Booking;
import com.hms.pojo.Customer;


public class CustomerDaoImpl implements CustomerDao {

	private JdbcTemplate jt1;

	public void setJt1(JdbcTemplate jt1) {
		this.jt1 = jt1;
	}


	public boolean addCustomer(Customer c) {
		String sql = "INSERT INTO customer VALUES(?,?,?,?)";
		return jt1.update(sql, c.getName(), c.getEmailId(),c.getPassword(),
				c.getMobileNumber()) > 0;
	}

	public Customer searchCustomerByEmailId(String emailId) {
		String getAll = "SELECT * FROM customer WHERE emailId=?";
		try {
			return jt1.queryForObject(getAll, new Object[] { emailId }, new RowMapper<Customer>() {
				@Override
				public Customer mapRow(ResultSet rs, int in) throws SQLException {
					Customer c = new Customer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
					return c;
				}
			});
		} catch (Exception e) {
			return null;
		}
	}
	
	
	public List<Booking> custBookingHistory(String customerName) {
		String getAll = "SELECT * FROM booking WHERE customerName=?";
		return jt1.query(getAll,new Object[] { customerName }, new RowMapper<Booking>() {
			@Override
			public Booking mapRow(ResultSet rs, int in) throws SQLException {
				Booking bk = new Booking(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5),
						rs.getString(6),rs.getString(7),rs.getInt(8),rs.getString(9),rs.getString(10));
				return bk;
			}
		});
	}

}
