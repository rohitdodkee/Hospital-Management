package com.hospital.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long patientid;
	private String name;
	private String lastname;
	private String bloodGroup;
	private String anyAllergies;
	private String phoneNo;
	private Date birthDate;
	private String gender;
	private String email;
	
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(Long patientid, String name, String lastname, String bloodGroup, String anyAllergies, String phoneNo,
			Date birthDate, String gender, String email) {
		super();
		this.patientid = patientid;
		this.name = name;
		this.lastname = lastname;
		this.bloodGroup = bloodGroup;
		this.anyAllergies = anyAllergies;
		this.phoneNo = phoneNo;
		this.birthDate = birthDate;
		this.gender = gender;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Patient [patientid=" + patientid + ", name=" + name + ", lastname=" + lastname + ", bloodGroup="
				+ bloodGroup + ", anyAllergies=" + anyAllergies + ", phoneNo=" + phoneNo + ", birthDate=" + birthDate
				+ ", gender=" + gender + ", email=" + email + "]";
	}
	public Long getPatientid() {
		return patientid;
	}
	public void setPatientid(Long patientid) {
		this.patientid = patientid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAnyAllergies() {
		return anyAllergies;
	}
	public void setAnyAllergies(String anyAllergies) {
		this.anyAllergies = anyAllergies;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
