package com.hms.dao;

import java.util.List;

import com.hms.pojo.Booking;

public interface BookingDao {
	
	int bookRoom(Booking bk);
	List<Booking> bookingHistory();
	Booking bookingHistoryById(int bookingId);
	boolean updateBookingStatus(Booking bk);

}
