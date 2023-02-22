package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entity.Appointment;
import com.hospital.entity.Patient;
import com.hospital.repository.AppointmentRepository;
import com.hospital.repository.PatientRepository;

@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	PatientRepository patientRepository;
	
	@Autowired
	AppointmentRepository appointmentRepository;
	
	
	@Override
	public List<Patient> getPatient() {
		return patientRepository.findAll();
	}
	
	@Override
	public List<Appointment> getAppointment() {
		return appointmentRepository.findAll();
	}	
	
}
