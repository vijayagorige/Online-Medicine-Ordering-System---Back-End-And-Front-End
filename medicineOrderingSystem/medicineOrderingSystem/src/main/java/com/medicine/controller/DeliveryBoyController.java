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

import com.medicine.entity.DeliveryBoy;
import com.medicine.serviceimpl.DeliveryBoyServiceImpl;
import com.medicine.userExceptions.UserFoundException;
import com.medicine.userExceptions.UserNotFoundException;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class DeliveryBoyController {
	@Autowired
    DeliveryBoyServiceImpl deliveryboyserviceimpl;
	
	
	
	@GetMapping("/deliveryboy")
	public ResponseEntity<List<DeliveryBoy>>getAllDeliveryBoys() throws UserNotFoundException
	{
		List<DeliveryBoy> newdeliveryboy=deliveryboyserviceimpl.getAllRecords();
		return new ResponseEntity<>(newdeliveryboy,HttpStatus.OK);
	}
	
	@PostMapping("/deliveryboy")
	public ResponseEntity<DeliveryBoy> addDeliveryBoy(@RequestBody DeliveryBoy deliveryboy) throws UserFoundException{
		DeliveryBoy newdeliveryboy=deliveryboyserviceimpl.saveDeliveryBoy(deliveryboy);
		return new ResponseEntity<>(newdeliveryboy,HttpStatus.CREATED);
	}
	
	@GetMapping("/deliveryboy/{id}")
	public ResponseEntity<DeliveryBoy> getDeliveryBoyById(@PathVariable String id)throws UserNotFoundException {
		
		DeliveryBoy deliveryboy=deliveryboyserviceimpl.getDeliveryBoy(id);
		return new ResponseEntity<>(deliveryboy,HttpStatus.OK);
	}
	
	@PutMapping("/deliveryboy/{id}")
	public ResponseEntity<DeliveryBoy> updateDeliveryBoy(@PathVariable String id,@RequestBody DeliveryBoy deliveryboy) throws UserNotFoundException {
		DeliveryBoy updatedeliveryboy=new DeliveryBoy();
		updatedeliveryboy.setPassword(deliveryboy.getPassword());
		updatedeliveryboy.setContactno(deliveryboy.getContactno());
		updatedeliveryboy.setName(deliveryboy.getName());
		DeliveryBoy updatedeliveryboynew=deliveryboyserviceimpl.updateDeliveryBoy(deliveryboy);
		return new ResponseEntity<>(updatedeliveryboynew,HttpStatus.OK);
	}
	
	@DeleteMapping("/deliveryboy/{id}")
	public ResponseEntity<?> deleteDeliveryBoy(@PathVariable String id)throws UserNotFoundException
	{
		DeliveryBoy deletedeliveryboy=deliveryboyserviceimpl.deleteDeliveryBoy(id);
		return new ResponseEntity<>(deletedeliveryboy,HttpStatus.OK);
	}
}
