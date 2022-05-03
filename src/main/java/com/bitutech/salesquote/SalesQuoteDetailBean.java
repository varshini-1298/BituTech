package com.bitutech.salesquote;

public class SalesQuoteDetailBean {
	
	private String salesQuoteNo;
	private String countValue;
	private Integer item;
	private Integer qty;
	private Integer price;
	
	public String getCountValue() {
		return countValue;
	}
	public void setCountValue(String countValue) {
		this.countValue = countValue;
	}
	public String getSalesQuoteNo() {
		return salesQuoteNo;
	}
	public void setSalesQuoteNo(String salesQuoteNo) {
		this.salesQuoteNo = salesQuoteNo;
	}
	public Integer getItem() {
		return item;
	}
	public void setItem(Integer item) {
		this.item = item;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}

}
