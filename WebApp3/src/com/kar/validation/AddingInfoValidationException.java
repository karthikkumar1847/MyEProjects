package com.kar.validation;

public class AddingInfoValidationException extends Exception{

	private String errorMessage;
	
	public AddingInfoValidationException(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
