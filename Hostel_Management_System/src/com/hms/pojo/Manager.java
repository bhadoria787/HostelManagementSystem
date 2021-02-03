package com.hms.pojo;

public class Manager 
{
	private String name;
	private String emailId;
	private String password;
	private String mobileNumber;

	
	public Manager() {
		super();
	}

	public Manager(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}

	public Manager(String name, String emailId, String password, String mobileNumber) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile_no() {
		return mobileNumber;
	}

	public void setMobile_no(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", emailId=" + emailId + ", password=" + password + ", mobileNumber=" + mobileNumber
				+ "]";
	}
	
}
