package com.bitutech.currencyMaster;

import java.util.List;

public interface CurrencyMasterDao {

	CurrencyMasterResultBean save(CurrencyMasterBean bean) throws Exception;

	List<CurrencyMasterBean> getCurrencyList() throws Exception;

}
