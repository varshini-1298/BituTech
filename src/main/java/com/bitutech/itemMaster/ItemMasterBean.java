package com.bitutech.itemMaster;

import java.util.List;


public class ItemMasterBean {
	private Integer itemId;	
	private String itemCode;
	private String itemName;
	private String itemDescription;
	private Integer itemType;
	private Integer itemCategory;
	private Boolean saleable;
	private Boolean purchaseable;
	private Boolean purchaseReq;	
	private Integer costingMethod;
	private Integer costPrice;
	private Integer warranty;
	private Integer leadTime;
	private Integer purchaseMethod;
	private Integer pruchaseUom;
	private String reorderLevel;
	private Integer minimumQty;
	private Integer maximumQty;
	
	 private Boolean batchNo;
	 private Boolean expiryDate; 
	 private Boolean mrp;
	 private Boolean manufactureDetails;
	
	 private Integer inventoryValuation;
	 private Integer issueMethod;
	 
	 public Integer getInventoryValuation() {
		return inventoryValuation;
	}
	public void setInventoryValuation(Integer inventoryValuation) {
		this.inventoryValuation = inventoryValuation;
	}
	public Integer getIssueMethod() {
		return issueMethod;
	}
	public void setIssueMethod(Integer issueMethod) {
		this.issueMethod = issueMethod;
	}
	public Boolean getBatchNo() { 
		 return batchNo; 
		 }
	 public void setBatchNo(Boolean batchNo) {
		 this.batchNo = batchNo;
		 }
	 public Boolean getExpiryDate() { 
		 return expiryDate;
		 } 
	 public void setExpiryDate(Boolean expiryDate) { 
		this.expiryDate = expiryDate;
		} 
	 public Boolean getMrp() {
	      return mrp;
	      } 
	 public void setMrp(Boolean mrp) { 
		  this.mrp = mrp;
		  }
	 public Boolean getManufactureDetails() {
		 return manufactureDetails; 
		 }
     public void setManufactureDetails(Boolean manufactureDetails)
          { this.manufactureDetails = manufactureDetails; 
	      }
	 
	public List<ItemMasterDetailBean> dataArray;
	private List<ItemMasterDetailBean> itemMasterDetailBean;
	public List<ItemMasterDetailBean> getDataArray() {
		return dataArray;
	}
	public void setDataArray(List<ItemMasterDetailBean> dataArray) {
		this.dataArray = dataArray;
	}
	
	public Boolean getPurchaseReq() {
		return purchaseReq;
	}
	public void setPurchaseReq(Boolean purchaseReq) {
		this.purchaseReq = purchaseReq;
	}
	public Integer getCostingMethod() {
		return costingMethod;
	}
	public void setCostingMethod(Integer costingMethod) {
		this.costingMethod = costingMethod;
	}
	public Integer getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(Integer costPrice) {
		this.costPrice = costPrice;
	}
	public Integer getWarranty() {
		return warranty;
	}
	public void setWarranty(Integer warranty) {
		this.warranty = warranty;
	}
	public Integer getLeadTime() {
		return leadTime;
	}
	public void setLeadTime(Integer leadTime) {
		this.leadTime = leadTime;
	}
	public Integer getPurchaseMethod() {
		return purchaseMethod;
	}
	public void setPurchaseMethod(Integer purchaseMethod) {
		this.purchaseMethod = purchaseMethod;
	}
	public Integer getPruchaseUom() {
		return pruchaseUom;
	}
	public void setPruchaseUom(Integer pruchaseUom) {
		this.pruchaseUom = pruchaseUom;
	}
	public String getReorderLevel() {
		return reorderLevel;
	}
	public void setReorderLevel(String reorderLevel) {
		this.reorderLevel = reorderLevel;
	}
	
	public Integer getMinimumQty() {
		return minimumQty;
	}
	public void setMinimumQty(Integer minimumQty) {
		this.minimumQty = minimumQty;
	}
	public Integer getMaximumQty() {
		return maximumQty;
	}
	public void setMaximumQty(Integer maximumQty) {
		this.maximumQty = maximumQty;
	}
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
	
	public List<ItemMasterDetailBean> getItemMasterDetailBean() {
		return itemMasterDetailBean;
	}
	public void setItemMasterDetailBean(List<ItemMasterDetailBean> itemMasterDetailBean) {
		this.itemMasterDetailBean = itemMasterDetailBean;
	}

	
	
	
}
