package com.bitutech.stockVerification;

import java.util.List;

public interface StockVerificationService {

	StockVerificationResultBean save(StockVerificationBean bean) throws Exception;
	
	public List<StockVerificationBean> getStockList() throws Exception;
	
	public List<StockVerificationBean> getLocationList() throws Exception;
	
}
