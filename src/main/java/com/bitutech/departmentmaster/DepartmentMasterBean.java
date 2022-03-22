package com.bitutech.departmentmaster;

public class DepartmentMasterBean {
	
	private String departmentName;
	private String departmentHead;
	private String remarks;
	private String deptCode;
	private boolean deptStatus;
	
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public boolean isDeptStatus() {
		return deptStatus;
	}
	public void setDeptStatus(boolean deptStatus) {
		this.deptStatus = deptStatus;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentHead() {
		return departmentHead;
	}
	public void setDepartmentHead(String departmentHead) {
		this.departmentHead = departmentHead;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
