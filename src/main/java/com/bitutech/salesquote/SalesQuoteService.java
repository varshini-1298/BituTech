package com.bitutech.salesquote;

import java.util.List;

public interface SalesQuoteService {

	SalesQuoteResultBean save(SalesQuoteBean bean) throws Exception;

	public List<SalesQuoteBean> getSalesQuoteList() throws Exception;

	public List<SalesQuoteBean> getUomcateList() throws Exception;

}