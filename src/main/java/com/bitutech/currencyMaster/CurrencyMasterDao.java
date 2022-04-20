package com.bitutech.currencyMaster;

import java.util.List;

import com.bitutech.departmentmaster.DepartmentMasterBean;
import com.bitutech.departmentmaster.DepartmentMasterResultBean;

public interface CurrencyMasterDao {

	CurrencyMasterResultBean save(CurrencyMasterBean bean) throws Exception;

	List<CurrencyMasterBean> getCurrencyList() throws Exception;
	CurrencyMasterResultBean edit(String bean) throws Exception;

	CurrencyMasterResultBean update(CurrencyMasterBean bean) throws Exception;

	CurrencyMasterResultBean delete(String bean) throws Exception;

}
