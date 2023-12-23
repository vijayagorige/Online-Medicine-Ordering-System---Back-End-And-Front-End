package com.medicine.serviceimpl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.medicine.entity.Admin;
import com.medicine.medicineservice.AdminService;
import com.medicine.repository.AdminRepository;
import com.medicine.userExceptions.UserNotFoundException;

@Service
public class Adminserviceimpl implements AdminService{
	
	@Autowired
	private AdminRepository adminRepository;


	@Override
	public Admin getAdmin(String id) throws UserNotFoundException{
		Optional<Admin> checkadmin=adminRepository.findById(id);
		if(checkadmin.isPresent())
		{
			return adminRepository.findById(id).get();
		}
		else
		{
			throw new UserNotFoundException("There is no admin with this id");
		}
	}
}
