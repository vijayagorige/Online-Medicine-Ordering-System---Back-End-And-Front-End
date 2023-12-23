package com.medicine.medicineservice;
import java.util.List;
import com.medicine.entity.User;
import com.medicine.userExceptions.UserFoundException;
import com.medicine.userExceptions.UserNotFoundException;

public interface UserService {
	
	List<User> getAllRecords() throws UserNotFoundException;
	
	User saveUser(User user) throws UserFoundException;
	
	User updateUser(User users) throws UserNotFoundException;
	
	User getUser(String userId) throws UserNotFoundException;
	
	String deleteUser(String userId)throws UserNotFoundException;

}
