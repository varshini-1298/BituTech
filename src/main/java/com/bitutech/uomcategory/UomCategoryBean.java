package com.bitutech.uomcategory;

public class UomCategoryBean {
	
	private String categoryName;
	private String categoryDesp;
	private boolean active;
	private String uomCode;
	private String id;
	
	public String getUomCode() {
		return uomCode;
	}
	public void setUomCode(String uomCode) {
		this.uomCode = uomCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDesp() {
		return categoryDesp;
	}
	public void setCategoryDesp(String categoryDesp) {
		this.categoryDesp = categoryDesp;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
}
