package com.hms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hms.dao.impl.CustomerDaoImpl;
import com.hms.dao.impl.LoginDaoImpl;
import com.hms.dao.impl.ManagerDaoImpl;


@Controller
public class LoginController {
	
	@Autowired
	LoginDaoImpl ldi;
	@Autowired
	CustomerDaoImpl cdi;
	@Autowired
	ManagerDaoImpl mdi;
	
	
	@RequestMapping("loginform")
	public String getLoginPage() 
	{
		return "Login";
	}

	@PostMapping(value = "/savelogin")
	public ModelAndView Login(HttpServletRequest req, HttpSession session) 
	{
		String type = req.getParameter("type");
		String userid = req.getParameter("emailid");
		String pass = req.getParameter("pass");

		if (type.equals("Customer")) 
		{
		
			if(ldi.customerlogin(userid, pass))
			{
				session.setAttribute("customer", userid);
				
				String name=cdi.searchCustomerByEmailId(userid).getName();
				session.setAttribute("customer_name", name);
				
				return new ModelAndView("index","loginsuc","Welcome to Hotel Royal Palace "+name+"!!");
			} 
			else 
			{
				return new ModelAndView("Login","loginfail","Oops!! "+userid+" you have enter invalid detail\n try again");
			}
		}
		if (type.equals("Manager")) 
		{
			if(ldi.managerLogin(userid, pass))
			{
				session.setAttribute("manager", userid);
				String managername=mdi.searchManagerByEmailId(userid).getName();
				session.setAttribute("manager_name", managername);
				return new ModelAndView("index","loginsuc","Welcome "+managername+"!!");
			} 
			else 
			{
				return new ModelAndView("Login","loginfail","Oops!! "+userid+" you have enter invalid detail\n try again");
			}	
		}
		return new ModelAndView("Login");
	}
	
	@RequestMapping( value = "/logout")
	public ModelAndView Logout(HttpSession session,HttpServletRequest req)
	{
			session=req.getSession();
			session.invalidate();
		
		return new ModelAndView("index","LOGOUT","signout");
	}

}
