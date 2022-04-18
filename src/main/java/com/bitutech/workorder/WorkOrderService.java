package com.bitutech.workorder;

import java.util.List;

import com.bitutech.core.util.DropDownList;

public interface WorkOrderService {

	WorkOrderResultBean save(WorkOrderHdrObjBean bean) throws Exception;

	public List<WorkOrderHdrObjBean> getWorkOrderList() throws Exception;

	WorkOrderResultBean getWorkOrderNumber() throws Exception;
	
	WorkOrderResultBean getSalesOrderNoList() throws Exception;
	
	WorkOrderResultBean getUomList() throws Exception;
	
	WorkOrderResultBean getItemList() throws Exception;
}