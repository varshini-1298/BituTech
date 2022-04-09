package com.bitutech.salescallentry;

import java.util.List;

public interface SalesCallEntryDao {

	SalesCallEntryResultBean save(SalesCallEntryBean bean) throws Exception;
	
	SalesCallEntryResultBean edit(Integer bean) throws Exception;

	SalesCallEntryResultBean update(SalesCallEntryBean bean) throws Exception;

	SalesCallEntryResultBean delete(Integer bean) throws Exception;

	List<SalesCallEntryBean> getList() throws Exception;
}
