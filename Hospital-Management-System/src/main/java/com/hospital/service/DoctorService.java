package com.hospital.service;

import java.util.List;

import com.hospital.entity.Appointment;
import com.hospital.entity.Patient;


public interface DoctorService {
	
	List<Patient> getPatient();
	List<Appointment> getAppointment();
	
	

}
