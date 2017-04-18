package com.spngann.bo;

import com.spngann.validation.AddingInfoValidationException;
import com.spngann.vo.AllInfoVO;

public interface AllInfoBO {

	public void addRecordPersonal(AllInfoVO allInfoVO) throws AddingInfoValidationException, Exception;
	public void addRecordContact(AllInfoVO allInfoVO) throws AddingInfoValidationException, Exception;
	public void addRecordBank(AllInfoVO allInfoVO) throws AddingInfoValidationException, Exception;
	public AllInfoVO getRecord(AllInfoVO allInfoVO);
	public void updateRecord(AllInfoVO allInfoVO);
	public AllInfoVO deleteRecord(String ssn);
}
