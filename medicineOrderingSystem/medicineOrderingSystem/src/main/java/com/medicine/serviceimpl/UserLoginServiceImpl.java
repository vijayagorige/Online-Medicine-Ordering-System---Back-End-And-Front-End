package com.medicine.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicine.entity.User;
import com.medicine.entity.UserLogin;
import com.medicine.medicineservice.UserLoginService;
import com.medicine.repository.UserLoginRepository;
import com.medicine.repository.UserRepository;
import com.medicine.userExceptions.UserFoundException;
import com.medicine.userExceptions.UserNotFoundException;

@Service
public class UserLoginServiceImpl implements UserLoginService {
	
		@Autowired
		private UserLoginRepository UserLoginRepository;
		@Autowired
		private UserRepository UserRepository;

		@Override
		public List<UserLogin> getAllRecords()throws UserNotFoundException {
			List<UserLogin> UserLoginlist=UserLoginRepository.findAll();
			if(UserLoginlist.isEmpty()) 
			{
				throw new UserNotFoundException("NO records are there.Please create user 1st!");
			}
			else
				return UserLoginRepository.findAll();
		}

		@Override
		public UserLogin saveUserLogin(UserLogin userLogin) throws UserFoundException,UserNotFoundException {
			User user=UserRepository.findUser(userLogin.getId());
			if(user!=null)
			{
			String userPassword=UserRepository.findPassword(user.getPassword());
			String checkloginPassword=userLogin.getPassword();
			
			//checking whether login credentials are correct or not
			if(checkloginPassword.equals(userPassword))
			{
			Optional<UserLogin> existUserLogin=UserLoginRepository.findById(userLogin.getId());
			if(existUserLogin.isPresent())
			{
					return UserLoginRepository.save(userLogin);
			}
			return null;
			}
			else
				throw new UserNotFoundException("Please enter valid password.");
			}
			else
				throw new UserNotFoundException("Please enter valid userid");
		}

		@Override
		public UserLogin getUserLogin(String id) throws UserNotFoundException{
			Optional<UserLogin> checkUserLogin=UserLoginRepository.findById(id);
			if(checkUserLogin.isPresent())
			{
				return UserLoginRepository.findById(id).get();
			}
			else
			{
				throw new UserNotFoundException("There is no UserLogin with this id");
			}
		}

		@Override
		public UserLogin updateUserLogin(UserLogin UserLogin) throws UserNotFoundException{
			Optional<UserLogin> checkUserLogin=UserLoginRepository.findById(UserLogin.getId());
			
			if(checkUserLogin.isPresent())
			{
				return UserLoginRepository.save(UserLogin);
			}
			else
			{
				throw new UserNotFoundException("There is no UserLogin with this id");
			}
		}

		@Override
		public String deleteUserLogin(String id) throws UserNotFoundException{
			Optional<UserLogin> checkUserLogin=UserLoginRepository.findById(id);
			if(checkUserLogin.isPresent())
			{
				UserLoginRepository.deleteById(id);
				return "Record deleted";
			}
			else
			{
				throw new UserNotFoundException("There is no UserLogin with this id");
			}
			
		}
		

}
