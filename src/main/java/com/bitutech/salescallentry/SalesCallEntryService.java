package com.bitutech.salescallentry;

import java.util.List;

public interface SalesCallEntryService {

	SalesCallEntryResultBean save(SalesCallEntryBean bean) throws Exception;
	
	public List<SalesCallEntryBean> getList() throws Exception;
}
