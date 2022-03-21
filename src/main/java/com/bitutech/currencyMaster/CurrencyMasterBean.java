package com.bitutech.currencyMaster;

public class CurrencyMasterBean {
	private String currencyCode;
	private String currencyName;
	private Integer fromcurrency;
    private Integer toCurrency;
    private Integer defaultValue;
    private Integer fractionPart;
    private Boolean bookCurrency;
    private Boolean isActive;
    
    
	
	public Boolean getBookCurrency() {
		return bookCurrency;
	}
	public void setBookCurrency(Boolean bookCurrency) {
		this.bookCurrency = bookCurrency;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getCurrencyName() {
		return currencyName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	
	public Integer getFromcurrency() {
		return fromcurrency;
	}
	public void setFromcurrency(Integer fromcurrency) {
		this.fromcurrency = fromcurrency;
	}
	public Integer getToCurrency() {
		return toCurrency;
	}
	public void setToCurrency(Integer toCurrency) {
		this.toCurrency = toCurrency;
	}
	public Integer getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(Integer defaultValue) {
		this.defaultValue = defaultValue;
	}
	public Integer getFractionPart() {
		return fractionPart;
	}
	public void setFractionPart(Integer fractionPart) {
		this.fractionPart = fractionPart;
	}
	
    
}
