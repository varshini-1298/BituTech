package com.bitutech.gatePass;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class GatePassResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;

	public boolean Success;
	
	private List<GatePassBean> gatePassDetails;
	private List<GatePassBean> organizationList;
	private List<GatePassBean> locationList;
	
	public boolean isSuccess() {
		return Success;
	}
	
	public void setSuccess(boolean success) {
		Success = success;
	}
	
	public List<GatePassBean> getGatePassDetails() {
		return gatePassDetails;
	}
	
	public void setGatePassDetails(List<GatePassBean> gatePassDetails) {
		this.gatePassDetails = gatePassDetails;
	}
	
	public List<GatePassBean> getOrganizationList() {
		return organizationList;
	}
	
	public void setOrganizationList(List<GatePassBean> organizationList) {
		this.organizationList = organizationList;
	}
	
	public List<GatePassBean> getLocationList(){
		return locationList;
	}
	
	public void setLocationList(List<GatePassBean> locationList) {
		this.locationList = locationList;
	}
	
	
	
}
