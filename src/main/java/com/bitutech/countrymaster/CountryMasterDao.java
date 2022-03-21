package com.bitutech.countrymaster;

import java.util.List;

public interface CountryMasterDao {

	CountryMasterResultBean save(CountryMasterBean bean) throws Exception;

	List<CountryMasterBean> getCountryList() throws Exception;

}
