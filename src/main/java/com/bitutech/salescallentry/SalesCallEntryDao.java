package com.bitutech.salescallentry;

import java.util.List;

public interface SalesCallEntryDao {

	SalesCallEntryResultBean save(SalesCallEntryBean bean) throws Exception;
	
	List<SalesCallEntryBean> getList() throws Exception;
}
