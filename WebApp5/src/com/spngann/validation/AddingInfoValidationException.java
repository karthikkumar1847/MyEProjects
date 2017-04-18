package com.spngann.validation;

public class AddingInfoValidationException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String errorMsg;
	public AddingInfoValidationException(String errorMsg) {
	
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
