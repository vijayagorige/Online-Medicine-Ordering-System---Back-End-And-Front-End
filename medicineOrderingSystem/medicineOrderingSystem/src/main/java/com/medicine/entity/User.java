package com.medicine.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	private String userId;
	@Column(name="password",nullable=false)
	private String password;
	@Column(name="name",nullable=false)
	private String name;
	@Column(length=30,name="address",nullable=false)
	private String address;
	@Column(length=10,name="contactNo",nullable=false)
	private String contactNo;
	public User()
	{
		
	}

	public User(String userId, String password, String name, String address, String contactNo) {
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
	}
	public String getuserId() {
		return userId;
	}
	public void setuserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", name=" + name + ", address=" + address
				+ ", contactNo=" + contactNo + "]";
	}
	
}
