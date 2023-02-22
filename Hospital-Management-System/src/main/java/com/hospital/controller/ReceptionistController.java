package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entity.Appointment;
import com.hospital.entity.Patient;
import com.hospital.service.ReceptionistService;

@RestController
@RequestMapping("/api/receptionist")
public class ReceptionistController {
	
	@Autowired
	ReceptionistService receptionistService;
	
	
	@PostMapping("/appointment")
	public Appointment addAppointment(Appointment appointment) {
		return receptionistService.addAppointment(appointment); 
	}
	
	@GetMapping("/appointments")
	public List<Appointment> getAllAppointments(){
		return receptionistService.getAllAppointments();
	}
	
	@PostMapping("/patient")
	public Patient addPatient(Patient patient) {
		return receptionistService.addPatient(patient);
	}
	
	@GetMapping("/patients")
	public List<Patient> getAllPatients() {
		return receptionistService.getAllPatients();
	}
}
