package com.bitutech.boo;

import java.util.List;

public interface BillOfOperationService {

	BillOfOperationBean save(BillOfOperationBean bean) throws Exception;

	public List<BillOfOperationBean> getBooList() throws Exception;

}