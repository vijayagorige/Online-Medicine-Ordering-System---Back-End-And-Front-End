package com.medicine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.medicine.entity.Admin;
import com.medicine.serviceimpl.Adminserviceimpl;
import com.medicine.userExceptions.UserNotFoundException;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class AdminController {
	
	@Autowired
    Adminserviceimpl adminserviceimpl;	
		
	
	@GetMapping("/admin/{id}")
	public ResponseEntity<Admin> getAdminById(@PathVariable String id) throws UserNotFoundException{

		Admin admin=adminserviceimpl.getAdmin(id);
		return new ResponseEntity<>(admin,HttpStatus.OK);

	}

}
