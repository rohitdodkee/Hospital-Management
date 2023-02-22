package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entity.Prescription;
import com.hospital.repository.PrescriptionRepository;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

	@Autowired
	PrescriptionRepository prescriptionRepository;
	
	@Override
	public Prescription addPrescriptionByPatientId(Prescription prescription) {
		return prescriptionRepository.save(prescription);
	}

	@Override
	public List<Prescription> getAllPrescriptions() {
		return prescriptionRepository.findAll();
	}

}
