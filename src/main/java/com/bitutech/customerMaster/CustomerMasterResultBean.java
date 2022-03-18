package com.bitutech.customerMaster;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class CustomerMasterResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<CustomerMasterBean> customerMasterDetails;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<CustomerMasterBean> getCustomerMasterDetails() {
		return customerMasterDetails;
	}

	public void setCustomerMasterDetails(List<CustomerMasterBean> customerMasterDetails) {
		this.customerMasterDetails = customerMasterDetails;
	}

	

	
	
}
