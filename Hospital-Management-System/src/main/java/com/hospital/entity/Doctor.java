package com.hospital.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long doctorId;
	private String firstName;
	private String lastName;
	private String birthDate;
	private String Gender;
	private String emailId;
	private Long mobileNo;
	private Date joiningDate;
	private String city;
	private String role;
	private String Qualification;
	private String Sepcialization;
	private Double doctorFees;
	
	private int status;
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(Long doctorId, String firstName, String lastName, String birthDate, String gender, String emailId,
			Long mobileNo, Date joiningDate, String city, String role, String qualification, String sepcialization,
			Double doctorFees, int status) {
		super();
		this.doctorId = doctorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		Gender = gender;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.joiningDate = joiningDate;
		this.city = city;
		this.role = role;
		Qualification = qualification;
		Sepcialization = sepcialization;
		this.doctorFees = doctorFees;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", fisrtName=" + firstName + ", lastName=" + lastName + ", birthDate="
				+ birthDate + ", Gender=" + Gender + ", emailId=" + emailId + ", mobileNo=" + mobileNo
				+ ", joiningDate=" + joiningDate + ", city=" + city + ", role=" + role + ", Qualification="
				+ Qualification + ", Sepcialization=" + Sepcialization + ", doctorFees=" + doctorFees + ", status="
				+ status + "]";
	}

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public String getFisrtName() {
		return firstName;
	}

	public void setFisrtName(String fisrtName) {
		this.firstName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	public String getSepcialization() {
		return Sepcialization;
	}

	public void setSepcialization(String sepcialization) {
		Sepcialization = sepcialization;
	}

	public Double getDoctorFees() {
		return doctorFees;
	}

	public void setDoctorFees(Double doctorFees) {
		this.doctorFees = doctorFees;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
	

}
