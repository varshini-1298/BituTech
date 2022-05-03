package com.bitutech.itemMaster;

public class ItemMasterDetailBean {
	//vendor dtl
private Integer itemId;
	public Integer getItemId() {
	return itemId;
}
public void setItemId(Integer itemId) {
	this.itemId = itemId;
}
	private String vendor;
	private String vendorItemName;
	private String itemName;
	private String itemCode;
	private String vendorItemCode;
	private Integer vendorminimumQty;
	private String vendorUom;
	private Integer deliveryLeadTime;
	private Integer pricingType;
	private Integer itemVendorId;
	//grn dtl
//	itemVendorId private Boolean batchNo;
//	private Boolean expiryDate;
//	private Boolean mrp;
//	private Boolean manufactureDetails;
	
	public String getVendor() {
		return vendor;
	}
	public Integer getItemVendorId() {
		return itemVendorId;
	}
	public void setItemVendorId(Integer itemVendorId) {
		this.itemVendorId = itemVendorId;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getVendorItemName() {
		return vendorItemName;
	}
	public void setVendorItemName(String vendorItemName) {
		this.vendorItemName = vendorItemName;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public Integer getVendorminimumQty() {
		return vendorminimumQty;
	}
	public void setVendorminimumQty(Integer vendorminimumQty) {
		this.vendorminimumQty = vendorminimumQty;
	}
	public String getVendorItemCode() {
		return vendorItemCode;
	}
	public void setVendorItemCode(String vendorItemCode) {
		this.vendorItemCode = vendorItemCode;
	}
	
	public String getVendorUom() {
		return vendorUom;
	}
	public void setVendorUom(String vendorUom) {
		this.vendorUom = vendorUom;
	}
	public Integer getDeliveryLeadTime() {
		return deliveryLeadTime;
	}
	public void setDeliveryLeadTime(Integer deliveryLeadTime) {
		this.deliveryLeadTime = deliveryLeadTime;
	}
	public Integer getPricingType() {
		return pricingType;
	}
	public void setPricingType(Integer pricingType) {
		this.pricingType = pricingType;
	}
	
}
