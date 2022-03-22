package com.bitutech.uomcategory;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class UomCategoryResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<UomCategoryBean> uomCategoryDetails;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<UomCategoryBean> getUomCategoryDetails() {
		return uomCategoryDetails;
	}

	public void setUomCategoryDetails(List<UomCategoryBean> uomCategoryDetails) {
		this.uomCategoryDetails = uomCategoryDetails;
	}

	


	
	
}
