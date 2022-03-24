package com.bitutech.salesquote;

public class SalesQuoteBean {
	
	private String customer;
	private String validFrom;
	private String validTo;
	private String termCondition;
	private String id;
	private String text;
	
	
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
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}
	public String getValidTo() {
		return validTo;
	}
	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}
	public String getTermCondition() {
		return termCondition;
	}
	public void setTermCondition(String termCondition) {
		this.termCondition = termCondition;
	}
	
	
	
	
	
}
