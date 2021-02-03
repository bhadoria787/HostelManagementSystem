package com.hms.dao;


import java.util.List;
import com.hms.pojo.Room;

 public interface RoomDao {
	
	 int addRoom(Room r) ;
	
	 List<Room> getAllRoom();
	
	 List<Room> getAvailableRoom();
	
	 Room searchRoomByRoomNo(int roomnumber) ;
	
	 List<Room> searchRoomFordate(String date) ;

}
