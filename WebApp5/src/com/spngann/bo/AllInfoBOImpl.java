package com.spngann.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spngann.dao.AllInfoDAO;
import com.spngann.validation.AddingInfoValidationException;
import com.spngann.validation.Validations;
import com.spngann.vo.AllInfoVO;

@Service
public class AllInfoBOImpl implements AllInfoBO{

	@Autowired
	private AllInfoDAO allInfoDAO = null;
	
	public AllInfoBOImpl() {
		
	}

	@Transactional
	public void addRecordPersonal(AllInfoVO allInfoVO) throws AddingInfoValidationException,Exception {
		System.out.println("Starting of AllInfoBOImpl: addRecordPersonal(AllInfoVO allInfoVO)");
		StringBuffer allErrors = new StringBuffer();
		Validations validations = new Validations();
		
		allErrors.append(validations.validateFirstName(allInfoVO.getFirstName()));
		allErrors.append(validations.validateLastName(allInfoVO.getLastName()));
		allErrors.append(validations.validateMiddleName(allInfoVO.getMiddleName()));
		allErrors.append(validations.validateGender(allInfoVO.getGender()));

		if(allErrors.length()>0){
			AddingInfoValidationException exception = new AddingInfoValidationException(allErrors.toString());
			throw exception;
		}
		System.out.println("Completed of AllInfoBOImpl: addRecordPersonal(AllInfoVO allInfoVO)");
	}
	@Transactional
	public void addRecordContact(AllInfoVO allInfoVO) throws AddingInfoValidationException,Exception {
		System.out.println("Starting of AllInfoBOImpl: addRecordContact(AllInfoVO allInfoVO)");
		StringBuffer allErrors = new StringBuffer();
		Validations validations = new Validations();
		
		allErrors.append(validations.validateAptStreet(allInfoVO.getApt()));
		allErrors.append(validations.validateCity(allInfoVO.getCity()));
		allErrors.append(validations.validateState(allInfoVO.getState()));
		allErrors.append(validations.validateCountry(allInfoVO.getCountry()));
		allErrors.append(validations.validatePhone(allInfoVO.getPhoneNumber()));
		if(allErrors.length()>0){
			AddingInfoValidationException exception = new AddingInfoValidationException(allErrors.toString());
			throw exception;
		}
		System.out.println("Completed of AllInfoBOImpl: addRecordContact(AllInfoVO allInfoVO)");
	}
	@Transactional
	public void addRecordBank(AllInfoVO allInfoVO) throws AddingInfoValidationException,Exception {
		System.out.println("Starting of AllInfoBOImpl: addRecordBank(AllInfoVO allInfoVO)");
		StringBuffer allErrors = new StringBuffer();
		Validations validations = new Validations();
		
		allErrors.append(validations.validateBankName(allInfoVO.getBankName()));
		allErrors.append(validations.validateAccountNumber(allInfoVO.getAccountNumber()));
		allErrors.append(validations.validateSSN(allInfoVO.getSsn()));
		if(allErrors.length()==0)
			allInfoDAO.addRecord(allInfoVO);
		else{
			AddingInfoValidationException exception = new AddingInfoValidationException(allErrors.toString());
			throw exception;
		}
		System.out.println("Completed of AllInfoBOImpl: addRecordBank(AllInfoVO allInfoVO)");
	}

	
	public AllInfoVO getRecord(AllInfoVO allInfoVO) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateRecord(AllInfoVO allInfoVO) {
		// TODO Auto-generated method stub
		
	}

	public AllInfoVO deleteRecord(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	public AllInfoDAO getAllInfoDAO() {
		return allInfoDAO;
	}

	public void setAllInfoDAO(AllInfoDAO allInfoDAO) {
		this.allInfoDAO = allInfoDAO;
	}

}
