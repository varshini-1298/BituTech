package com.bitutech.designationmaster;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DesignationMasterServiceImpl implements DesignationMasterService {
	
	DesignationMasterDao customerMasterDao;

	@Override
	public DesignationMasterBean save(DesignationMasterBean bean) throws Exception {
		return customerMasterDao.save(bean);
	}

	@Override
	public List<DesignationMasterBean> getCustomerList() throws Exception {
		// TODO Auto-generated method stub
		return customerMasterDao.getCustomerList();
	}

	


	
}
