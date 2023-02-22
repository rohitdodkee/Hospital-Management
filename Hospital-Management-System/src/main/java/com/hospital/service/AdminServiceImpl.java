package com.hospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entity.Admin;
import com.hospital.entity.Doctor;
import com.hospital.entity.Pharmacist;
import com.hospital.entity.Receptionist;
import com.hospital.exception.IdNotFoundException;
import com.hospital.repository.AdminRepository;
import com.hospital.repository.DoctorRepository;
import com.hospital.repository.PharmacistRepository;
import com.hospital.repository.ReceptionistRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	DoctorRepository doctorRepository;
	
	@Autowired
	PharmacistRepository pharmacistRepository;
	
	@Autowired
	ReceptionistRepository receptionistRepository;
	
	@Override
	public Admin addAdmin(Admin admin) {
		return adminRepository.save(admin);
	}

	@Override
	public List<Admin> getAllAdmin() {
		return adminRepository.findAll();
	}


	@Override
	public Admin updateAdminById(Long id, Admin admin) {
		Optional<Admin> a = adminRepository.findById(id);
		if(a.isPresent()) {
			return adminRepository.save(admin);
		}else {
			throw new IdNotFoundException("No such ID found!!");
		}
	}

	@Override
	public String deleteAdminById(Long id) {
		Optional<Admin> a = adminRepository.findById(id);
		if(a.isPresent()) {
		    adminRepository.deleteById(id);
		  return "Admin Deleated!";
		}else {
			throw new IdNotFoundException("No such Id found!");
		}
		
	}

	@Override
	public Doctor addDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		return doctorRepository.findAll();
	}

	@Override
	public String deleteDoctorById(Long id) {
		Optional<Doctor> d = doctorRepository.findById(id);
		if(d.isPresent()) {
		   doctorRepository.deleteById(id);
		  return "Doctor Deleated!";
		}else {
			throw new IdNotFoundException("No such Id found!");
		}
		
	}

	@Override
	public Receptionist addReceptionist(Receptionist receptionist) {
		return receptionistRepository.save(receptionist);
	}

	@Override
	public List<Receptionist> getAllReceptionists() {
		return receptionistRepository.findAll();
	}

	@Override
	public String deleteReceptionistById(Long id) {
		Optional<Receptionist> r = receptionistRepository.findById(id);
		if(r.isPresent()) {
		   receptionistRepository.deleteById(id);
		  return "Receptionist Deleated!";
		}else {
			throw new IdNotFoundException("No such Id found!");
		}
	}

	@Override
	public Pharmacist addPharmacist(Pharmacist pharmacist) {
		  return pharmacistRepository.save(pharmacist);
	}

	@Override
	public List<Pharmacist> getAllPharmacists() {
		return pharmacistRepository.findAll();
	}

	@Override
	public String deletePharmacistById(Long id) {
		Optional<Pharmacist> r = pharmacistRepository.findById(id);
		if(r.isPresent()) {
		   pharmacistRepository.deleteById(id);
		  return "Pharmacist Deleated!";
		}else {
			throw new IdNotFoundException("No such Id found!");
		}

}
}
