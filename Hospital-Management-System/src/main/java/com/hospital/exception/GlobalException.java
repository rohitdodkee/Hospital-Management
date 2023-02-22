package com.hospital.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GlobalException {

	
	public GlobalException() {
		
	}
	
	ResponseEntity<ErrorInfo> myIdException(IdNotFoundException exception){
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorMesage(exception.getMessage());
		errorInfo.setStatus(HttpStatus.NOT_FOUND.toString());
		errorInfo.setLocalDateTime(LocalDateTime.now());
		return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.NOT_FOUND);
	}
}
