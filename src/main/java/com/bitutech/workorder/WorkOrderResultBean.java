package com.bitutech.workorder;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class WorkOrderResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<WorkOrderBean> locationMasterDetails;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<WorkOrderBean> getCustomerMasterDetails() {
		return locationMasterDetails;
	}

	
	public void setLocationMasterDetailsMasterDetails(List<WorkOrderBean> locationMasterDetails) {
		this.locationMasterDetails = locationMasterDetails;
	}


	
	
}
