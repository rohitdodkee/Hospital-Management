package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entity.Medicine;
import com.hospital.service.MedicineService;

@RestController
@RequestMapping("/api/pharma")
public class PharmacistControllr {

	@Autowired
	MedicineService medicineService; 
	
	@PostMapping("/medicine")
	public Medicine addMedicine(Medicine medicine) {
		return medicineService.addMedicine(medicine);
	}
	
	@GetMapping("/medicine")
	public List<Medicine> getAllMedicine(){
		return medicineService.getAllMedicines();
	}
}
