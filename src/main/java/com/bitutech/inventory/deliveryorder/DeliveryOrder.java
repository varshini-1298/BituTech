package com.bitutech.inventory.deliveryorder;

import java.util.ArrayList;
import java.util.List;

public class DeliveryOrder {
	
	private String deliveryNo;
	private String deliveryDate;
	private String companyCode;
	private String customerCode;
	private Integer ginId;
	private Integer sourceLocationid;
	private Integer destinationLocationid;
	private Integer purposeOfDO;
	private String personIncharge;
	private String remarks;
	private String userId;
	private String action;
	private String customername;
	private String customerAddress;
	
	
	
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	private List<DeliveryOrderDtl> deliveryOrderDtlList = new ArrayList<DeliveryOrderDtl>();
 	 
	public String getDeliveryNo() {
		return deliveryNo;
	}
	public void setDeliveryNo(String deliveryNo) {
		this.deliveryNo = deliveryNo;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public Integer getGinId() {
		return ginId;
	}
	public void setGinId(Integer ginId) {
		this.ginId = ginId;
	}
	public Integer getSourceLocationid() {
		return sourceLocationid;
	}
	public void setSourceLocationid(Integer sourceLocationid) {
		this.sourceLocationid = sourceLocationid;
	}
	public Integer getDestinationLocationid() {
		return destinationLocationid;
	}
	public void setDestinationLocationid(Integer destinationLocationid) {
		this.destinationLocationid = destinationLocationid;
	}
	public Integer getPurposeOfDO() {
		return purposeOfDO;
	}
	public void setPurposeOfDO(Integer purposeOfDO) {
		this.purposeOfDO = purposeOfDO;
	}
	public String getPersonIncharge() {
		return personIncharge;
	}
	public void setPersonIncharge(String personIncharge) {
		this.personIncharge = personIncharge;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<DeliveryOrderDtl> getDeliveryOrderDtlList() {
		return deliveryOrderDtlList;
	}
	public void setDeliveryOrderDtlList(List<DeliveryOrderDtl> deliveryOrderDtlList) {
		this.deliveryOrderDtlList = deliveryOrderDtlList;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
}
