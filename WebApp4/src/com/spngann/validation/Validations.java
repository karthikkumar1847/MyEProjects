package com.spngann.validation;

public class Validations {

	public Validations() {
		
	}

	public String validateFirstName(String fName){
		if(isDataFieldBlank(fName))
			return ErrorPage.USER_FIRST_NAME;
	return "";
		
	}
	public String validateMiddleName(String mName){
		if(isDataFieldBlank(mName))
			return ErrorPage.USER_MIDDLE_NAME;
	return "";
		
	}
	public String validateLastName(String lName){
		if(isDataFieldBlank(lName))
			return ErrorPage.USER_LAST_NAME;
	return "";
		
	}
	public String validateGender(String gender){
		if(isDataFieldBlank(gender))
			return ErrorPage.USER_GENDER;
	return "";
		
	}
	public String validateAptStreet(String aptStreet){
		if(isDataFieldBlank(aptStreet))
			return ErrorPage.USER_Apt_STREET;
	return "";
		
	}
	
	public String validateCity(String city){
		if(isDataFieldBlank(city))
			return ErrorPage.USER_CITY;
	return "";
		
	}
	public String validateState(String state){
		if(isDataFieldBlank(state))
			return ErrorPage.USER_STATE;
	return "";
		
	}
	public String validateCountry(String country){
		if(isDataFieldBlank(country))
			return ErrorPage.USER_COUNTRY;
	return "";
		
	}
	public String validatePhone(Long phone){
		if(isNotValidPhoneNumber(phone))
			return ErrorPage.USER_PHONE;
	return "";
		
	}
	public String validateBankName(String bankName){
		if(isDataFieldBlank(bankName))
			return ErrorPage.USER_BANK_NAME;
	return "";
		
	}
	public String validateAccountNumber(String accountNumber){
		if(isDataFieldBlank(accountNumber))
			return ErrorPage.USER_ACCOUNT_NUMBER;
	return "";
		
	}
	public String validateSSN(String ssn){
		if(isDataFieldBlank(ssn))
			return ErrorPage.USER_SSN;
	return "";
		
	}
	


private boolean isDataFieldBlank(String str) {
	
		return str == null||((String) str).trim().length()<=2 || ((String) str).isEmpty()  ;
}
private boolean isNotValidPhoneNumber(Long l) {
	
	return String.valueOf(l).length() != 10 ;
}

}
