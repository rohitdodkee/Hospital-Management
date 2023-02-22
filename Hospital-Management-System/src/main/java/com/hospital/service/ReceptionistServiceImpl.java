package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entity.Appointment;
import com.hospital.entity.Patient;
import com.hospital.repository.AppointmentRepository;
import com.hospital.repository.PatientRepository;

@Service
public class ReceptionistServiceImpl implements ReceptionistService {

	@Autowired
	AppointmentRepository appointmentRepository;
	@Autowired
	PatientRepository patientRepository;
	
	@Override
	public Appointment addAppointment(Appointment appointment) {
			return appointmentRepository.save(appointment);
		
	}

	@Override
	public List<Appointment> getAllAppointments() {
		return appointmentRepository.findAll();
	}

	@Override
	public Patient addPatient(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}

	

	
}
