package com.bitutech.purchasequote;

import java.util.List;

public interface PurchaseQuoteService {

	PurchaseQuoteResultBean save(PurchaseQuoteBean bean) throws Exception;

	public List<PurchaseQuoteBean> getPurchaseQuoteList() throws Exception;

	public List<PurchaseQuoteBean> getUomcateList() throws Exception;

}