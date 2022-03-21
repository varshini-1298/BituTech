package com.bitutech.customerMaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerMasterServiceImpl implements CustomerMasterService {
	@Autowired
	CustomerMasterDao customerMasterDao;

	@Override
	public CustomerMasterResultBean save(CustomerMasterBean bean) throws Exception {
		return customerMasterDao.save(bean);
	}

	@Override
	public List<CustomerMasterBean> getCustomerList() throws Exception {
		// TODO Auto-generated method stub
		return customerMasterDao.getCustomerList();
	}

	


	
}
