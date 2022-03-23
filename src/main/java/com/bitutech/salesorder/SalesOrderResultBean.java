package com.bitutech.salesorder;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class SalesOrderResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<SalesOrderBean> uomDetails;
	private List<SalesOrderBean> salesOrderList;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<SalesOrderBean> getUomDetails() {
		return uomDetails;
	}

	public void setUomDetails(List<SalesOrderBean> uomDetails) {
		this.uomDetails = uomDetails;
	}

	public List<SalesOrderBean> getSalesOrderList() {
		return salesOrderList;
	}

	public void setSalesOrderList(List<SalesOrderBean> salesOrderList) {
		this.salesOrderList = salesOrderList;
	}


	

	


	
	
}
