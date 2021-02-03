package com.hms.dao;

import java.util.List;

import com.hms.pojo.Booking;
import com.hms.pojo.Customer;

public interface CustomerDao {
	
	boolean addCustomer(Customer c);
	Customer searchCustomerByEmailId(String emailId);
	List<Booking> custBookingHistory(String customerName);

}
