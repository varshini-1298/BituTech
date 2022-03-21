package com.bitutech.currencyMaster;

import java.util.List;

public interface CurrencyMasterService {

	CurrencyMasterResultBean save(CurrencyMasterBean bean) throws Exception;

	public List<CurrencyMasterBean> getCurrencyList() throws Exception;

}