package com.bitutech.designationmaster;

public class DesignationMasterBean {
	
	private String designationName;
	private String remarks;
	private boolean active;
	private String desgnCode;
	
	
	public String getDesgnCode() {
		return desgnCode;
	}
	public void setDesgnCode(String desgnCode) {
		this.desgnCode = desgnCode;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getDesignationName() {
		return designationName;
	}
	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
