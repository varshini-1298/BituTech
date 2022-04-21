package com.bitutech.countrymaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CountryMasterServiceImpl implements CountryMasterService {
	@Autowired
	CountryMasterDao customerMasterDao;

	@Override
	public CountryMasterResultBean save(CountryMasterBean bean) throws Exception {
		return customerMasterDao.save(bean);
	}

	@Override
	public List<CountryMasterBean> getCountryList() throws Exception {
		// TODO Auto-generated method stub
		return customerMasterDao.getCountryList();
	}

	@Override
	public List<CountryMasterBean> getCurrencyList() throws Exception {
		// TODO Auto-generated method stub
		return customerMasterDao.getCurrencyList();
	}

	@Override
	public CountryMasterResultBean edit(String countryCode) throws Exception {
		// TODO Auto-generated method stub
		return customerMasterDao.edit(countryCode);
	}

	@Override
	public CountryMasterResultBean update(CountryMasterBean countryCode) throws Exception {
		// TODO Auto-generated method stub
		return customerMasterDao.update(countryCode);
	}

	@Override
	public CountryMasterResultBean deleteCountryDtl(String countryCode) throws Exception {
		// TODO Auto-generated method stub
		return customerMasterDao.deleteCountryDtl(countryCode);
	}

	@Override
	public CountryMasterResultBean getCode(String countryCode) throws Exception {
		// TODO Auto-generated method stub
		return customerMasterDao.getCode(countryCode);
	}

	


	
}
