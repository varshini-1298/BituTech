package com.bitutech.salescallentry;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class SalesCallEntryResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean success;

	public List<SalesCallEntryBean> salesCallEntryDetails;
	
	private SalesCallEntryBean salesCallEntryBean;
	
	public List<SalesCallEntryBean> getSalesCallEntryDetails() {
		return salesCallEntryDetails;
	}

	public void setSalesCallEntryDetails(List<SalesCallEntryBean> salesCallEntryDetails) {
		this.salesCallEntryDetails = salesCallEntryDetails;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public SalesCallEntryBean getSalesCallEntryBean() {
		return salesCallEntryBean;
	}

	public void setSalesCallEntryBean(SalesCallEntryBean salesCallEntryBean) {
		this.salesCallEntryBean = salesCallEntryBean;
	}

}
