package com.bitutech.boo;

import java.util.List;

public interface BillOfOperationService {

	BillOfOperationResultBean save(BillOfOperationBean bean) throws Exception;

	BillOfOperationResultBean edit(String bean) throws Exception;
	
	BillOfOperationResultBean getBooNo() throws Exception;

	BillOfOperationResultBean getBooNoList() throws Exception;
	
	BillOfOperationResultBean update(BillOfOperationBean bean) throws Exception;

	BillOfOperationResultBean delete(String billOfOperation) throws Exception;

	public List<BillOfOperationBean> getBooList() throws Exception;

}