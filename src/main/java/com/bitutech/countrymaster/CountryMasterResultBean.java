package com.bitutech.countrymaster;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class CountryMasterResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<CountryMasterBean> countryMasterDetails;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<CountryMasterBean> getCustomerMasterDetails() {
		return countryMasterDetails;
	}

	
	public void setCountryMasterDetails(List<CountryMasterBean> countryMasterDetails) {
		this.countryMasterDetails = countryMasterDetails;
	}
	


	
	
}
