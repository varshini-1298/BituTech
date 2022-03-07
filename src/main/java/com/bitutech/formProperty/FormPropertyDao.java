package com.bitutech.formProperty;

import com.bitutech.core.util.CustomException;

public interface FormPropertyDao {
	public FormPropertyResultBean getFormProperty(String userId) throws CustomException;
	
}
