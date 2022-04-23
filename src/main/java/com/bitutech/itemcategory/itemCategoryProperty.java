package com.bitutech.itemcategory;

public class itemCategoryProperty {

	private String propertyName;
	private String propertyType;
	private String length;
	private String isMandantory;
	private String catagoryId;
	
	
	
	public final String getCatagoryId() {
		return catagoryId;
	}
	public final void setCatagoryId(String catagoryId) {
		this.catagoryId = catagoryId;
	}
	public final String getPropertyName() {
		return propertyName;
	}
	public final void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public final String getPropertyType() {
		return propertyType;
	}
	public final void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public final String getLength() {
		return length;
	}
	public final void setLength(String length) {
		this.length = length;
	}
	public final String getIsMandantory() {
		return isMandantory;
	}
	public final void setIsMandantory(String isMandantory) {
		this.isMandantory = isMandantory;
	}
}
