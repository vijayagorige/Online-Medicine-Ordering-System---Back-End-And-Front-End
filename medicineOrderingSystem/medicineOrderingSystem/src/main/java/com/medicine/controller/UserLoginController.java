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

import com.medicine.entity.UserLogin;
import com.medicine.serviceimpl.UserLoginServiceImpl;
import com.medicine.userExceptions.UserFoundException;
import com.medicine.userExceptions.UserNotFoundException;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class UserLoginController {
	
	@Autowired
    private UserLoginServiceImpl userLoginServiceImpl;

	@GetMapping("/userlogin")
	public ResponseEntity<List<UserLogin>>getAllUserLogins() throws UserNotFoundException
	{
		List<UserLogin> newUserLogin=userLoginServiceImpl.getAllRecords();
		return new ResponseEntity<>(newUserLogin,HttpStatus.OK);
	}
	
	@PostMapping("/userlogin")
	public ResponseEntity<?> addUserLogin(@RequestBody UserLogin UserLogin) throws UserFoundException,UserNotFoundException
	{
		UserLogin newUserLogin = userLoginServiceImpl.saveUserLogin(UserLogin);
		return new ResponseEntity<>(newUserLogin,HttpStatus.CREATED);
		}
		
	
	@GetMapping("/userlogin/{id}")
	public ResponseEntity<UserLogin> getUserLoginById(@PathVariable String id) throws UserNotFoundException{

		UserLogin UserLogin=userLoginServiceImpl.getUserLogin(id);
		return new ResponseEntity<>(UserLogin,HttpStatus.OK);

	}
	
	@PutMapping("/userlogin/{id}")
	public ResponseEntity<UserLogin> updateUserLogin(@PathVariable String id,@RequestBody UserLogin UserLogin) throws UserNotFoundException{
		UserLogin updateUserLogin=new UserLogin();
		updateUserLogin.setId(id);
		updateUserLogin.setPassword(UserLogin.getPassword());
		UserLogin update=userLoginServiceImpl.updateUserLogin(UserLogin);
		return new ResponseEntity<>(update,HttpStatus.OK);

	}
	
	@DeleteMapping("/userlogin/{id}")
	public ResponseEntity<?> deleteUserLogin(@PathVariable String id) throws UserNotFoundException
	{
		userLoginServiceImpl.deleteUserLogin(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

	
	
	
}
