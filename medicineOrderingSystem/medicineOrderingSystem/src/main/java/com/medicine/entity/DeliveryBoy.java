package com.medicine.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DeliveryBoy {
	@Id
	private String loginid;
	private String password;
	private String name;
	@Column(length=10)
	private String contactno;
	
	public DeliveryBoy() {
		super();
	}
	
	public DeliveryBoy(String loginid, String password, String name, String contactno) {
		super();
		this.loginid = loginid;
		this.password = password;
		this.name = name;
		this.contactno = contactno;
	}

	//getters and setters
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
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
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "DeliveryBoy [loginid=" + loginid + ", password=" + password + ", name=" + name + ", contactno="
				+ contactno + "]";
	}

}
