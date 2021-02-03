package com.hms.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hms.dao.BookingDao;
import com.hms.pojo.Booking;
import com.hms.pojo.Room;

public class BookingDaoImpl implements BookingDao{

	private JdbcTemplate jt1;

	public void setJt1(JdbcTemplate jt1) {
		this.jt1 = jt1;
	}
	
	public int bookRoom(Booking bk) {
		String sql = "INSERT INTO booking(customerName,nummberOfGuests,mobileNumber,checkInDate,checkOutDate,roomType,totalBookingCost,bookingStatus) VALUES(?,?,?,?,?,?,?,?)";
		return jt1.update(sql, bk.getCustomerName(),bk.getNummberOfGuests(),bk.getMobileNumber(),bk.getCheckInDate(),bk.getCheckOutDate(),bk.getRoomType(),bk.getTotalBookingCost(),"BOOKED");
	}

	public List<Booking> bookingHistory() {
		String getAll = "SELECT * FROM booking";
		return jt1.query(getAll, new RowMapper<Booking>() {
			@Override
			public Booking mapRow(ResultSet rs, int in) throws SQLException {
				Booking bk = new Booking(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5),
						rs.getString(6),rs.getString(7),rs.getInt(8),rs.getString(9),rs.getString(10));
				return bk;
			}
		});
	}
	
	public Booking bookingHistoryById(int bookingId) {
		String getAll = "SELECT * FROM booking WHERE bookingId=?";
		return jt1.queryForObject(getAll,new Object[] { bookingId }, new RowMapper<Booking>() {
			@Override
			public Booking mapRow(ResultSet rs, int in) throws SQLException {
				Booking bk = new Booking(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5),
						rs.getString(6),rs.getString(7),rs.getInt(8),rs.getString(9),rs.getString(10));
				return bk;
			}
		});
	}
	
	public boolean updateBookingStatus(Booking bk) {
		String sql = "UPDATE booking SET bookingStatus=?,cancelledReason=? WHERE bookingId=?";
		return jt1.update(sql,"CACELLED",bk.getCancelledReason(),bk.getBookingId() )>=0;
	}

}
