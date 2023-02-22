package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entity.Appointment;
import com.hospital.entity.Patient;
import com.hospital.service.DoctorService;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
	
	@Autowired
	DoctorService doctorService;

	@GetMapping("/patients")
	public List<Patient> getAllPatients(){
		return doctorService.getPatient();
	}
	
	@GetMapping("/appointments")
	public List<Appointment> getAllAppointment(){
		return doctorService.getAppointment();
	}
}
