package com.medicine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicine.entity.MedicineRecords;
import com.medicine.serviceimpl.MedicineServiceImpl;
import com.medicine.userExceptions.UserNotFoundException;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class MedicineController {
	@Autowired
	private MedicineServiceImpl medicineServiceimpl;

	
	@GetMapping("/records")
	public ResponseEntity<List<MedicineRecords>> getAllRecords() throws UserNotFoundException
	{
		List<MedicineRecords> newmedicine= medicineServiceimpl.getAllRecords();
		return new ResponseEntity<>(newmedicine,HttpStatus.OK);
	}
	

	@PostMapping("/records")
	public ResponseEntity<MedicineRecords> insert(@RequestBody MedicineRecords medicineRecords){
		MedicineRecords newmedicine=medicineServiceimpl.saveMedicineRecord(medicineRecords);
		return new ResponseEntity<>(newmedicine,HttpStatus.CREATED);
	}

	@GetMapping("/records/{id}")
    public ResponseEntity<MedicineRecords> getMedicineRecord(@PathVariable Integer id)  throws UserNotFoundException
	{
		MedicineRecords medicine=medicineServiceimpl.getrecord(id);
		return new ResponseEntity<>(medicine,HttpStatus.OK);
    }
	
	@PutMapping("/records/{id}")
	public ResponseEntity<MedicineRecords> updateMedicineRecords(@PathVariable Integer id,@RequestBody MedicineRecords medicineRecords)  throws UserNotFoundException
	{
		MedicineRecords newRecords= medicineServiceimpl.updateMedicineRecords(medicineRecords);
		return new ResponseEntity<>(newRecords, HttpStatus.OK);
	}
	
	@DeleteMapping("/records/{id}")
	public ResponseEntity <?> deleteMedicineRecord(@PathVariable("id")Integer id)  throws UserNotFoundException
	{
		return new ResponseEntity<> (medicineServiceimpl.deleteMedicineRecord(id),HttpStatus.OK);
	}
	@GetMapping("/newrecords/{medicine_name}")
    public ResponseEntity<List<MedicineRecords>>findByMedicine_name(@PathVariable("medicine_name")String medicine_name)throws UserNotFoundException{
        List<MedicineRecords> da= medicineServiceimpl.findByMedicine_name(medicine_name);
        return new ResponseEntity<>(da, HttpStatus.OK);
    }
}
