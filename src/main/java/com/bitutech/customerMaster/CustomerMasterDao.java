package com.bitutech.customerMaster;

import java.util.List;

public interface CustomerMasterDao {

	CustomerMasterBean save(CustomerMasterBean bean) throws Exception;

	List<CustomerMasterBean> getCustomerList() throws Exception;

}
