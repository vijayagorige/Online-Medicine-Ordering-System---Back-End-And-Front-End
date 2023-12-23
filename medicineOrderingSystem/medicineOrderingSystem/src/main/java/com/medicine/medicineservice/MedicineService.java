package com.medicine.medicineservice;
import java.util.List;
import com.medicine.entity.MedicineRecords;
import com.medicine.userExceptions.UserNotFoundException;

public interface MedicineService {
	
	List<MedicineRecords> getAllRecords()  throws UserNotFoundException;
	
	MedicineRecords saveMedicineRecord(MedicineRecords medicineRecords);
	
	MedicineRecords updateMedicineRecords(MedicineRecords medicineRecords)  throws UserNotFoundException;
	
	MedicineRecords deleteMedicineRecord(Integer id)  throws UserNotFoundException;

	MedicineRecords getrecord(Integer id)  throws UserNotFoundException;
	
	List<MedicineRecords> findByMedicine_name(String medicine_name) throws UserNotFoundException;
}
