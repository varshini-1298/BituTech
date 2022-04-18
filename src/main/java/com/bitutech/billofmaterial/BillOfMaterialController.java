package com.bitutech.billofmaterial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;
import com.bitutech.workorder.WorkOrderResultBean;

@RestController
@RequestMapping("/api/auth/app/billofmaterial")
public class BillOfMaterialController {
	@Autowired
	BillOfMaterialService bomService;
	
	@RequestMapping(value="/save")
	public BillOfMaterialResultBean save(@RequestBody BillOfMaterialHdrObjBean bean) {
		BillOfMaterialResultBean objbean = new BillOfMaterialResultBean();
		try {
			objbean = bomService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	@RequestMapping(value = "/getBomNumber")
   	public BillOfMaterialResultBean getBomNumber() throws Exception {
		BillOfMaterialResultBean objResultBean = bomService.getBomNumber();
   		return objResultBean;
   	}
	
	
	@RequestMapping(value = "/getList")
   	public BillOfMaterialResultBean getList() throws Exception {
		BillOfMaterialResultBean objResultBean = new BillOfMaterialResultBean();
		objResultBean = bomService.getList();
   		return objResultBean;
   	}
	
	
	@RequestMapping(value = "/getWorkOrderList")
   	public BillOfMaterialResultBean getWorkOrderList() throws Exception {
		BillOfMaterialResultBean objResultBean = new BillOfMaterialResultBean();
		objResultBean = bomService.getWorkOrderList();
   		return objResultBean;
   	}
}
