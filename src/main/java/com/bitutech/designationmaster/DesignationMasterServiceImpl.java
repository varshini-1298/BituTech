package com.bitutech.designationmaster;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DesignationMasterServiceImpl implements DesignationMasterService {
	
	DesignationMasterDao designationMasterDao;

	@Override
	public DesignationMasterBean save(DesignationMasterBean bean) throws Exception {
		return designationMasterDao.save(bean);
	}

	@Override
	public List<DesignationMasterBean> getCustomerList() throws Exception {
		// TODO Auto-generated method stub
		return designationMasterDao.getCustomerList();
	}

	


	
}
