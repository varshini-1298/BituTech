package com.bitutech.salescallentry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesCallEntryServiceImpl implements SalesCallEntryService {
	@Autowired
	SalesCallEntryDao SalesCallEntryDao;

	@Override
	public SalesCallEntryResultBean save(SalesCallEntryBean bean) throws Exception {
		// TODO Auto-generated method stub
		return SalesCallEntryDao.save(bean);
	}

}
