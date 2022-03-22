package com.bitutech.uom;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class UomResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<UomBean> uomDetails;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<UomBean> getUomDetails() {
		return uomDetails;
	}

	public void setUomDetails(List<UomBean> uomDetails) {
		this.uomDetails = uomDetails;
	}

	

	


	
	
}
