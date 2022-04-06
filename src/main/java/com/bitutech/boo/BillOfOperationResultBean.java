package com.bitutech.boo;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class BillOfOperationResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<BillOfOperationBean> billOfOperationDetails;
	
	private BillOfOperationBean billOfOperationBean;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<BillOfOperationBean> getBillOfOperationDetails() {
		return billOfOperationDetails;
	}

	
	public void setBillOfOperationDetails(List<BillOfOperationBean> billOfOperationDetails) {
		this.billOfOperationDetails = billOfOperationDetails;
	}

	public BillOfOperationBean getBillOfOperationBean() {
		return billOfOperationBean;
	}

	public void setBillOfOperationBean(BillOfOperationBean billOfOperationBean) {
		this.billOfOperationBean = billOfOperationBean;
	}

	


	
	
}
