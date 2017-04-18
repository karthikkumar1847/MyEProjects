package com.spngann.dao;

import com.spngann.vo.AllInfoVO;

public interface AllInfoDAO {
	
	public void addRecord(AllInfoVO allInfoVO);
	public AllInfoVO getRecord(AllInfoVO allInfoVO);
	public void updateRecord(AllInfoVO allInfoVO);
	public AllInfoVO deleteRecord(String ssn);

}
