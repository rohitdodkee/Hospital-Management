package com.hospital.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hospital.entity.Medicine;
import com.hospital.repository.MedicineRepository;
@Service
public class MedicineServiceImpl implements MedicineService {

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
