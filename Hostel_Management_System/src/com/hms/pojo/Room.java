package com.hms.pojo;

public class Room {
	
	private int roomNumber;
	private String roomType;
	private String description;
	private int roomCapacity;
	private String checkInDate,checkOutDate;
	private int roomCost;
	
	
	public Room() {
		super();
	}
	
	public Room(String roomType, String description, int roomCapacity, String checkInDate, String checkOutDate,
			int roomCost) {
		super();
		this.roomType = roomType;
		this.description = description;
		this.roomCapacity = roomCapacity;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.roomCost = roomCost;
	}


	public Room(int roomNumber, String roomType, String description, int roomCapacity, String checkInDate,
			String checkOutDate, int roomCost) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.description = description;
		this.roomCapacity = roomCapacity;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.roomCost = roomCost;
	}


	public int getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}


	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getRoomCapacity() {
		return roomCapacity;
	}


	public void setRoomCapacity(int roomCapacity) {
		this.roomCapacity = roomCapacity;
	}


	public String getCheckInDate() {
		return checkInDate;
	}


	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}


	public String getCheckOutDate() {
		return checkOutDate;
	}


	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}


	public int getRoomCost() {
		return roomCost;
	}


	public void setRoomCost(int roomCost) {
		this.roomCost = roomCost;
	}


	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", roomType=" + roomType + ", description=" + description
				+ ", roomCapacity=" + roomCapacity + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate
				+ ", roomCost=" + roomCost + "]";
	}

}
