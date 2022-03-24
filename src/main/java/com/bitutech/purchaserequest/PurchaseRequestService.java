package com.bitutech.purchaserequest;

import java.util.List;

public interface PurchaseRequestService {

	PurchaseRequestResultBean save(PurchaseRequestBean bean) throws Exception;

	public List<PurchaseRequestBean> getPurchaseRequestList() throws Exception;

	public List<PurchaseRequestBean> getUomcateList() throws Exception;

}