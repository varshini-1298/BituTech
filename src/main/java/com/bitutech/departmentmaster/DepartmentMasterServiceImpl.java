package com.bitutech.departmentmaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentMasterServiceImpl implements DepartmentMasterService {
	@Autowired
	DepartmentMasterDao departmentMasterDao;

	@Override
	public DepartmentMasterResultBean save(DepartmentMasterBean bean) throws Exception {
		return departmentMasterDao.save(bean);
	}

	@Override
	public List<DepartmentMasterBean> getDepartmentList() throws Exception {
		// TODO Auto-generated method stub
		return departmentMasterDao.getDepartmentList();
	}

	


	
}
