package com.bitutech.countrymaster;

import java.util.List;

public interface CountryMasterService {

	CountryMasterResultBean save(CountryMasterBean bean) throws Exception;

	public List<CountryMasterBean> getCountryList() throws Exception;

	public List<CountryMasterBean> getCurrencyList() throws Exception;

	public CountryMasterResultBean deleteCountryDtl(String countryCode) throws Exception;

}