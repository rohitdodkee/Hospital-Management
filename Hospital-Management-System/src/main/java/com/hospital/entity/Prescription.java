package com.hospital.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Prescription {
	
	@Id
	private Long patientid;
	private String firstName;
	private String lastName;
	private String bloodGroup;
	private String phoneNo;
	private Date birthDate;
	private String gender;
	private String medicine;
	private String Description;
	public Long getPatientid() {
		return patientid;
	}
	public void setPatientid(Long patientid) {
		this.patientid = patientid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
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
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Prescription(Long patientid, String firstName, String lastName, String bloodGroup, String phoneNo,
			Date birthDate, String gender, String medicine, String description) {
		super();
		this.patientid = patientid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bloodGroup = bloodGroup;
		this.phoneNo = phoneNo;
		this.birthDate = birthDate;
		this.gender = gender;
		this.medicine = medicine;
		Description = description;
	}
	public Prescription() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Prescription [patientid=" + patientid + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", bloodGroup=" + bloodGroup + ", phoneNo=" + phoneNo + ", birthDate=" + birthDate + ", gender="
				+ gender + ", medicine=" + medicine + ", Description=" + Description + "]";
	}

	
	
	

}
