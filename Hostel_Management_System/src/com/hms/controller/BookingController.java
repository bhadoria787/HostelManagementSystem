package com.hms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hms.dao.impl.BookingDaoImpl;
import com.hms.dao.impl.CustomerDaoImpl;
import com.hms.dao.impl.RoomDaoImpl;
import com.hms.pojo.Booking;
import com.hms.pojo.Customer;
import com.hms.pojo.Room;

@Controller
public class BookingController {
	
	@Autowired
	RoomDaoImpl rdi;
	
	@Autowired
	BookingDaoImpl bdi;
	
	@Autowired
	CustomerDaoImpl cdi;
	
	@GetMapping(value = "/bookRoom")
	public ModelAndView searchyById(int roomNumber,HttpSession session) {
		
		String customerid = (String) session.getAttribute("customer");
		Customer customer=cdi.searchCustomerByEmailId(customerid);
		
		Room rm = rdi.searchRoomByRoomNo(roomNumber);
		
		Booking bk=new Booking();
		bk.setName(customer.getName());
		bk.setNummberOfGuests(rm.getRoomCapacity());
		bk.setMobileNumber(customer.getMobileNumber());
		bk.setRoomType(rm.getRoomType());
		bk.setTotalBookingCost(rm.getRoomCost()*100*bk.getNummberOfGuests());
		bk.setCheckInDate(rm.getCheckInDate());
		bk.setCheckOutDate(rm.getCheckOutDate());
		
		return new ModelAndView("Booking", "command",bk );
	}
	
	
	@PostMapping(value = "/roomBooking")
	public ModelAndView saveRoom(@ModelAttribute("booking") Booking booking) {
		bdi.bookRoom(booking);
		return new ModelAndView("BookingDetails","bookinghist",booking);
	}

	
	@GetMapping(value = "/bookinghistory")
	public ModelAndView customerbookinghistory(HttpSession session) {
		
		List<Booking> bookinglist=bdi.bookingHistory();
		if(bookinglist.size()<=0)
		{return new ModelAndView("BookingHistory","emptyHistory","There is no booking history");}
		return new ModelAndView("BookingHistory","BookingHistory",bookinglist);
	}
	
	@GetMapping(value = "/bookingcancellation")
	public ModelAndView cacellationForm(int bookingId,HttpSession session) {
		Booking booking =bdi.bookingHistoryById(bookingId);
		return new ModelAndView("BookingCancellation","booking",booking);
	}
	
	@PostMapping(value = "/cancelBookedRoom")
	public ModelAndView cancelRoomBooking(@ModelAttribute Booking booking) {
		System.out.println(booking.getCancelledReason()+" "+booking.getBookingStatus()+" "+booking.getBookingId());
		bdi.updateBookingStatus(booking);
		List<Booking> bookinglist=bdi.bookingHistory();
		return new ModelAndView("BookingHistory","BookingHistory",bookinglist);
	}
}
