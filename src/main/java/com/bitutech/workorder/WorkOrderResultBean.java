package com.bitutech.workorder;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class WorkOrderResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<WorkOrderBean> workOrderrDetails;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<WorkOrderBean> getWorkOrderrDetails() {
		return workOrderrDetails;
	}

	public void setWorkOrderrDetails(List<WorkOrderBean> workOrderrDetails) {
		this.workOrderrDetails = workOrderrDetails;
	}

	


	
	
}
