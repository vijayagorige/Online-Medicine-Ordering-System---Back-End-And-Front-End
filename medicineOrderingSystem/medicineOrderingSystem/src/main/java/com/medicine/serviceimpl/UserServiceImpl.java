package com.medicine.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicine.entity.User;
import com.medicine.medicineservice.UserService;
import com.medicine.repository.UserRepository;
import com.medicine.userExceptions.UserFoundException;
import com.medicine.userExceptions.UserNotFoundException;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;
	
	public UserServiceImpl()
	{
		
	}

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAllRecords()throws UserNotFoundException {
		List<User> userlist=userRepository.findAll();
		if(userlist.isEmpty()) 
		{
			throw new UserNotFoundException("NO records are there.Please register 1st!");
		}
		else
			return userRepository.findAll();
	}

	@Override
	public User saveUser(User user) throws UserFoundException {
		Optional<User> existuser=userRepository.findById(user.getuserId());
		if(existuser.isPresent())
		{
			throw new UserFoundException("This user already exist!please login with other loginid");
		}
		else
			return userRepository.save(user);	
	}

	@Override
	public User getUser(String id) throws UserNotFoundException{
		Optional<User> checkuser=userRepository.findById(id);
		if(checkuser.isPresent())
		{
			return userRepository.findById(id).get();
		}
		else
		{
			throw new UserNotFoundException("There is no user with this id");
		}
	}

	@Override
	public User updateUser(User user) throws UserNotFoundException{
		Optional<User> checkuser=userRepository.findById(user.getuserId());
		if(checkuser.isPresent())
		{
			return userRepository.save(user);
		}
		else
		{
			throw new UserNotFoundException("There is no user with this id");
		}
	}

	@Override
	public String deleteUser(String id) throws UserNotFoundException{
		Optional<User> checkuser=userRepository.findById(id);
		if(checkuser.isPresent())
		{
			userRepository.deleteById(id);
			return "Record deleted";
		}
		else
		{
			throw new UserNotFoundException("There is no user with this id");
		}
		
	}

}
