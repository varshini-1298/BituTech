package com.bitutech.salesorder;

import java.util.List;

public interface SalesOrderService {

	SalesOrderResultBean save(SalesOrderBean bean) throws Exception;

	public List<SalesOrderBean> getSalesOrderList() throws Exception;

	public List<SalesOrderBean> getUomcateList() throws Exception;

}