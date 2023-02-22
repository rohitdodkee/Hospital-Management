package com.hospital.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pharmacist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pharmacistId;
	private String firstName;
	private String lastName;
	private Long phoneNumber;
	
	@Override
	public String toString() {
		return "Pharmacist [pharmacistId=" + pharmacistId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	public Pharmacist(Long pharmacistId, String firstName, String lastName, Long phoneNumber) {
		super();
		this.pharmacistId = pharmacistId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}
	public Pharmacist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getPharmacistId() {
		return pharmacistId;
	}
	public void setPharmacistId(Long pharmacistId) {
		this.pharmacistId = pharmacistId;
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
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
		
	
	
}
