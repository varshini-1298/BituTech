package com.bitutech.purchaserequest;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class PurchaseRequestResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<PurchaseRequestBean> purchaseRequestDetails;
	private List<PurchaseRequestBean> uomCategoryList;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}


	public List<PurchaseRequestBean> getPurchaseRequestDetails() {
		return purchaseRequestDetails;
	}

	public void setPurchaseRequestDetails(List<PurchaseRequestBean> purchaseRequestDetails) {
		this.purchaseRequestDetails = purchaseRequestDetails;
	}

	public List<PurchaseRequestBean> getUomCategoryList() {
		return uomCategoryList;
	}

	public void setUomCategoryList(List<PurchaseRequestBean> uomCategoryList) {
		this.uomCategoryList = uomCategoryList;
	}

	

	


	
	
}
