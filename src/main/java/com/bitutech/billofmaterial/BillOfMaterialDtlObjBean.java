package com.bitutech.billofmaterial;

public class BillOfMaterialDtlObjBean {
	
	private String bomNo;
	private String itemId;
	private String uomId;
	private Integer quantity;
	
	private String createdBy;
	private String createdDate;
	private String modifiedBy;
	
	
	public String getBomNo() {
		return bomNo;
	}
	public void setBomNo(String bomNo) {
		this.bomNo = bomNo;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getUomId() {
		return uomId;
	}
	public void setUomId(String uomId) {
		this.uomId = uomId;
	}
	
	
	
	
	
}