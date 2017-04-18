package com.kar.bo;

import com.kar.dao.DBAccess;
import com.kar.validation.AddingInfoValidationException;
import com.kar.validation.Validations;
import com.kar.vo.AllInfoVO;

public class AllInfoBO {

	public AllInfoBO() {
		super();
	}

	public void addPersonalInfo(AllInfoVO allInfoVo) throws AddingInfoValidationException, Exception{
		
		StringBuffer allErrMsg = new StringBuffer();
		Validations validations = new Validations();
		
		String errorMsg = validations.validateFirstName(allInfoVo.getFirstName());
		allErrMsg.append(errorMsg);
		
		allErrMsg.append(validations.validateMiddleName(allInfoVo.getMiddleName()));
		allErrMsg.append(validations.validateLastName(allInfoVo.getLastName()));
		allErrMsg.append(validations.validateGender(allInfoVo.getGender()));
		
		if(allErrMsg.length()>0){
			AddingInfoValidationException exception = new AddingInfoValidationException(allErrMsg.toString());
			throw exception;
		}
	}
	public void addContactInfo(AllInfoVO allInfoVo) throws AddingInfoValidationException, Exception{
		StringBuffer allErrMsg = new StringBuffer();
		Validations validations = new Validations();
		
		allErrMsg.append(validations.validateAptStreet(allInfoVo.getApt()));
		allErrMsg.append(validations.validateCity(allInfoVo.getCity()));
		allErrMsg.append(validations.validateState(allInfoVo.getState()));
		allErrMsg.append(validations.validateCountry(allInfoVo.getCountry()));
		allErrMsg.append(validations.validatePhone(allInfoVo.getPhoneNumber()));
		
		if(allErrMsg.length()>0){
			AddingInfoValidationException exception = new AddingInfoValidationException(allErrMsg.toString());
			throw exception;
		}
		
	}
	public void addBankInfo(AllInfoVO allInfoVo) throws AddingInfoValidationException, Exception{
		StringBuffer allErrMsg = new StringBuffer();
		Validations validations = new Validations();
		
		allErrMsg.append(validations.validateBankName(allInfoVo.getBankName()));
		allErrMsg.append(validations.validateAccountNumber(allInfoVo.getAccountNumber()));
		allErrMsg.append(validations.validateSSN(allInfoVo.getSsn()));
		if(allErrMsg.length()==0){
			DBAccess db = new DBAccess(); 
			db.addRecord(allInfoVo);	
		}else{
			AddingInfoValidationException exception = new AddingInfoValidationException(allErrMsg.toString());
			throw exception;
		}
	}

}
