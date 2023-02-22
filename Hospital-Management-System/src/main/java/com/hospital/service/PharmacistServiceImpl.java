package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hospital.entity.Medicine;
import com.hospital.repository.MedicineRepository;

public class PharmacistServiceImpl implements PharmacistService {

	@Autowired
	MedicineRepository medicineRepository;
	
	@Override
	public Medicine addMedicine(Medicine medicine) {
		return medicineRepository.save(medicine);
	}

	@Override
	public List<Medicine> getAllMedicines() {
		return medicineRepository.findAll();
	}

}
