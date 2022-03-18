package com.bitutech.countrymaster;

import java.util.List;

public interface CountryMasterService {

	CountryMasterBean save(CountryMasterBean bean) throws Exception;

	public List<CountryMasterBean> getCountryList() throws Exception;

}