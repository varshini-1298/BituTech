package com.bitutech.currencyMaster;

public class CurrencyMasterBean {
	private String currencyCode;
	private String currencyName;
	private String Fromcurrency;
    private String toCurrency;
    private String defaultValue;
    private String fractionPart;
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
	public String getFromcurrency() {
		return Fromcurrency;
	}
	public void setFromcurrency(String fromcurrency) {
		Fromcurrency = fromcurrency;
	}
	public String getToCurrency() {
		return toCurrency;
	}
	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public String getFractionPart() {
		return fractionPart;
	}
	public void setFractionPart(String fractionPart) {
		this.fractionPart = fractionPart;
	}
    
}
