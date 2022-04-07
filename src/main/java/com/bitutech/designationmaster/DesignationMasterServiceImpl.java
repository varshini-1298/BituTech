package com.bitutech.designationmaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesignationMasterServiceImpl implements DesignationMasterService {
	@Autowired
	DesignationMasterDao designationMasterDao;

	@Override
	public DesignationMasterResultBean save(DesignationMasterBean bean) throws Exception {
		return designationMasterDao.save(bean);
	}

	@Override
	public List<DesignationMasterBean> getDesignationList() throws Exception {
		// TODO Auto-generated method stub
		return designationMasterDao.getDesignationList();
	}

	@Override
	public DesignationMasterResultBean edit(String bean) throws Exception {
		// TODO Auto-generated method stub
		return designationMasterDao.edit(bean);
	}

	@Override
	public DesignationMasterResultBean update(DesignationMasterBean bean) throws Exception {
		// TODO Auto-generated method stub
		return designationMasterDao.update(bean);
	}

	@Override
	public DesignationMasterResultBean delete(String bean) throws Exception {
		// TODO Auto-generated method stub
		return designationMasterDao.delete(bean);
	}

	


	
}
