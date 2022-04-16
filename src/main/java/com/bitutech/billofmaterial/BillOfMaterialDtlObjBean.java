package com.bitutech.billofmaterial;

public class BillOfMaterialDtlObjBean {
	
	private String workorderDtlObjId;
	private String workorderHdrId;
	private String productName;
	private String productNo;
	private String quantity;
	private String uom;
	private String deliveryDate;
	private String remarks;
	private String createdBy;
	private String createdDate;
	private String modifiedBy;
	
	
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
