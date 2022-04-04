package com.bitutech.stockVerification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/app/stockVerification")
public class StockVerificationController {
	@Autowired
	StockVerificationService stockVerificationService;
	
	@RequestMapping(value="/save")
	public StockVerificationResultBean save(@RequestBody StockVerificationBean bean) {
		StockVerificationResultBean objbean = new StockVerificationResultBean();
		try {
			objbean = stockVerificationService.save(bean);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objbean;
	}
	
	@RequestMapping(value="/getList")
	public StockVerificationResultBean getStockList() throws Exception{
		StockVerificationResultBean objResultBean = new StockVerificationResultBean();
		objResultBean.setStockVerificationDetails(stockVerificationService.getStockList());
		objResultBean.setSuccess(true);
		return objResultBean;
	}
	
	@RequestMapping(value = "/getLocationList")
	public StockVerificationResultBean getLocationList() throws Exception {
		StockVerificationResultBean objResultBean = new StockVerificationResultBean();
		objResultBean.setLocationList(stockVerificationService.getLocationList());
		objResultBean.setSuccess(true);
		return objResultBean;
	}
	
	

}
