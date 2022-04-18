package com.bitutech.customerMaster;

import java.util.List;

public interface CustomerMasterService {

	CustomerMasterResultBean save(CustomerMasterBean bean) throws Exception;

	public List<CustomerMasterBean> getCustomerList() throws Exception;

	CustomerMasterResultBean getCode(String code) throws Exception;

	CustomerMasterResultBean delete(String code) throws Exception;
	
	CustomerMasterResultBean update(CustomerMasterBean bean) throws Exception;

}