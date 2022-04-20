package com.bitutech.stockVerification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
	  @RequestMapping(value="/edit") 
	  public StockVerificationResultBean
	  edit(@RequestParam("stockVerification") String stockVerification) {
	  StockVerificationResultBean objResultBean = new StockVerificationResultBean();
	  try 
	  { objResultBean = stockVerificationService.edit(stockVerification);
	  }
	  catch(Exception e){ 
		  e.printStackTrace(); } 
	  return objResultBean;
	  
	  }
	  
	  @RequestMapping(value="/update") public StockVerificationResultBean
	  update(@RequestBody StockVerificationBean bean) { StockVerificationResultBean
	  objResultBean = new StockVerificationResultBean(); 
	  try { objResultBean =
			  stockVerificationService.update(bean); 
	  }
	  catch(Exception e){
	  e.printStackTrace(); }
	  return objResultBean;
	  
	  }
	  
	  @RequestMapping(value="/delete")
	  public StockVerificationResultBean
	  delete(@RequestParam("stockVerification") String stockVerification) {
	  StockVerificationResultBean objResultBean = new StockVerificationResultBean();
	  try { objResultBean = stockVerificationService.delete(stockVerification);
	  }
	  catch(Exception e){
		  e.printStackTrace(); }
	  return objResultBean;
	  
	  }
	 

}
