package com.bitutech.stockVerification;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class StockVerificationResultBean extends BasicResultBean implements Serializable{
	private static final long serialVersionUID = 1L;

	public boolean Success;
	
	private List<StockVerificationBean> stockVerificationDetails;
	private List<StockVerificationBean> stockList;
	private List<StockVerificationBean> locationList;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}
	
	public List<StockVerificationBean> getStockVerificationDetails() {
		return stockVerificationDetails;
	}

	public void setStockVerificationDetails(List<StockVerificationBean> stockVerificationDetails) {
		this.stockVerificationDetails = stockVerificationDetails;
	}
	
	public List<StockVerificationBean> getStockList() {
		return stockList;
	}

	public void setStockList(List<StockVerificationBean> stockList) {
		this.stockList = stockList;
	}

	public List<StockVerificationBean> getLocationList() {
		return locationList;
	}

	public void setLocationList(List<StockVerificationBean> locationList) {
		this.locationList = locationList;
	}




}
