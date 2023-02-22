package com.hospital.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicine_table")
public class Medicine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long medicineId;
	private String nameOfMedicine;
	private String nameOfCompany;
	private String quantityOdMedicine;
	private Double price;
	
	
	public Long getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(Long medicineId) {
		this.medicineId = medicineId;
	}

	public Medicine(Long medicineId, String nameOfMedicine, String nameOfCompany, String quantityOdMedicine,
			Double price) {
		super();
		this.medicineId = medicineId;
		this.nameOfMedicine = nameOfMedicine;
		this.nameOfCompany = nameOfCompany;
		this.quantityOdMedicine = quantityOdMedicine;
		this.price = price;
	}

	
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Medicine [medicineId=" + medicineId + ", nameOfMedicine=" + nameOfMedicine + ", nameOfCompany="
				+ nameOfCompany + ", quantityOdMedicine=" + quantityOdMedicine + ", price=" + price + "]";
	}

	public String getNameOfMedicine() {
		return nameOfMedicine;
	}
	public void setNameOfMedicine(String nameOfMedicine) {
		this.nameOfMedicine = nameOfMedicine;
	}
	public String getNameOfCompany() {
		return nameOfCompany;
	}
	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}
	public String getQuantityOdMedicine() {
		return quantityOdMedicine;
	}
	public void setQuantityOdMedicine(String quantityOdMedicine) {
		this.quantityOdMedicine = quantityOdMedicine;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	

}
