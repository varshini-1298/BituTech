package com.bitutech.stockVerification;

import java.util.List;

public interface StockVerificationDao {

	StockVerificationResultBean save(StockVerificationBean bean) throws Exception;
	
	List<StockVerificationBean> getStockList() throws Exception;
	
	List<StockVerificationBean> getLocationList() throws Exception;

	StockVerificationResultBean update(StockVerificationBean bean) throws Exception;



	StockVerificationResultBean edit(String bean) throws Exception;

	StockVerificationResultBean delete(String stockVerificationNo) throws Exception;
	
}
