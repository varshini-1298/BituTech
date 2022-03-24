package com.bitutech.purchasequote;

import java.util.List;

public interface PurchaseQuoteDao {

	PurchaseQuoteResultBean save(PurchaseQuoteBean bean) throws Exception;

	List<PurchaseQuoteBean> getPurchaseQuoteList() throws Exception;

	List<PurchaseQuoteBean> getUomcateList() throws Exception;

}
