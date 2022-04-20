package com.bitutech.itemMaster;

public class ItemMasterBean {
	private Integer itemId;	
	private String itemCode;
	private String itemName;
	private String itemDescription;
	private Integer itemType;
	private Integer itemCategory;
	private Boolean saleable;
	private Boolean purchaseable;
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public Integer getItemType() {
		return itemType;
	}
	public void setItemType(Integer itemType) {
		this.itemType = itemType;
	}
	public Integer getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(Integer itemCategory) {
		this.itemCategory = itemCategory;
	}
	public Boolean getSaleable() {
		return saleable;
	}
	public void setSaleable(Boolean saleable) {
		this.saleable = saleable;
	}
	public Boolean getPurchaseable() {
		return purchaseable;
	}
	public void setPurchaseable(Boolean purchaseable) {
		this.purchaseable = purchaseable;
	}
	
	
	
}
