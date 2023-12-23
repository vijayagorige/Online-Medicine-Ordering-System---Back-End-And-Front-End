package com.medicine.medicineservice;
import com.medicine.entity.Admin;
import com.medicine.userExceptions.UserNotFoundException;


public interface AdminService {
		

		Admin getAdmin(String id) throws UserNotFoundException;
}
