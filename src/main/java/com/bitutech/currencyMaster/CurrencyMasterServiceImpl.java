package com.bitutech.currencyMaster;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CurrencyMasterServiceImpl implements CurrencyMasterService {
	
	CurrencyMasterDao currencyMasterDao;

	@Override
	public CurrencyMasterBean save(CurrencyMasterBean bean) throws Exception {
		return currencyMasterDao.save(bean);
	}

	@Override
	public List<CurrencyMasterBean> getCustomerList() throws Exception {
		// TODO Auto-generated method stub
		return currencyMasterDao.getCustomerList();
	}

	


	
}
