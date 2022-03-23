package com.bitutech.salesorder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesOrderServiceImpl implements SalesOrderService {
	@Autowired
	SalesOrderDao uomDao;

	@Override
	public SalesOrderResultBean save(SalesOrderBean bean) throws Exception {
		return uomDao.save(bean);
	}

	@Override
	public List<SalesOrderBean> getSalesOrderList() throws Exception {
		// TODO Auto-generated method stub
		return uomDao.getSalesOrderList();
	}

	@Override
	public List<SalesOrderBean> getUomcateList() throws Exception {
		// TODO Auto-generated method stub
		return uomDao.getUomcateList();
	}

	


	
}
