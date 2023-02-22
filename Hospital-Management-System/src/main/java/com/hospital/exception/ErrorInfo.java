package com.hospital.exception;

import java.time.LocalDateTime;

public class ErrorInfo {

	private String errorMesage;
	private String Status;
	private LocalDateTime localDateTime;
	
	
	public ErrorInfo() {
		super();
	}


	public String getErrorMesage() {
		return errorMesage;
	}


	public void setErrorMesage(String errorMesage) {
		this.errorMesage = errorMesage;
	}


	public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}


	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}


	public void setLocalDateTime(LocalDateTime localDateTime2) {
		this.localDateTime = localDateTime2;
	}
	
	
}
