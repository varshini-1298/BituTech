package com.bitutech.currencyMaster;

import java.util.List;



public interface CurrencyMasterService {

	CurrencyMasterResultBean save(CurrencyMasterBean bean) throws Exception;

	public List<CurrencyMasterBean> getCurrencyList() throws Exception;
	CurrencyMasterResultBean edit(String bean) throws Exception;

	CurrencyMasterResultBean update(CurrencyMasterBean bean) throws Exception;

	CurrencyMasterResultBean delete(String bean) throws Exception;

}