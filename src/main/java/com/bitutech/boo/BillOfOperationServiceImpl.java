package com.bitutech.boo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillOfOperationServiceImpl implements BillOfOperationService {
	@Autowired
	BillOfOperationDao designationMasterDao;

	@Override
	public BillOfOperationBean save(BillOfOperationBean bean) throws Exception {
		return designationMasterDao.save(bean);
	}

	@Override
	public List<BillOfOperationBean> getBooList() throws Exception {
		// TODO Auto-generated method stub
		return designationMasterDao.getBooList();
	}

	


	
}
