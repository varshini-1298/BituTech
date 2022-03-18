package com.bitutech.countrymaster;

import java.util.List;

public interface CountryMasterDao {

	CountryMasterBean save(CountryMasterBean bean) throws Exception;

	List<CountryMasterBean> getCustomerList() throws Exception;

}
