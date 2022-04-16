package com.bitutech.customerMaster;

import java.util.List;

public interface CustomerMasterDao {

	CustomerMasterResultBean save(CustomerMasterBean bean) throws Exception;

	List<CustomerMasterBean> getCustomerList() throws Exception;

	CustomerMasterResultBean getCode(String code) throws Exception;

	CustomerMasterResultBean delete(String code) throws Exception;

	CustomerMasterResultBean update(CustomerMasterBean bean) throws Exception;

}
