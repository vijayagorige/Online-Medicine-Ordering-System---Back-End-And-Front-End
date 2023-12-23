package com.medicine.serviceimpl;


import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.medicine.entity.MedicineRecords;
import com.medicine.medicineservice.MedicineService;
import com.medicine.repository.MedicineRepository;
import com.medicine.userExceptions.UserNotFoundException;

@Service
public class MedicineServiceImpl implements MedicineService{
	private MedicineRepository medicineRepository;

	public MedicineServiceImpl(MedicineRepository medicineRepository) {
		super();
		this.medicineRepository = medicineRepository;
	}

	@Override
	public List<MedicineRecords> getAllRecords()  throws UserNotFoundException{
		List<MedicineRecords> medicinelist=medicineRepository.findAll();
		if(medicinelist.isEmpty()) 
		{
			throw new UserNotFoundException("NO records are there.Please add records 1st!");
		}
		else
			return medicinelist;
	}

	@Override
	public MedicineRecords saveMedicineRecord(MedicineRecords medicineRecords) {
		return medicineRepository.save(medicineRecords);
	}

	@Override
	public MedicineRecords getrecord(Integer id) throws UserNotFoundException {
		Optional<MedicineRecords> checkmedicine=medicineRepository.findById(id);
		if(checkmedicine.isPresent())
		{
			return medicineRepository.findById(id).get();
		}
		else
		{
			throw new UserNotFoundException("There is no record with this id");
		}
		
	}
    
	@Override
	public MedicineRecords updateMedicineRecords(MedicineRecords medicineRecords)  throws UserNotFoundException{
		Optional<MedicineRecords> checkmedicine=medicineRepository.findById(medicineRecords.getId());
		if(checkmedicine.isPresent())
		{
			   MedicineRecords existingRecord = medicineRepository.findById(medicineRecords.getId()).get();
			   existingRecord.setCompanyName(medicineRecords.getCompanyName());
			   existingRecord.setMedicine_name(medicineRecords.getMedicine_name());
			   existingRecord.setDosage(medicineRecords.getDosage());
			   existingRecord.setExpiryDate(medicineRecords.getExpiryDate());
			   existingRecord.setPrice(medicineRecords.getPrice());
			   existingRecord.setStock(medicineRecords.getStock());
			   existingRecord.setUses(medicineRecords.getUses());
			   MedicineRecords updatedRecord = medicineRepository.save(existingRecord);
			   return updatedRecord;
		}
		else
		{
			throw new UserNotFoundException("There is no record with this id");
		}
	}

	@Override
	public MedicineRecords deleteMedicineRecord(Integer id)  throws UserNotFoundException{
		Optional<MedicineRecords> checkmedicine=medicineRepository.findById(id);
		if(checkmedicine.isPresent())
		{
		    medicineRepository.deleteById(id);
		   
		}
		else
		{
			throw new UserNotFoundException("There is no record with this id");
		}
		return null;
		
		
	}
	
	@Override
	public List<MedicineRecords> findByMedicine_name(String medicine_name) throws UserNotFoundException
	{
		List<MedicineRecords> checkmedicine=medicineRepository.findByMedicine_name(medicine_name);
		if(!checkmedicine.isEmpty())
		{
			return medicineRepository.findByMedicine_name(medicine_name);
		}
		else
		{
			throw new UserNotFoundException("There is no record with this medicine name");
		}
		 
	}
	
	
}
