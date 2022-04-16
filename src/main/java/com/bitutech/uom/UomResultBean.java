package com.bitutech.uom;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class UomResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<UomBean> uomDetails;
	private List<UomBean> uomCategoryList;
	
	private UomBean uomBean;
	
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

	public List<UomBean> getUomCategoryList() {
		return uomCategoryList;
	}

	public void setUomCategoryList(List<UomBean> uomCategoryList) {
		this.uomCategoryList = uomCategoryList;
	}

	public UomBean getUomBean() {
		return uomBean;
	}

	public void setUomBean(UomBean uomBean) {
		this.uomBean = uomBean;
	}

	

	


	
	
}
