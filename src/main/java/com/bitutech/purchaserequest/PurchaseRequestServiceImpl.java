package com.bitutech.purchaserequest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseRequestServiceImpl implements PurchaseRequestService {
	@Autowired
	PurchaseRequestDao uomDao;

	@Override
	public PurchaseRequestResultBean save(PurchaseRequestBean bean) throws Exception {
		return uomDao.save(bean);
	}

	@Override
	public List<PurchaseRequestBean> getPurchaseRequestList() throws Exception {
		// TODO Auto-generated method stub
		return uomDao.getPurchaseRequestList();
	}

	@Override
	public List<PurchaseRequestBean> getUomcateList() throws Exception {
		// TODO Auto-generated method stub
		return uomDao.getUomcateList();
	}

	


	
}
