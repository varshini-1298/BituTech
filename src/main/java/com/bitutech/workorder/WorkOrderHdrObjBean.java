package com.bitutech.workorder;

import java.util.List;

public class WorkOrderHdrObjBean {
	
	private String workorderNo;
	private String workorderDate;
	private String salesOrderNo;
	
	
	
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
	private List<WorkOrderDtlBean> workOrderDtlObjBean;
	
	
	public String getWorkorderNo() {
		return workorderNo;
	}
	public void setWorkorderNo(String workorderNo) {
		this.workorderNo = workorderNo;
	}
	public List<WorkOrderDtlBean> getWorkOrderDtlObjBean() {
		return workOrderDtlObjBean;
	}
	public void setWorkOrderDtlObjBean(List<WorkOrderDtlBean> workOrderDtlObjBean) {
		this.workOrderDtlObjBean = workOrderDtlObjBean;
	}
	
	
}
