package com.hospital.service;

import java.util.List;

import com.hospital.entity.Appointment;
import com.hospital.entity.Patient;

public interface ReceptionistService {
	
	Appointment addAppointment(Appointment appointment);
	List<Appointment> getAllAppointments();
	
	Patient addPatient(Patient patient);
	List<Patient> getAllPatients();
}
