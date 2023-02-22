package com.hospital.service;

import java.util.List;

import com.hospital.entity.Medicine;

public interface PharmacistService {
	
	Medicine addMedicine(Medicine medicine);
	List<Medicine> getAllMedicines();

}
