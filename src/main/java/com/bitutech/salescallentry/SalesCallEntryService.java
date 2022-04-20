package com.bitutech.salescallentry;

import java.util.List;

public interface SalesCallEntryService {

	SalesCallEntryResultBean save(SalesCallEntryBean bean) throws Exception;
	
	SalesCallEntryResultBean edit(Integer salescallEntry) throws Exception;

	SalesCallEntryResultBean update(SalesCallEntryBean bean) throws Exception;

	SalesCallEntryResultBean delete(Integer bean) throws Exception;

	public List<SalesCallEntryBean> getList() throws Exception;
}
