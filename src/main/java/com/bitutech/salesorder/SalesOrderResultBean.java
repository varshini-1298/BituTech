package com.bitutech.salesorder;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class SalesOrderResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<SalesOrderBean> salesOrderDetails;
//	private List<SalesOrderBean> salesOrderList;
	
	private SalesOrderBean salesOrderBean;
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<SalesOrderBean> getSalesOrderDetails() {
		return salesOrderDetails;
	}

	public void setSalesOrderDetails(List<SalesOrderBean> salesOrderDetails) {
		this.salesOrderDetails = salesOrderDetails;
	}

//	public List<SalesOrderBean> getSalesOrderList() {
//		return salesOrderList;
//	}
//
//	public void setSalesOrderList(List<SalesOrderBean> salesOrderList) {
//		this.salesOrderList = salesOrderList;
//	}

	public SalesOrderBean getSalesOrderBean() {
		return salesOrderBean;
	}

	public void setSalesOrderBean(SalesOrderBean salesOrderBean) {
		this.salesOrderBean = salesOrderBean;
	}


	

	


	
	
}
