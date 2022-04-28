package com.bitutech.workorder;

import java.util.List;

public class WorkOrderHdrObjBean {
	
	private String workorderNo;
	private String workorderDate;
	private String salesOrderNo;
	private List<WorkOrderDtlBean> workOrderDtlData;
	
	
	public String getWorkorderDate() {
		return workorderDate;
	}
	public void setWorkorderDate(String workorderDate) {
		this.workorderDate = workorderDate;
	}
	public String getSalesOrderNo() {
		return salesOrderNo;
	}
	public void setSalesOrderNo(String salesOrderNo) {
		this.salesOrderNo = salesOrderNo;
	}
	
	
	public String getWorkorderNo() {
		return workorderNo;
	}
	public void setWorkorderNo(String workorderNo) {
		this.workorderNo = workorderNo;
	}
	public List<WorkOrderDtlBean> getWorkOrderDtlData() {
		return workOrderDtlData;
	}
	public void setWorkOrderDtlData(List<WorkOrderDtlBean> workOrderDtlData) {
		this.workOrderDtlData = workOrderDtlData;
	}
	
	
}
