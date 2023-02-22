package com.hospital.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "GenerateBill")
public class GenerateBill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "receipt_id")
	private Long receiptId;
	private String patientNane;
	private String doctorName;
	private Date date;
	private String medicineDetails;
	private Long patientId;
	
	
	@Override
	public String toString() {
		return "GenerateBill [receiptId=" + receiptId + ", patientNane=" + patientNane + ", doctorName=" + doctorName
				+ ", date=" + date + ", prescription=" + ", medicineDetails="
				+ medicineDetails + ", patientId=" + patientId +  "]";
	}
	public GenerateBill(Long receiptId, String patientNane, String doctorName, Date date, String prescription,
			String detail, String medicineDetails, Long patientId) {
		super();
		this.receiptId = receiptId;
		this.patientNane = patientNane;
		this.doctorName = doctorName;
		this.date = date;
		this.medicineDetails = medicineDetails;
		this.patientId = patientId;
	}
	public Long getReceiptId() {
		return receiptId;
	}
	public void setReceiptId(Long receiptId) {
		this.receiptId = receiptId;
	}
	public String getPatientNane() {
		return patientNane;
	}
	public void setPatientNane(String patientNane) {
		this.patientNane = patientNane;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getMedicineDetails() {
		return medicineDetails;
	}
	public void setMedicineDetails(String medicineDetails) {
		this.medicineDetails = medicineDetails;
	}
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	
	
	
	
	

}
