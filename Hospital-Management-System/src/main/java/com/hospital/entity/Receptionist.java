package com.hospital.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Receptionist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long receptionistId;
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private String city;
	private Date joiningDate;
	private Date birthDate;
	private int status;

	
	
	@Override
	public String toString() {
		return "Receptionist [receptionistId=" + receptionistId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", email=" + email + ", city=" + city + ", joiningDate=" + joiningDate
				+ ", birthDate=" + birthDate + ", status=" + status + "]";
	}

	public Long getreceptionistId() {
		return receptionistId;
	}

	public void setreceptionistId(Long receptionistId) {
		this.receptionistId = receptionistId;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Receptionist(Long receptionistId, String firstName, String lastName, String gender, String email, String city,
			String department, Date joiningDate, Date birthDate, int status) {
		super();
		this.receptionistId = receptionistId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.city = city;
		this.joiningDate = joiningDate;
		this.birthDate = birthDate;
		this.status = status;
	}

	public Receptionist() {
		super();
	}
	
	

}
