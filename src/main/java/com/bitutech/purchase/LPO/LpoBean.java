package com.bitutech.purchase.LPO;

import java.util.List;

public class LpoBean {
	private Integer purchaseReqNo;
	private String organizationName;
	private Integer poNumber;
	private String requestType;
	private String poDate;
	private String woType;
	private String purchaseType;
	private String purchaseFor;
	private String Vendor;
	private String destinationLocation;
	private String Advance;
	private String currency;
	private String costCenter;
	private String termsConditions;
	private String remarks;
	private String paymentTerms;
	private String vendorAddress;
	private String vendorCity;
	private String  vendorState;
     private Integer vendorZip;
     private String vendorCountry;
     private String  destinationAddress;
     private String destinationCity;
     private String destinationState;
     private Integer  destinationZip;
     private String destinationCountry;
	
	public Integer getPurchaseReqNo() {
		return purchaseReqNo;
	}
	public void setPurchaseReqNo(Integer purchaseReqNo) {
		this.purchaseReqNo = purchaseReqNo;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public Integer getPoNumber() {
		return poNumber;
	}
	public void setPoNumber(Integer poNumber) {
		this.poNumber = poNumber;
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public String getPoDate() {
		return poDate;
	}
	public void setPoDate(String poDate) {
		this.poDate = poDate;
	}
	public String getWoType() {
		return woType;
	}
	public void setWoType(String woType) {
		this.woType = woType;
	}
	public String getPurchaseType() {
		return purchaseType;
	}
	public void setPurchaseType(String purchaseType) {
		this.purchaseType = purchaseType;
	}
	public String getPurchaseFor() {
		return purchaseFor;
	}
	public void setPurchaseFor(String purchaseFor) {
		this.purchaseFor = purchaseFor;
	}
	public String getVendor() {
		return Vendor;
	}
	public void setVendor(String vendor) {
		Vendor = vendor;
	}
	public String getDestinationLocation() {
		return destinationLocation;
	}
	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}
	public String getAdvance() {
		return Advance;
	}
	public void setAdvance(String advance) {
		Advance = advance;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCostCenter() {
		return costCenter;
	}
	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}
	public String getTermsConditions() {
		return termsConditions;
	}
	public void setTermsConditions(String termsConditions) {
		this.termsConditions = termsConditions;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getPaymentTerms() {
		return paymentTerms;
	}
	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	public String getVendorCity() {
		return vendorCity;
	}
	public void setVendorCity(String vendorCity) {
		this.vendorCity = vendorCity;
	}
	public String getVendorState() {
		return vendorState;
	}
	public void setVendorState(String vendorState) {
		this.vendorState = vendorState;
	}
	public Integer getVendorZip() {
		return vendorZip;
	}
	public void setVendorZip(Integer vendorZip) {
		this.vendorZip = vendorZip;
	}
	public String getVendorCountry() {
		return vendorCountry;
	}
	public void setVendorCountry(String vendorCountry) {
		this.vendorCountry = vendorCountry;
	}
	public String getDestinationAddress() {
		return destinationAddress;
	}
	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}
	public String getDestinationCity() {
		return destinationCity;
	}
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}
	public String getDestinationState() {
		return destinationState;
	}
	public void setDestinationState(String destinationState) {
		this.destinationState = destinationState;
	}
	public Integer getDestinationZip() {
		return destinationZip;
	}
	public void setDestinationZip(Integer destinationZip) {
		this.destinationZip = destinationZip;
	}
	public String getDestinationCountry() {
		return destinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
//	public LpoDetailBeanOne[] getLpoDetailBeanOne() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public Object getLpoDetailBeanTwo() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	

	private List<LpoDetailBeanOne> lpoDetailBeanOne;
	
	
	
	public List<LpoDetailBeanOne> getLpoDetailBeanOne() {
		return lpoDetailBeanOne;
	}
	public void setLpoDetailBeanOne(List<LpoDetailBeanOne> lpoDetailBeanOne) {
		this.lpoDetailBeanOne = lpoDetailBeanOne;
	}
private List<LpoDetailBeanTwo> lpoDetailBeanTwo;
	
	
	
	public List<LpoDetailBeanTwo> getLpoDetailBeanTwo() {
		return lpoDetailBeanTwo;
	}
	public void setLpoDetailBeanTwo(List<LpoDetailBeanTwo> lpoDetailBeanTwo) {
		this.lpoDetailBeanTwo = lpoDetailBeanTwo;
	}

}
