package com.medicine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicine.entity.User;
import com.medicine.serviceimpl.UserServiceImpl;
import com.medicine.userExceptions.UserFoundException;
import com.medicine.userExceptions.UserNotFoundException;
@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class UserController {
	@Autowired
	UserServiceImpl userServiceImpl;
	

	@GetMapping("/user")
	public ResponseEntity<List<User>>getAllUsers() throws UserNotFoundException
	{
		List<User> newUser=userServiceImpl.getAllRecords();
		return new ResponseEntity<>(newUser,HttpStatus.OK);
	}
	
	@PostMapping("/user")
	public ResponseEntity<User> addUser(@RequestBody User User) throws UserFoundException 
	{
		User newUser=userServiceImpl.saveUser(User);
		return new ResponseEntity<>(newUser,HttpStatus.CREATED);
		}
		
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable String id) throws UserNotFoundException{

		User User=userServiceImpl.getUser(id);
		return new ResponseEntity<>(User,HttpStatus.OK);

	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<?> updateUser(@PathVariable String id,@RequestBody User User) throws UserNotFoundException{
		User updateUser=new User();
		updateUser.setuserId(User.getuserId());
		updateUser.setPassword(User.getPassword());
		updateUser.setName(User.getName());
		updateUser.setAddress(User.getAddress());
		updateUser.setContactNo(User.getContactNo());
		userServiceImpl.updateUser(User);
		return new ResponseEntity<>(HttpStatus.OK);

	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable String id) throws UserNotFoundException
	{
		userServiceImpl.deleteUser(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
