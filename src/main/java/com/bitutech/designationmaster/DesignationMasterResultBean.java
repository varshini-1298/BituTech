package com.bitutech.designationmaster;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class DesignationMasterResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<DesignationMasterBean> designationMasterDetails;
	
	private DesignationMasterBean designationMasterBean;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<DesignationMasterBean> getDesignationMasterDetails() {
		return designationMasterDetails;
	}
	
	public void setDesignationMasterDetails(List<DesignationMasterBean> designationMasterDetails) {
		this.designationMasterDetails = designationMasterDetails;
	}

	public DesignationMasterBean getDesignationMasterBean() {
		return designationMasterBean;
	}

	public void setDesignationMasterBean(DesignationMasterBean designationMasterBean) {
		this.designationMasterBean = designationMasterBean;
	}

	
}
