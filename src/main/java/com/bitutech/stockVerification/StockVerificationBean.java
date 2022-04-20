package com.bitutech.stockVerification;

public class StockVerificationBean {
	
	private int stockVerificationNo;
	private String location;
	private String organizationName;
	private String date;
	private String verifiedBy;
	private String jobTitle;
	private boolean action;
	
	public boolean isAction() {
		return action;
	}
	public void setAction(boolean action) {
		this.action = action;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public int getStockVerificationNo() {
		return stockVerificationNo;
	}
	public void setStockVerificationNo(int stockVerificationNo) {
		this.stockVerificationNo = stockVerificationNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getVerifiedBy() {
		return verifiedBy;
	}
	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy;
	}
	
	
	

}
