package com.bitutech.billofmaterial;

import java.util.List;

public class BillOfMaterialHdrObjBean {
	
	
	private String bomNo;
	private String workorderNo;
	private String booNo;
	private String date;
	private List<BillOfMaterialDtlObjBean> billOfMaterialDtlObjBean;
	
	
	public String getBooNo() {
		return booNo;
	}
	public void setBooNo(String booNo) {
		this.booNo = booNo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	public String getWorkorderNo() {
		return workorderNo;
	}
	public void setWorkorderNo(String workorderNo) {
		this.workorderNo = workorderNo;
	}
	
	public String getBomNo() {
		return bomNo;
	}
	public void setBomNo(String bomNo) {
		this.bomNo = bomNo;
	}
	
	public List<BillOfMaterialDtlObjBean> getBillOfMaterialDtlObjBean() {
		return billOfMaterialDtlObjBean;
	}
	public void setBillOfMaterialDtlObjBean(List<BillOfMaterialDtlObjBean> billOfMaterialDtlObjBean) {
		this.billOfMaterialDtlObjBean = billOfMaterialDtlObjBean;
	}
	
	
}
