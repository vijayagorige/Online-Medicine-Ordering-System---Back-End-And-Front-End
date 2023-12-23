package com.medicine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicine.entity.UserLogin;
@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin,String> {
	

}
