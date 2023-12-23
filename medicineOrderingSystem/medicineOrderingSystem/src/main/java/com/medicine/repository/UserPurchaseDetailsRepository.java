package com.medicine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.medicine.entity.UserPurchaseDetails;
@Repository
public interface UserPurchaseDetailsRepository extends JpaRepository<UserPurchaseDetails,Integer>{

}
