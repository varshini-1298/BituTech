package com.bitutech.boo;

import java.util.List;

public interface BillOfOperationService {

	BillOfOperationResultBean save(BillOfOperationBean bean) throws Exception;

	BillOfOperationResultBean edit(Integer bean) throws Exception;

	BillOfOperationResultBean update(BillOfOperationBean bean) throws Exception;

	BillOfOperationResultBean delete(Integer bean) throws Exception;

	public List<BillOfOperationBean> getBooList() throws Exception;

}