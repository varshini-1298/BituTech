package com.bitutech.workorder;

import java.util.List;

public interface WorkOrderDao {

	WorkOrderResultBean save(WorkOrderBean bean) throws Exception;

	List<WorkOrderBean> getWorkOrderList() throws Exception;

}
