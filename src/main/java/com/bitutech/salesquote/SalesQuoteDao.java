package com.bitutech.salesquote;

import java.util.List;

public interface SalesQuoteDao {

	SalesQuoteResultBean save(SalesQuoteBean bean) throws Exception;

	List<SalesQuoteBean> getSalesQuoteList() throws Exception;

	List<SalesQuoteBean> getUomcateList() throws Exception;

}
