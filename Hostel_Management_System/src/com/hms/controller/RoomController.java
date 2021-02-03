package com.hms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.hms.dao.impl.RoomDaoImpl;
import com.hms.pojo.Room;

@Controller
public class RoomController {
	
	@Autowired
	RoomDaoImpl rdi;
	
	@GetMapping(value = "/showRoomForm")
	public ModelAndView showRoomForm()
	{
		return new ModelAndView("AddRoom", "room", new Room());
	}

	@PostMapping(value = "/saveroom")
	public ModelAndView saveRoom(@ModelAttribute("room") Room room,Model m) {
		int roomnumber=room.getRoomNumber();
		try {
			ModelAndView mv=new ModelAndView("AddRoom");
			rdi.searchRoomByRoomNo(roomnumber);
			mv.addObject("status","Room no: "+roomnumber+" already exists..Please enter different room number");
			return mv;
		} catch (Exception e) {
			rdi.addRoom(room);
			return new ModelAndView("index","status","Room added successfully");
		}
	}
	
	@GetMapping(value = "/Searchroomform")
	public String getfoodform() {

		return "SearchRoom";
	}
	
	@PostMapping(value = "/searchroom")
	public ModelAndView getfoodByname(HttpServletRequest req) 
	{
		String  date= req.getParameter("Date");
		List<Room> rlist = rdi.searchRoomFordate(date);
		if (rlist.size() <=0 )
			return new ModelAndView("SearchRoom", "searchfail", "Sorry Room is not available on this date");
		else
			return new ModelAndView("RoomList", "roomlist", rlist);

	}
	
	@GetMapping(value = "/showRoomlist")
	public ModelAndView getroom() {
		
		List<Room> rlist = rdi.getAllRoom();
		if (rlist.size() <=0 ) 
		{
			return new ModelAndView("SearchRoom", "searchfail", "Sorry.. room not available");
		}
		else
		{
			return new ModelAndView("RoomList", "roomlist", rlist);
		}
	}
	
	@GetMapping(value = "/avaliableRoomlist")
	public ModelAndView getAvaliableroom() {
		
		List<Room> rlist = rdi.getAvailableRoom();
		if (rlist.size() <=0 ) 
		{
			return new ModelAndView("SearchRoom", "searchfail", "Sorry.. room not available");
		}
		else
		{
			return new ModelAndView("RoomList", "roomlist", rlist);
		}
	}

}
