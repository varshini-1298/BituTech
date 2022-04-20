package com.bitutech.stockVerification;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockVerificationServiceImpl implements StockVerificationService {
	@Autowired
	StockVerificationDao stockVerificationDao;
	
	@Override
	public StockVerificationResultBean save(StockVerificationBean bean) throws Exception {
		return stockVerificationDao.save(bean);
	}

	@Override
	public List<StockVerificationBean> getStockList() throws Exception {
		return stockVerificationDao.getStockList();
	}

	@Override
	public List<StockVerificationBean> getLocationList() throws Exception {
		return stockVerificationDao.getLocationList();
	}

	
	
	@Override
	public StockVerificationResultBean delete(String bean) throws Exception {
		// TODO Auto-generated method stub
		return stockVerificationDao.delete(bean) ;
	}

	@Override
	public StockVerificationResultBean edit(String bean) throws Exception {
		// TODO Auto-generated method stub
		return stockVerificationDao.edit(bean);
	}

	@Override
	public StockVerificationResultBean update(StockVerificationBean bean) throws Exception {
		// TODO Auto-generated method stub
		return stockVerificationDao.update(bean);
	}

}
