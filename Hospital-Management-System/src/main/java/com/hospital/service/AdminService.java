package com.hospital.service;

import java.util.List;

import com.hospital.entity.Admin;
import com.hospital.entity.Doctor;
import com.hospital.entity.Pharmacist;
import com.hospital.entity.Receptionist;

public interface AdminService {
	Admin addAdmin(Admin admin);
	List<Admin> getAllAdmin();
	Admin updateAdminById(Long id, Admin admin);
	String deleteAdminById(Long id);
	
	Doctor addDoctor(Doctor doctor);
	List<Doctor> getAllDoctors();
	String deleteDoctorById(Long id);
	
	Receptionist addReceptionist(Receptionist receptionist);
	List<Receptionist> getAllReceptionists();
	String deleteReceptionistById(Long id);
	
	Pharmacist addPharmacist(Pharmacist pharmacist);
	List<Pharmacist> getAllPharmacists();
	String deletePharmacistById(Long id);
}
