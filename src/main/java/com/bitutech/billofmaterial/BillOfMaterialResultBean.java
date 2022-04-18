package com.bitutech.billofmaterial;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;
import com.bitutech.core.util.DropDownList;

public class BillOfMaterialResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<BillOfMaterialHdrObjBean> bomDetails;
	
	private String bomNumber;
	
	private List<DropDownList> workOrderNoList;
	
	

	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<DropDownList> getWorkOrderNoList() {
		return workOrderNoList;
	}

	public void setWorkOrderNoList(List<DropDownList> workOrderNoList) {
		this.workOrderNoList = workOrderNoList;
	}

	public List<BillOfMaterialHdrObjBean> getBomDetails() {
		return bomDetails;
	}

	public void setBomDetails(List<BillOfMaterialHdrObjBean> bomDetails) {
		this.bomDetails = bomDetails;
	}

	public String getBomNumber() {
		return bomNumber;
	}

	public void setBomNumber(String bomNumber) {
		this.bomNumber = bomNumber;
	}


	


	
	
}
