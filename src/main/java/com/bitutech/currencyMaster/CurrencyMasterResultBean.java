package com.bitutech.currencyMaster;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class CurrencyMasterResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<CurrencyMasterBean> currencyMasterDetails;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<CurrencyMasterBean> getCurrencyMasterDetails() {
		return currencyMasterDetails;
	}

	
	public void setCurrencyMasterDetails(List<CurrencyMasterBean> currencyMasterDetails) {
		this.currencyMasterDetails = currencyMasterDetails;
	}


	
	
}
