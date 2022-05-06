package com.bitutech.purchase.LPO;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;


public class LpoResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean success;

	public List<LpoBean> salesCallEntryDetails;
	private List<LpoDetailBean> SalescallEntryDetailBean;

	private LpoBean salesCallEntryBean;
	
	public List<LpoBean> getSalesCallEntryDetails() {
		return salesCallEntryDetails;
	}

	public void setSalesCallEntryDetails(List<LpoBean> salesCallEntryDetails) {
		this.salesCallEntryDetails = salesCallEntryDetails;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public LpoBean getSalesCallEntryBean() {
		return salesCallEntryBean;
	}

	public void setSalesCallEntryBean(LpoBean salesCallEntryBean) {
		this.salesCallEntryBean = salesCallEntryBean;
	}
	public List<LpoDetailBean> getSalescallEntryDetailBean() {
		return SalescallEntryDetailBean;
	}

	public void setSalescallEntryDetailBean(List<LpoDetailBean> salescallEntryDetailBean) {
		SalescallEntryDetailBean = salescallEntryDetailBean;
	}

}
