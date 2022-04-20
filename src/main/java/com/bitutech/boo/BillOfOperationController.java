package com.bitutech.boo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/auth/app/billOfOperation")
public class BillOfOperationController {
	@Autowired
	BillOfOperationService billOfOperationService;
	
	@RequestMapping(value="/save")
	public BillOfOperationResultBean save(@RequestBody BillOfOperationBean bean) {
		BillOfOperationResultBean objbean = new BillOfOperationResultBean();
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
		objResultBean.setBillOfOperationDetails(billOfOperationService.getBooList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}
	
	@RequestMapping(value = "/getBooNo")
	public BillOfOperationResultBean getBooNo() throws Exception{
		BillOfOperationResultBean objResultBean = new BillOfOperationResultBean();
		objResultBean = billOfOperationService.getBooNo();
		objResultBean.setSuccess(true);
		return objResultBean;
	}
	
	@RequestMapping(value = "/getBooNoList")
	public BillOfOperationResultBean getBooNoList() throws Exception {
		return billOfOperationService.getBooNoList();
	}
	
	@GetMapping(value="edit")
	public BillOfOperationResultBean edit(@RequestParam("billOfOperation") String billOfOperation) {
		BillOfOperationResultBean objResultBean = new BillOfOperationResultBean();
		try {
			objResultBean = billOfOperationService.edit(billOfOperation);
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return objResultBean;
	}
	
	@RequestMapping(value = "/update")
	public BillOfOperationResultBean update(@RequestBody BillOfOperationBean bean) {
		BillOfOperationResultBean objResultBean = new BillOfOperationResultBean();
		try {
			objResultBean = billOfOperationService.update(bean);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objResultBean;
	}
	
	@RequestMapping(value = "/delete")
	public BillOfOperationResultBean delete(@RequestParam("billOfOperation") String billOfOperation) {
		BillOfOperationResultBean objResultBean = new BillOfOperationResultBean();
		try {
			objResultBean = billOfOperationService.delete(billOfOperation);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return objResultBean;
	}
	

}
