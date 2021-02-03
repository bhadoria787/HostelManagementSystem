package com.hms.pojo;

public class Booking {
	
	private int bookingId;
	private String customerName;
	private int nummberOfGuests;
	private String mobileNumber;
	private String checkInDate,checkOutDate;
	private String roomType;
	private int totalBookingCost;
	private String bookingStatus;
	private String cancelledReason;
	
	public Booking() {
		super();
	}

	public Booking(String customerName, int nummberOfGuests, String mobileNumber, String checkInDate,
			String checkOutDate, String roomType) {
		super();
		this.customerName = customerName;
		this.nummberOfGuests = nummberOfGuests;
		this.mobileNumber = mobileNumber;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.roomType = roomType;
	}


	public Booking(String customerName, int nummberOfGuests, String mobileNumber, String checkInDate,
			String checkOutDate, String roomType, int totalBookingCost) {
		super();
		this.customerName = customerName;
		this.nummberOfGuests = nummberOfGuests;
		this.mobileNumber = mobileNumber;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.roomType = roomType;
		this.totalBookingCost = totalBookingCost;
	}


	public Booking(String customerName, int nummberOfGuests, String mobileNumber, String checkInDate,
			String checkOutDate, String roomType, String bookingStatus, String cancelledReason) {
		super();
		this.customerName = customerName;
		this.nummberOfGuests = nummberOfGuests;
		this.mobileNumber = mobileNumber;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.roomType = roomType;
		this.bookingStatus = bookingStatus;
		this.cancelledReason = cancelledReason;
	}
	
	

	public Booking(String customerName, int nummberOfGuests, String mobileNumber, String checkInDate,
			String checkOutDate, String roomType, int totalBookingCost, String bookingStatus,
			String cancelledReason) {
		super();
		this.customerName = customerName;
		this.nummberOfGuests = nummberOfGuests;
		this.mobileNumber = mobileNumber;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.roomType = roomType;
		this.totalBookingCost = totalBookingCost;
		this.bookingStatus = bookingStatus;
		this.cancelledReason = cancelledReason;
	}
	
	

	public Booking(int bookingId, String customerName, int nummberOfGuests, String mobileNumber, String checkInDate,
			String checkOutDate, String roomType, int totalBookingCost, String bookingStatus, String cancelledReason) {
		super();
		this.bookingId = bookingId;
		this.customerName = customerName;
		this.nummberOfGuests = nummberOfGuests;
		this.mobileNumber = mobileNumber;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.roomType = roomType;
		this.totalBookingCost = totalBookingCost;
		this.bookingStatus = bookingStatus;
		this.cancelledReason = cancelledReason;
	}

	public String getName() {
		return customerName;
	}

	public void setName(String customerName) {
		this.customerName = customerName;
	}

	public int getNummberOfGuests() {
		return nummberOfGuests;
	}

	public void setNummberOfGuests(int nummberOfGuests) {
		this.nummberOfGuests = nummberOfGuests;
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

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public String getCancelledReason() {
		return cancelledReason;
	}

	public void setCancelledReason(String cancelledReason) {
		this.cancelledReason = cancelledReason;
	}
	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	

	public int getTotalBookingCost() {
		return totalBookingCost;
	}


	public void setTotalBookingCost(int totalBookingCost) {
		this.totalBookingCost = totalBookingCost;
	}


	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", customerName=" + customerName + ", nummberOfGuests="
				+ nummberOfGuests + ", mobileNumber=" + mobileNumber + ", checkInDate=" + checkInDate
				+ ", checkOutDate=" + checkOutDate + ", roomType=" + roomType + ", totalBookingCost=" + totalBookingCost
				+ ", bookingStatus=" + bookingStatus + ", cancelledReason=" + cancelledReason + "]";
	}


}
