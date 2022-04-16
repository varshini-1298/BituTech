package com.bitutech.boo;

import java.util.List;

public class BillOfOperationBean {
	
	private String booNo;
	private String bomRef;
	private String productName;
	private String date;
	private Integer idNo;
	public List<BooDetailBean> dataArray;
	
	


	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBomRef() {
		return bomRef;
	}
	public void setBomRef(String bomRef) {
		this.bomRef = bomRef;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public Integer getIdNo() {
		return idNo;
	}
	public void setIdNo(Integer idNo) {
		this.idNo = idNo;
	}
	public String getBooNo() {
		return booNo;
	}
	public void setBooNo(String booNo) {
		this.booNo = booNo;
	}
	
	

	
	
	
}
