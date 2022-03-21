package com.bitutech.workorder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkOrderServiceImpl implements WorkOrderService {
	@Autowired
	WorkOrderDao designationMasterDao;

	@Override
	public WorkOrderResultBean save(WorkOrderBean bean) throws Exception {
		return designationMasterDao.save(bean);
	}

	@Override
	public List<WorkOrderBean> getWorkOrderList() throws Exception {
		// TODO Auto-generated method stub
		return designationMasterDao.getWorkOrderList();
	}

	


	
}
