package com.bitutech.customerMaster;

import java.util.List;

public interface CustomerMasterDao {

	CustomerMasterResultBean save(CustomerMasterBean bean) throws Exception;

	List<CustomerMasterBean> getCustomerList() throws Exception;

}
