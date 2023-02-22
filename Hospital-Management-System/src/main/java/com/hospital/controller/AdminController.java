package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entity.Admin;
import com.hospital.entity.Doctor;
import com.hospital.entity.Pharmacist;
import com.hospital.entity.Receptionist;
import com.hospital.service.AdminService;

@RestController
@RequestMapping("/api")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/addAdmin")
	public Admin addAdmin(@RequestBody Admin admin) {
		return adminService.addAdmin(admin);
	}
	
	@GetMapping("/getAdmins")
	public List<Admin> getAllAdmin(){
		return adminService.getAllAdmin();
	}
	
	@PutMapping("/admin/{id}")
	public Admin updateAdminById(@PathVariable Long id,@RequestBody Admin admin) {
		return adminService.updateAdminById(id, admin);
		
	}
	
	@DeleteMapping("/admin/{id}")
	public String deleteAdminById(@PathVariable Long id) {
		return adminService.deleteAdminById(id);
	}
	
	
	
	@PostMapping("/pharmacist")
	public Pharmacist addPharmacist(Pharmacist pharmacist) {
		return adminService.addPharmacist(pharmacist);
	}
	
	@GetMapping("/pharmacist")
	public List<Pharmacist> getAllPharmacist(){
		return adminService.getAllPharmacists();
	}
	
	@DeleteMapping("/pharmacist/{id}")
	public String deletePharmacist(@PathVariable Long id) {
		return adminService.deletePharmacistById(id);
	}
	
	
	
	@PostMapping("/receptionist")
	public Receptionist addReceptionist(Receptionist receptionist) {
		return adminService.addReceptionist(receptionist);
	}
	
	@GetMapping("/receptionists")
	public List<Receptionist> getAllReceptionist(){
		return adminService.getAllReceptionists();
	}
	
	@DeleteMapping("/receptionist/{id}")
	public String deleteReceptionistById(@PathVariable Long id) {
		return adminService.deleteReceptionistById(id);
	}
	
	
	
	@PostMapping("/doctor")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return adminService.addDoctor(doctor);
	}
	
	@GetMapping("/doctors")
	public List<Doctor> getAllDoctors(){
		return adminService.getAllDoctors();
	}
	
	@DeleteMapping("/doctor/{id}")	
	public String deletDoctorById(@PathVariable Long id) {
		return adminService.deleteDoctorById(id);
	}
	
}
