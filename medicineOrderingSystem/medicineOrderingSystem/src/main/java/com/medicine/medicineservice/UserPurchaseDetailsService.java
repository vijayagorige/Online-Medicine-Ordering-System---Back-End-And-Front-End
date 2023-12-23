package com.medicine.medicineservice;
import java.util.List;
import com.medicine.entity.UserPurchaseDetails;
import com.medicine.userExceptions.LengthException;
import com.medicine.userExceptions.UserNotFoundException;

public interface UserPurchaseDetailsService {
    List<UserPurchaseDetails> getAllRecords() throws UserNotFoundException;
	
    UserPurchaseDetails saveUserPurchaseDetails(UserPurchaseDetails userPurchaseDetails) throws UserNotFoundException,LengthException;
	
    UserPurchaseDetails getUserPurchaseDetails(Integer id) throws UserNotFoundException;
	
    UserPurchaseDetails updateUserPurchaseDetails(UserPurchaseDetails userPurchaseDetails) throws UserNotFoundException;
	
    UserPurchaseDetails deleteUserPurchaseDetails(Integer id) throws UserNotFoundException;
}
