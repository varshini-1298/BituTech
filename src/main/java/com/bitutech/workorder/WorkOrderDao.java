package com.bitutech.workorder;

import java.util.List;

public interface WorkOrderDao {

	WorkOrderBean save(WorkOrderBean bean) throws Exception;

	List<WorkOrderBean> getWorkOrderList() throws Exception;

}
