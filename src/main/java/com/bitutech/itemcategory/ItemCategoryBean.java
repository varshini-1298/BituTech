package com.bitutech.itemcategory;

import java.util.List;


public class ItemCategoryBean {
	
	private String categoryName;
	private Integer propertyId;
	private Integer parentCategory;
	private Integer categoryType;
	private Boolean incomingQty;
	private String id;
	private String text;
	private String catagoryId;
	private String batchNO;
	private String expiryDate;
	private String mrp;
	private String manufactureDetails;
	private String salesTaxes;
	private String purchaseTaxes;
	private String assetAccount;
	private String deptAccount;
	private String AccuDept;
	private String propertyName;
	private String propertyType;
	private String length;
	private String isMandantory;
  	private List<itemCategoryAcc> itemCategoryAcc;
	private List<itemCategoryProperty> itemCategoryProperty;
	private List<itemCategoryGRN> itemCategoryGRN;

	
	
	
	public String getBatchNO() {
		return batchNO;
	}
	public void setBatchNO(String batchNO) {
		this.batchNO = batchNO;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getMrp() {
		return mrp;
	}
	public void setMrp(String mrp) {
		this.mrp = mrp;
	}
	public String getManufactureDetails() {
		return manufactureDetails;
	}
	public void setManufactureDetails(String manufactureDetails) {
		this.manufactureDetails = manufactureDetails;
	}
	public String getSalesTaxes() {
		return salesTaxes;
	}
	public void setSalesTaxes(String salesTaxes) {
		this.salesTaxes = salesTaxes;
	}
	public String getPurchaseTaxes() {
		return purchaseTaxes;
	}
	public void setPurchaseTaxes(String purchaseTaxes) {
		this.purchaseTaxes = purchaseTaxes;
	}
	public String getAssetAccount() {
		return assetAccount;
	}
	public void setAssetAccount(String assetAccount) {
		this.assetAccount = assetAccount;
	}
	public String getDeptAccount() {
		return deptAccount;
	}
	public void setDeptAccount(String deptAccount) {
		this.deptAccount = deptAccount;
	}
	public String getAccuDept() {
		return AccuDept;
	}
	public void setAccuDept(String accuDept) {
		AccuDept = accuDept;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getIsMandantory() {
		return isMandantory;
	}
	public void setIsMandantory(String isMandantory) {
		this.isMandantory = isMandantory;
	}
	public final Integer getPropertyId() {
		return propertyId;
	}
	public final void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}
	public final List<itemCategoryGRN> getItemCategoryGRN() {
		return itemCategoryGRN;
	}
	public final void setItemCategoryGRN(List<itemCategoryGRN> itemCategoryGRN) {
		this.itemCategoryGRN = itemCategoryGRN;
	}
	public final List<itemCategoryProperty> getItemCategoryProperty() {
		return itemCategoryProperty;
	}
	public final void setItemCategoryProperty(List<itemCategoryProperty> itemCategoryProperty) {
		this.itemCategoryProperty = itemCategoryProperty;
	}
	public final List<itemCategoryAcc> getItemCategoryAcc() {
		return itemCategoryAcc;
	}
	public final void setItemCategoryAcc(List<itemCategoryAcc> itemCategoryAcc) {
		this.itemCategoryAcc = itemCategoryAcc;
	}
	public final String getCatagoryId() {
		return catagoryId;
	}
	public final void setCatagoryId(String catagoryId) {
		this.catagoryId = catagoryId;
	}
	public final Boolean getIncomingQty() {
		return incomingQty;
	}
	public final void setIncomingQty(Boolean incomingQty) {
		this.incomingQty = incomingQty;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public final String getCategoryName() {
		return categoryName;
	}
	public final void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public final Integer getParentCategory() {
		return parentCategory;
	}
	public final void setParentCategory(Integer parentCategory) {
		this.parentCategory = parentCategory;
	}
	public final Integer getCategoryType() {
		return categoryType;
	}
	public final void setCategoryType(Integer categoryType) {
		this.categoryType = categoryType;
	}
	
	
	
	
	
	
	
}
