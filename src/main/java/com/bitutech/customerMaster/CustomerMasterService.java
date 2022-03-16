package com.bitutech.customerMaster;

import java.util.List;

public interface CustomerMasterService {

	CustomerMasterBean save(CustomerMasterBean bean) throws Exception;

	public List<CustomerMasterBean> getCustomerList() throws Exception;

}