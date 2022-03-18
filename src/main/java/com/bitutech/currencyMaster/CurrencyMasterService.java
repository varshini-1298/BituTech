package com.bitutech.currencyMaster;

import java.util.List;

public interface CurrencyMasterService {

	CurrencyMasterBean save(CurrencyMasterBean bean) throws Exception;

	public List<CurrencyMasterBean> getCurrencyList() throws Exception;

}