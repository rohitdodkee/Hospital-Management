package com.hospital.service;

import java.util.List;

import com.hospital.entity.Patient;

public interface PatientService {
	
	Patient addPatient(Patient patient);
	List<Patient> getAllPatient();
	
}
