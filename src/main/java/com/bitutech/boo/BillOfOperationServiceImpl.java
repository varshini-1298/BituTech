package com.bitutech.boo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillOfOperationServiceImpl implements BillOfOperationService {
	@Autowired
	BillOfOperationDao billOfOperationDao;

	@Override
	public BillOfOperationResultBean save(BillOfOperationBean bean) throws Exception {
		return billOfOperationDao.save(bean);
	}

	@Override
	public List<BillOfOperationBean> getBooList() throws Exception {
		// TODO Auto-generated method stub
		return billOfOperationDao.getBooList();
	}

	@Override
	public BillOfOperationResultBean edit(Integer bean) throws Exception {
		// TODO Auto-generated method stub
		return billOfOperationDao.edit(bean);
	}

	@Override
	public BillOfOperationResultBean update(BillOfOperationBean bean) throws Exception {
		// TODO Auto-generated method stub
		return billOfOperationDao.update(bean);
	}

	@Override
	public BillOfOperationResultBean delete(Integer bean) throws Exception {
		// TODO Auto-generated method stub
		return billOfOperationDao.delete(bean);
	}

	


	
}
