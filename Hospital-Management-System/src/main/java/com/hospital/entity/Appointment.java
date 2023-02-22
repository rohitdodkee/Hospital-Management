package com.hospital.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Appointment")
	private Long appointmentId;
	private Long patientId;
	private Long staffId;
	private Date appointmentDate;
	private String appointmentTIme;
	private int status;
	
	
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(Long appointmentId, Long patientId, Long staffId, Date appointmentDate, String appointmentTIme,
			int status) {
		super();
		this.appointmentId = appointmentId;
		this.patientId = patientId;
		this.staffId = staffId;
		this.appointmentDate = appointmentDate;
		this.appointmentTIme = appointmentTIme;
		this.status = status;
	}
	
	public String getAppointmentTIme() {
		return appointmentTIme;
	}

	public void setAppointmentTIme(String appointmentTIme) {
		this.appointmentTIme = appointmentTIme;
	}

	public Long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public Long getStaffId() {
		return staffId;
	}
	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", patientId=" + patientId + ", staffId=" + staffId
				+ ", appointmentDate=" + appointmentDate + ", appointmentTIme=" + appointmentTIme + ", status=" + status
				+ "]";
	}
	
	

}
