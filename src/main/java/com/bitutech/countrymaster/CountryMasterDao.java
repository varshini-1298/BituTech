package com.bitutech.countrymaster;

import java.util.List;

public interface CountryMasterDao {

	CountryMasterResultBean save(CountryMasterBean bean) throws Exception;

	List<CountryMasterBean> getCountryList() throws Exception;

	List<CountryMasterBean> getCurrencyList()  throws Exception;
	CountryMasterResultBean edit(String bean) throws Exception;

	CountryMasterResultBean update(CountryMasterBean bean) throws Exception;

	CountryMasterResultBean deleteCountryDtl(String countryCode) throws Exception;

	CountryMasterResultBean getCode(String countryMaster) throws Exception;

}
