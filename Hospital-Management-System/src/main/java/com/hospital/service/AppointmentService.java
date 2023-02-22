package com.hospital.service;

import java.util.List;

import com.hospital.entity.Appointment;

public interface AppointmentService {

	Appointment addAppointment(Appointment appointment);
	List<Appointment> getAllAppointments();
	Appointment getAppointmentById(Long id);
	Appointment updateAppointmentById(Long id, Appointment appointment);
	String deleteAppointmentById(Long id);
}
