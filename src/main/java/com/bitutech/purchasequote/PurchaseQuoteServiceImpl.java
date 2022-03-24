package com.bitutech.purchasequote;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseQuoteServiceImpl implements PurchaseQuoteService {
	@Autowired
	PurchaseQuoteDao uomDao;

	@Override
	public PurchaseQuoteResultBean save(PurchaseQuoteBean bean) throws Exception {
		return uomDao.save(bean);
	}

	@Override
	public List<PurchaseQuoteBean> getPurchaseQuoteList() throws Exception {
		// TODO Auto-generated method stub
		return uomDao.getPurchaseQuoteList();
	}

	@Override
	public List<PurchaseQuoteBean> getUomcateList() throws Exception {
		// TODO Auto-generated method stub
		return uomDao.getUomcateList();
	}

	


	
}
