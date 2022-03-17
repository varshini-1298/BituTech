package com.bitutech.salescallentry;

import org.springframework.stereotype.Service;

@Service
public class SalesCallEntryServiceImpl implements SalesCallEntryService {
	SalesCallEntryDao SalesCallEntryDao;

	@Override
	public SalesCallEntryBean save(SalesCallEntryBean bean) throws Exception {
		// TODO Auto-generated method stub
		return SalesCallEntryDao.save(bean);
	}

}
