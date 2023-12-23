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

import com.medicine.entity.UserPurchaseDetails;
import com.medicine.serviceimpl.UserPurchaseDetailsServiceImpl;
import com.medicine.userExceptions.LengthException;
import com.medicine.userExceptions.UserNotFoundException;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class UserPurchaseDetailsController {
	@Autowired
    private UserPurchaseDetailsServiceImpl userPurchaseDetailsServiceimpl;
	

	@GetMapping("/userpurchasedetails")
	public ResponseEntity<List<UserPurchaseDetails>>getAllUserPurchaseDetailss() throws UserNotFoundException
	{
		List<UserPurchaseDetails> newuserPurchaseDetails=userPurchaseDetailsServiceimpl.getAllRecords();
		return new ResponseEntity<>(newuserPurchaseDetails,HttpStatus.OK);
	}
	
	@PostMapping("/userpurchasedetails")
	public ResponseEntity<UserPurchaseDetails> addUserPurchaseDetails(@RequestBody UserPurchaseDetails userPurchaseDetails) throws UserNotFoundException,LengthException
	{
		UserPurchaseDetails newuserPurchaseDetails=userPurchaseDetailsServiceimpl.saveUserPurchaseDetails(userPurchaseDetails);
		return new ResponseEntity<>(newuserPurchaseDetails,HttpStatus.CREATED);
		}
		
	
	@GetMapping("/userpurchasedetails/{id}")
	public ResponseEntity<UserPurchaseDetails> getUserPurchaseDetailsById(@PathVariable Integer id) throws UserNotFoundException{

		UserPurchaseDetails userPurchaseDetails=userPurchaseDetailsServiceimpl.getUserPurchaseDetails(id);
		return new ResponseEntity<>(userPurchaseDetails,HttpStatus.OK);

	}
	
	@PutMapping("/userpurchasedetails/{id}")
	public ResponseEntity<UserPurchaseDetails> updateUserPurchaseDetails(@PathVariable Integer id,@RequestBody UserPurchaseDetails userPurchaseDetails) throws UserNotFoundException{
		UserPurchaseDetails updateuserPurchaseDetails=new UserPurchaseDetails();
		updateuserPurchaseDetails.setuserId(userPurchaseDetails.getUserId());
		updateuserPurchaseDetails.setQuantity(userPurchaseDetails.getQuantity());
		updateuserPurchaseDetails.setTotalCost(userPurchaseDetails.getTotalCost());
		updateuserPurchaseDetails.setDeliveryaddress(userPurchaseDetails.getDeliveryaddress());
		updateuserPurchaseDetails.setContactNo(userPurchaseDetails.getContactNo());
		updateuserPurchaseDetails.setCompanyName(userPurchaseDetails.getCompanyName());
		UserPurchaseDetails updateuserPurchaseDetailsnew=userPurchaseDetailsServiceimpl.updateUserPurchaseDetails(userPurchaseDetails);
		return new ResponseEntity<>(updateuserPurchaseDetailsnew,HttpStatus.OK);

	}
	
	@DeleteMapping("/userpurchasedetails/{id}")
	public ResponseEntity<?> deleteUserPurchaseDetails(@PathVariable Integer id) throws UserNotFoundException
	{
		UserPurchaseDetails deletepurchase=userPurchaseDetailsServiceimpl.deleteUserPurchaseDetails(id);
		return new ResponseEntity<>(deletepurchase,HttpStatus.OK);
	}
	

}
