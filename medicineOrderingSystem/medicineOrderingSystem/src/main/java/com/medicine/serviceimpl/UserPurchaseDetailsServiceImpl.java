package com.medicine.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicine.entity.User;
import com.medicine.entity.UserPurchaseDetails;
import com.medicine.medicineservice.UserPurchaseDetailsService;
import com.medicine.repository.MedicineRepository;
import com.medicine.repository.UserPurchaseDetailsRepository;
import com.medicine.repository.UserRepository;
import com.medicine.userExceptions.LengthException;
import com.medicine.userExceptions.UserNotFoundException;
@Service
public class UserPurchaseDetailsServiceImpl implements UserPurchaseDetailsService {

	@Autowired
	private UserPurchaseDetailsRepository userPurchaseDetailsRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private MedicineRepository medicineRepository;
	
	public UserPurchaseDetailsServiceImpl(UserPurchaseDetailsRepository userPurchaseDetailsRepository) {
		super();
		this.userPurchaseDetailsRepository = userPurchaseDetailsRepository;
	}

	@Override
	public List<UserPurchaseDetails> getAllRecords() throws UserNotFoundException{
		List<UserPurchaseDetails> UserPurchaseDetailsList=userPurchaseDetailsRepository.findAll();
		if(UserPurchaseDetailsList.isEmpty()) 
		{
			throw new UserNotFoundException("NO records are there");
		}
		else
			return UserPurchaseDetailsList;
	}

	@Override
	public UserPurchaseDetails saveUserPurchaseDetails(UserPurchaseDetails userPurchaseDetails)throws UserNotFoundException,LengthException
	{	
		User user=userRepository.findUser(userPurchaseDetails.getUserId());
		if(user!=null) {
		if(userPurchaseDetails.getDeliveryaddress()==null)
		{
			userPurchaseDetails.setDeliveryaddress(user.getAddress());
		}
		else
		{
			if(userPurchaseDetails.getDeliveryaddress().length()>30) 
			{
				throw new LengthException("address should have length less than 30 letters");
			}
		}
		if(userPurchaseDetails.getContactNo()==null)
		{
			userPurchaseDetails.setContactNo(user.getContactNo());
		}
		else
		{
			if(userPurchaseDetails.getContactNo().length()!=10) 
			{
				throw new LengthException("Contact Number should have 10 digits");
			}
		}
		if(userPurchaseDetails.getCompanyName()!=null)
		{
			String medlist=medicineRepository.findBycompanyName(userPurchaseDetails.getCompanyName());
			if(medlist!=null)
			{
				int purchased=userPurchaseDetails.getQuantity();
				int stock=medicineRepository.stock(medlist);
				if(purchased<=stock && purchased!=0)
				{
					int id=medicineRepository.findId(medlist);
					int updatedStock=stock-purchased;
					medicineRepository.setstock(id, updatedStock, medlist);
					double cost=medicineRepository.findByPrice(userPurchaseDetails.getCompanyName());
					userPurchaseDetails.setTotalCost(cost);
				}
				else if(purchased==0)
				{
					throw new UserNotFoundException("select atleast 1 element quantity should not be null");
				}
				else
				{
					throw new UserNotFoundException("stock is not sufficient for this product and we have "+medicineRepository.stock(medlist)+"  only");
				}
			}
			else
			{
				throw new UserNotFoundException("This medicine is not available");
			}
		}
		else
		{
			throw new UserNotFoundException("Select any Medicine");
		}
		return userPurchaseDetailsRepository.save(userPurchaseDetails);
		}
		else
		{
			throw new UserNotFoundException("User is not present");
		}
	}

	@Override
	public UserPurchaseDetails getUserPurchaseDetails(Integer id) throws UserNotFoundException{
		Optional<UserPurchaseDetails> checkuserPurchaseDetails=userPurchaseDetailsRepository.findById(id);
		if(checkuserPurchaseDetails.isPresent())
		{
			return userPurchaseDetailsRepository.findById(id).get();
		}
		else
		{
			throw new UserNotFoundException("There is no record with this id");
		}
	}
    
	@Override
	public UserPurchaseDetails updateUserPurchaseDetails(UserPurchaseDetails userPurchaseDetails) throws UserNotFoundException{
		Optional<UserPurchaseDetails> checkuserPurchaseDetails=userPurchaseDetailsRepository.findById(userPurchaseDetails.getOrderNo());
		if(checkuserPurchaseDetails.isPresent())
		{
			return userPurchaseDetailsRepository.save(userPurchaseDetails);
		}
		else
		{
			throw new UserNotFoundException("There is no record with this id");
		}
	}

	@Override
	public UserPurchaseDetails deleteUserPurchaseDetails(Integer id)  throws UserNotFoundException{
		Optional<UserPurchaseDetails> checkuserPurchaseDetails=userPurchaseDetailsRepository.findById(id);
		if(checkuserPurchaseDetails.isPresent())
		{
			userPurchaseDetailsRepository.deleteById(id);
		}
		else
		{
			throw new UserNotFoundException("There is no record with this id");
		}
		return null;
		
		
	}

}
