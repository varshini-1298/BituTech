package com.bitutech.purchaserequest;

import java.util.List;

public interface PurchaseRequestDao {

	PurchaseRequestResultBean save(PurchaseRequestBean bean) throws Exception;

	List<PurchaseRequestBean> getPurchaseRequestList() throws Exception;

	List<PurchaseRequestBean> getUomcateList() throws Exception;

}
