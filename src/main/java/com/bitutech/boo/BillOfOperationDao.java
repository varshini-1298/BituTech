package com.bitutech.boo;

import java.util.List;

public interface BillOfOperationDao {

	BillOfOperationResultBean save(BillOfOperationBean bean) throws Exception;

	BillOfOperationResultBean getBooNo() throws Exception;

	BillOfOperationResultBean getBooNoList() throws Exception;

	BillOfOperationResultBean edit(String bean) throws Exception;

	BillOfOperationResultBean update(BillOfOperationBean bean) throws Exception;

	BillOfOperationResultBean delete(String bean) throws Exception;

	List<BillOfOperationBean> getBooList() throws Exception;

}
