package com.bitutech.salesquote;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class SalesQuoteResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<SalesQuoteBean> uomDetails;
	private List<SalesQuoteBean> salesQuoteList;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<SalesQuoteBean> getUomDetails() {
		return uomDetails;
	}

	public void setUomDetails(List<SalesQuoteBean> uomDetails) {
		this.uomDetails = uomDetails;
	}

	public List<SalesQuoteBean> getSalesQuoteList() {
		return salesQuoteList;
	}

	public void setSalesQuoteList(List<SalesQuoteBean> salesQuoteList) {
		this.salesQuoteList = salesQuoteList;
	}


	

	


	
	
}
