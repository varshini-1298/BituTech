package com.bitutech.departmentmaster;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class DepartmentMasterResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<DepartmentMasterBean> departmentMasterDetails;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<DepartmentMasterBean> getDepartmentMasterDetails() {
		return departmentMasterDetails;
	}

	
	public void setDepartmentMasterDetails(List<DepartmentMasterBean> departmentMasterDetails) {
		this.departmentMasterDetails = departmentMasterDetails;
	}


	
	
}
