package com.bitutech.boo;

import java.util.List;

public interface BillOfOperationDao {

	BillOfOperationBean save(BillOfOperationBean bean) throws Exception;

	List<BillOfOperationBean> getBooList() throws Exception;

}
