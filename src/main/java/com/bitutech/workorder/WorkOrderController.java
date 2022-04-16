package com.bitutech.workorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;

@RestController
@RequestMapping("/api/auth/app/workOrder")
public class WorkOrderController {
	@Autowired
	WorkOrderService workOrderService;
	
	@RequestMapping(value="/save")
	public WorkOrderResultBean save(@RequestBody WorkOrderHdrObjBean bean) {
		WorkOrderResultBean objbean = new WorkOrderResultBean();
		try {
			objbean = workOrderService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public WorkOrderResultBean getWorkOrderList() throws Exception {
		WorkOrderResultBean objResultBean = new WorkOrderResultBean();
		objResultBean.setWorkOrderDetails(workOrderService.getWorkOrderList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}

	
	@RequestMapping(value = "/getWorkOrderNumber")
   	public WorkOrderResultBean getWorkOrderNumber() throws Exception {
		WorkOrderResultBean objResultBean = new WorkOrderResultBean();
		objResultBean = workOrderService.getWorkOrderNumber();
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}
	
	@RequestMapping(value = "/getSalesOrderNoList")
   	public WorkOrderResultBean getSalesOrderNoList() throws Exception {
   		return workOrderService.getSalesOrderNoList();
   	}
	
	@RequestMapping(value = "/getUomList")
   	public WorkOrderResultBean getUomList() throws Exception {
   		return workOrderService.getUomList();
   	}
}
