package com.medicine.medicineservice;
import java.util.List;
import com.medicine.entity.DeliveryBoy;
import com.medicine.userExceptions.UserFoundException;
import com.medicine.userExceptions.UserNotFoundException;

public interface DeliveryBoyService {
	
	List<DeliveryBoy> getAllRecords() throws UserNotFoundException;
	
	DeliveryBoy saveDeliveryBoy(DeliveryBoy deliveryboy) throws UserFoundException;
	
	DeliveryBoy getDeliveryBoy(String id) throws UserNotFoundException;
	
	DeliveryBoy updateDeliveryBoy(DeliveryBoy deliveryboy) throws UserNotFoundException;
	
	DeliveryBoy deleteDeliveryBoy(String id) throws UserNotFoundException;

}
