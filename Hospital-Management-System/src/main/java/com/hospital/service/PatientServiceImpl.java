package com.hospital.service;

import java.util.List;

import com.hospital.entity.Patient;
import com.hospital.repository.PatientRepository;

public class PatientServiceImpl implements PatientService {
	PatientRepository patientRepository;
	
	@Override
	public Patient addPatient(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> getAllPatient() {
		return patientRepository.findAll();
	}

}
