package com.bitutech.salescallentry;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class SalesCallEntryResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean success;

	public List<SalesCallEntryBean> getSalesCallEntryDetails;
	
	public List<SalesCallEntryBean> getGetSalesCallEntryDetails() {
		return getSalesCallEntryDetails;
	}

	public void setGetSalesCallEntryDetails(List<SalesCallEntryBean> getSalesCallEntryDetails) {
		this.getSalesCallEntryDetails = getSalesCallEntryDetails;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
