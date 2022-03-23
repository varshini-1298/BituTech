package com.bitutech.salesorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;
import com.bitutech.countrymaster.CountryMasterResultBean;

@RestController
@RequestMapping("/api/auth/app/saleOrder")
public class SalesOrderController {
	@Autowired
	SalesOrderService salesOrderService;
	
	@RequestMapping(value="/save")
	public SalesOrderResultBean save(@RequestBody SalesOrderBean bean) {
		SalesOrderResultBean objbean = new SalesOrderResultBean();
		try {
			objbean = salesOrderService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public SalesOrderResultBean getSalesOrderList() throws Exception {
		SalesOrderResultBean objResultBean = new SalesOrderResultBean();
		objResultBean.setSalesOrderList(salesOrderService.getSalesOrderList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}

	@RequestMapping(value = "/getUomCategory")
   	public SalesOrderResultBean getUomcateList() throws Exception {
		SalesOrderResultBean objResultBean = new SalesOrderResultBean();
		objResultBean.setSalesOrderList(salesOrderService.getUomcateList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}
}
