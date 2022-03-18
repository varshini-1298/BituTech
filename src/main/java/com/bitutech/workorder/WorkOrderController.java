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
	public WorkOrderBean save(@RequestBody WorkOrderBean bean) {
		WorkOrderBean objbean = new WorkOrderBean();
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
		objResultBean.setWorkOrderrDetails(workOrderService.getWorkOrderList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}

}
