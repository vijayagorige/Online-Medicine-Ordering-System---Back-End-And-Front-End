package com.medicine.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.medicine.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,String> {
	@Query("select password from User x where x.password=?1")
	String findPassword(String Password);
	@Query("select x from User x where x.userId=?1")
	User findUser(String userId);

}
