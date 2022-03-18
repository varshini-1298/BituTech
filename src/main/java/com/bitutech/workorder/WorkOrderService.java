package com.bitutech.workorder;

import java.util.List;

public interface WorkOrderService {

	WorkOrderBean save(WorkOrderBean bean) throws Exception;

	public List<WorkOrderBean> getWorkOrderList() throws Exception;

}