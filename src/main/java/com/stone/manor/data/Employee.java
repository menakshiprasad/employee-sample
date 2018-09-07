package com.stone.manor.data;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String fname;
	private String lname;
	private String address;
	private Long phone;

	public Employee(String fname, String lname, String address, Long phone) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.phone = phone;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", address=" + address + ", phone=" + phone + "]";
	}

}
