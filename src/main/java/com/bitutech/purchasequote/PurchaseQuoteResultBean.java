package com.bitutech.purchasequote;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class PurchaseQuoteResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<PurchaseQuoteBean> purchaseQuoteDetails;
	private List<PurchaseQuoteBean> uomCategoryList;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}



	public List<PurchaseQuoteBean> getPurchaseQuoteDetails() {
		return purchaseQuoteDetails;
	}

	public void setPurchaseQuoteDetails(List<PurchaseQuoteBean> purchaseQuoteDetails) {
		this.purchaseQuoteDetails = purchaseQuoteDetails;
	}

	public List<PurchaseQuoteBean> getUomCategoryList() {
		return uomCategoryList;
	}

	public void setUomCategoryList(List<PurchaseQuoteBean> uomCategoryList) {
		this.uomCategoryList = uomCategoryList;
	}

	

	


	
	
}
