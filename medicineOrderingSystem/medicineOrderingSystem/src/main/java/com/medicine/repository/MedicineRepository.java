package com.medicine.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.medicine.entity.MedicineRecords;

import jakarta.transaction.Transactional;
@Repository
public interface MedicineRepository  extends JpaRepository<MedicineRecords,Integer>
{
	@Query("select x from MedicineRecords x where x.medicine_name=?1")
	List findByMedicine_name(String medicine_name);
	
	@Query("select price from MedicineRecords x where x.companyName=?1")
	double findByPrice(String company_name);
	
	@Query("select companyName from MedicineRecords x where x.companyName=?1")
	String findBycompanyName(String company_name);
	
	@Query("select stock from MedicineRecords x where x.companyName=?1")
	int stock(String company_name);
	
	@Query("select id from MedicineRecords x where x.companyName=?1")
	int findId(String company_name);
	
	@Modifying
	@Transactional
	@Query("update MedicineRecords x set x.stock =:stock where x.companyName=:company_name and x.id=:id")
	void setstock(int id,int stock,String company_name);
}
