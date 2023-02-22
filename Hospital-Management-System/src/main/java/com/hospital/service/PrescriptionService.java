package com.hospital.service;

import java.util.List;

import com.hospital.entity.Prescription;

public interface PrescriptionService {

	Prescription addPrescriptionByPatientId(Prescription prescription);
	List<Prescription> getAllPrescriptions();
}
