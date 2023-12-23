package com.medicine.medicineservice;
import java.util.List;
import com.medicine.entity.UserLogin;
import com.medicine.userExceptions.UserFoundException;
import com.medicine.userExceptions.UserNotFoundException;

public interface UserLoginService {
	
	List<UserLogin> getAllRecords()throws UserNotFoundException;
	
	UserLogin saveUserLogin(UserLogin UserLogin)throws UserFoundException,UserNotFoundException;
	
	UserLogin getUserLogin(String id)throws UserNotFoundException;
	
	UserLogin updateUserLogin(UserLogin UserLogin)throws UserNotFoundException;
	
	String deleteUserLogin(String id)throws UserNotFoundException;

}
