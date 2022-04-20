package com.bitutech.salesquote;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class SalesQuoteResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<SalesQuoteBean> salesQuoteDetails;
//	private List<SalesQuoteBean> salesQuoteList;
	
	private SalesQuoteBean salesQuoteBean;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	

	

	public List<SalesQuoteBean> getSalesQuoteDetails() {
		return salesQuoteDetails;
	}

	public void setSalesQuoteDetails(List<SalesQuoteBean> salesQuoteDetails) {
		this.salesQuoteDetails = salesQuoteDetails;
	}
	
	public SalesQuoteBean getSalesQuoteBean() {
		return salesQuoteBean;
	}
	
	public void setSalesQuoteBean(SalesQuoteBean salesQuoteBean) {
		this.salesQuoteBean = salesQuoteBean;
	}


	

	


	
	
}
