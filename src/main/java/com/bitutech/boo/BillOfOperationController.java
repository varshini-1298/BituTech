package com.bitutech.boo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;

@RestController
@RequestMapping("/api/auth/app/billOfOperation")
public class BillOfOperationController {
	@Autowired
	BillOfOperationService billOfOperationService;
	
	@RequestMapping(value="/save")
	public BillOfOperationBean save(@RequestBody BillOfOperationBean bean) {
		BillOfOperationBean objbean = new BillOfOperationBean();
		try {
			objbean = billOfOperationService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public BillOfOperationResultBean getBooList() throws Exception {
		BillOfOperationResultBean objResultBean = new BillOfOperationResultBean();
		objResultBean.setDesignationMasterDetails(billOfOperationService.getBooList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}

}
