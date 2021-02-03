package com.hms.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.hms.dao.impl.CustomerDaoImpl;
import com.hms.pojo.Booking;
import com.hms.pojo.Customer;


@Controller
public class CustomerController {
	
	@Autowired
	CustomerDaoImpl cdi;

	@GetMapping(value = "/customerform")
	public ModelAndView customerForm() 
	{
		return new ModelAndView("AddCustomer", "command", new Customer());
	}

	@PostMapping(value = "/savecustomer")
	public ModelAndView addCustomer(@ModelAttribute("customer") Customer customer) 
	{
		cdi.addCustomer(customer);
		String msg="Successfully Registered!!!"+" \n Login to Book Room";
		return new ModelAndView("index","regissuc",msg);
		
	}
	
	
	
	@GetMapping(value = "/custbookingreport")
	public ModelAndView CustomerBookingReport(HttpSession session) {
		
		String name=cdi.searchCustomerByEmailId((String)session.getAttribute("customer")).getName();		
		List<Booking> bookinglist=cdi.custBookingHistory(name);
		if(bookinglist.size()<=0)
		{return new ModelAndView("BookingHistory","emptyHistory","There is no booking history");}
		return new ModelAndView("BookingHistory","BookingHistory",bookinglist);
	}

}
