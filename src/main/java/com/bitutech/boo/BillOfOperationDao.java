package com.bitutech.boo;

import java.util.List;

public interface BillOfOperationDao {

	BillOfOperationResultBean save(BillOfOperationBean bean) throws Exception;

	BillOfOperationResultBean edit(Integer bean) throws Exception;

	BillOfOperationResultBean update(BillOfOperationBean bean) throws Exception;

	BillOfOperationResultBean delete(Integer bean) throws Exception;

	List<BillOfOperationBean> getBooList() throws Exception;

}
