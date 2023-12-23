package com.medicine.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Admin {

	@Id
	private String loginid;
	private String password;

}
