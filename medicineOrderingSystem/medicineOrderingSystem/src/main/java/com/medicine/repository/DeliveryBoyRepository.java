package com.medicine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicine.entity.DeliveryBoy;
@Repository
public interface DeliveryBoyRepository extends JpaRepository<DeliveryBoy,String> {

}
