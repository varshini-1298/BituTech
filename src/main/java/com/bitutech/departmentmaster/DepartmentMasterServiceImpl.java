package com.bitutech.departmentmaster;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DepartmentMasterServiceImpl implements DepartmentMasterService {
	
	DepartmentMasterDao customerMasterDao;

	@Override
	public DepartmentMasterBean save(DepartmentMasterBean bean) throws Exception {
		return customerMasterDao.save(bean);
	}

	@Override
	public List<DepartmentMasterBean> getCustomerList() throws Exception {
		// TODO Auto-generated method stub
		return customerMasterDao.getCustomerList();
	}

	


	
}
