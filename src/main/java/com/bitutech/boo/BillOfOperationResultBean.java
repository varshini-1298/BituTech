package com.bitutech.boo;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;
import com.bitutech.core.util.DropDownList;

public class BillOfOperationResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<BillOfOperationBean> billOfOperationDetails;
	
	private List<DropDownList> billOfOperationList;
	
	private BillOfOperationBean billOfOperationBean;
	
	private String booNumber;
	
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

	public String getBooNumber() {
		return booNumber;
	}

	public void setBooNumber(String booNumber) {
		this.booNumber = booNumber;
	}


	public List<DropDownList> getBillOfOperationList() {
		return billOfOperationList;
	}


	public void setBillOfOperationList(List<DropDownList> billOfOperationList) {
		this.billOfOperationList = billOfOperationList;
	}
	
}
