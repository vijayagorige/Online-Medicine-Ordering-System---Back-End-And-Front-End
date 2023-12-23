package com.medicine.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicine.entity.DeliveryBoy;
import com.medicine.medicineservice.DeliveryBoyService;
import com.medicine.repository.DeliveryBoyRepository;
import com.medicine.userExceptions.UserFoundException;
import com.medicine.userExceptions.UserNotFoundException;

@Service
public class DeliveryBoyServiceImpl implements DeliveryBoyService {

	@Autowired
	private DeliveryBoyRepository deliveryBoyRepository;

	@Override
	public List<DeliveryBoy> getAllRecords()throws UserNotFoundException {
		List<DeliveryBoy> DeliveryBoylist=deliveryBoyRepository.findAll();
		if(DeliveryBoylist.isEmpty()) 
		{
			throw new UserNotFoundException("NO records are there.Please create user 1st!");
		}
		else
			return deliveryBoyRepository.findAll();
	}

	@Override
	public DeliveryBoy saveDeliveryBoy(DeliveryBoy DeliveryBoy) throws UserFoundException {
		Optional<DeliveryBoy> existDeliveryBoy=deliveryBoyRepository.findById(DeliveryBoy.getLoginid());
		if(existDeliveryBoy.isPresent())
		{
			throw new UserFoundException("This DeliveryBoy already exist!please login with other loginid");
		}
		else
			return deliveryBoyRepository.save(DeliveryBoy);	
	}

	@Override
	public DeliveryBoy getDeliveryBoy(String id) throws UserNotFoundException{
		Optional<DeliveryBoy> checkDeliveryBoy=deliveryBoyRepository.findById(id);
		if(checkDeliveryBoy.isPresent())
		{
			return deliveryBoyRepository.findById(id).get();
		}
		else
		{
			throw new UserNotFoundException("There is no DeliveryBoy with this id");
		}
	}

	@Override
	public DeliveryBoy updateDeliveryBoy(DeliveryBoy DeliveryBoy) throws UserNotFoundException{
		Optional<DeliveryBoy> checkDeliveryBoy=deliveryBoyRepository.findById(DeliveryBoy.getLoginid());
		if(checkDeliveryBoy.isPresent())
		{
			return deliveryBoyRepository.save(DeliveryBoy);
		}
		else
		{
			throw new UserNotFoundException("There is no DeliveryBoy with this id");
		}
	}

	@Override
	public DeliveryBoy deleteDeliveryBoy(String id) throws UserNotFoundException{
		Optional<DeliveryBoy> checkDeliveryBoy=deliveryBoyRepository.findById(id);
		if(checkDeliveryBoy.isPresent())
		{
			deliveryBoyRepository.deleteById(id);
		}
		else
		{
			throw new UserNotFoundException("There is no DeliveryBoy with this id");
		}
		return null;
		
	}
}
