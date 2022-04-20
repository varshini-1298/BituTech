package com.bitutech.currencyMaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyMasterServiceImpl implements CurrencyMasterService {
	@Autowired
	CurrencyMasterDao currencyMasterDao;

	@Override
	public CurrencyMasterResultBean save(CurrencyMasterBean bean) throws Exception {
		return currencyMasterDao.save(bean);
	}

	@Override
	public List<CurrencyMasterBean> getCurrencyList() throws Exception {
		// TODO Auto-generated method stub
		return currencyMasterDao.getCurrencyList();
	}

	@Override
	public CurrencyMasterResultBean edit(String bean) throws Exception {
		// TODO Auto-generated method stub
		return currencyMasterDao.edit(bean);
	}

	@Override
	public CurrencyMasterResultBean update(CurrencyMasterBean bean) throws Exception {
		// TODO Auto-generated method stub
		return currencyMasterDao.update(bean);
	}

	@Override
	public CurrencyMasterResultBean delete(String bean) throws Exception {
		// TODO Auto-generated method stub
		return currencyMasterDao.delete(bean);
	}


	
}
