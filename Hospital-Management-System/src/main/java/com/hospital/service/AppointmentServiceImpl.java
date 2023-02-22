package com.hospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entity.Appointment;
import com.hospital.exception.IdNotFoundException;
import com.hospital.repository.AppointmentRepository;
@Service
public class AppointmentServiceImpl implements AppointmentService{

	@Autowired
	AppointmentRepository appointmentRepository;
	
	@Override
	public Appointment addAppointment(Appointment appointment) {
		return appointmentRepository.save(appointment);
	}

	@Override
	public List<Appointment> getAllAppointments() {
		return appointmentRepository.findAll();
	}

	@Override
	public Appointment getAppointmentById(Long id) {
		Optional<Appointment> ap = appointmentRepository.findById(id);
		if(ap.isPresent()) {
			return ap.get()	;
		}else
			throw new IdNotFoundException("No such id present!");
		}
	

	@Override
	public Appointment updateAppointmentById(Long id, Appointment appointment) {
		Optional<Appointment> ap = appointmentRepository.findById(id);
		if(ap.isPresent()) {
			return appointmentRepository.save(appointment);
		} else {
				throw new IdNotFoundException("No such ID is present");
			}
		}


	@Override
	public String deleteAppointmentById(Long id) {
		Optional<Appointment> ap = appointmentRepository.findById(id);
		if(ap.isPresent()) {
			appointmentRepository.deleteById(id);
			return "Appointment Deleated!";
		} else {
			throw new IdNotFoundException("No id is present!");
		}


	}
}

