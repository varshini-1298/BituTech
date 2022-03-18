package com.bitutech.boo;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class BillOfOperationResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<BillOfOperationBean> designationMasterDetails;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<BillOfOperationBean> getDesignationMasterDetails() {
		return designationMasterDetails;
	}

	
	public void setDesignationMasterDetails(List<BillOfOperationBean> designationMasterDetails) {
		this.designationMasterDetails = designationMasterDetails;
	}


	
	
}
