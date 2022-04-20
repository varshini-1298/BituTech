package com.bitutech.inventory.deliveryorder;

public class DeliveryOrderDtl {
	
	private String deliveryNo;
	private Integer itemId;
	private Integer itemQty;
	private Integer ginDtlId;
	private String userId;
	
	public String getDeliveryNo() {
		return deliveryNo;
	}
	public void setDeliveryNo(String deliveryNo) {
		this.deliveryNo = deliveryNo;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Integer getItemQty() {
		return itemQty;
	}
	public void setItemQty(Integer itemQty) {
		this.itemQty = itemQty;
	}
	public Integer getGinDtlId() {
		return ginDtlId;
	}
	public void setGinDtlId(Integer ginDtlId) {
		this.ginDtlId = ginDtlId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
