package com.bitutech.location;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class LocationMasterResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<LocationMasterBean> locationMasterDetails;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<LocationMasterBean> getCustomerMasterDetails() {
		return locationMasterDetails;
	}

	
	public void setLocationMasterDetailsMasterDetails(List<LocationMasterBean> locationMasterDetails) {
		this.locationMasterDetails = locationMasterDetails;
	}


	
	
}
