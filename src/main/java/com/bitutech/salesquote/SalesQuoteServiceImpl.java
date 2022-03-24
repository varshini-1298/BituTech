package com.bitutech.salesquote;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesQuoteServiceImpl implements SalesQuoteService {
	@Autowired
	SalesQuoteDao uomDao;

	@Override
	public SalesQuoteResultBean save(SalesQuoteBean bean) throws Exception {
		return uomDao.save(bean);
	}

	@Override
	public List<SalesQuoteBean> getSalesQuoteList() throws Exception {
		// TODO Auto-generated method stub
		return uomDao.getSalesQuoteList();
	}

	@Override
	public List<SalesQuoteBean> getUomcateList() throws Exception {
		// TODO Auto-generated method stub
		return uomDao.getUomcateList();
	}

	


	
}
