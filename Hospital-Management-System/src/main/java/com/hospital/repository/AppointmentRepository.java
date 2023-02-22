package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.entity.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long>{

	
}
