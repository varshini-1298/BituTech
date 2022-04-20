package com.bitutech.currencyMaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/auth/app/currencyMaster")
public class CurrencyMasterController {
	@Autowired
	CurrencyMasterService currencyMasterService;
	
	@RequestMapping(value="/save")
	public CurrencyMasterResultBean save(@RequestBody CurrencyMasterBean bean) {
		CurrencyMasterResultBean objbean = new CurrencyMasterResultBean();
		try {
			objbean = currencyMasterService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public CurrencyMasterResultBean getCurrencyList() throws Exception {
		CurrencyMasterResultBean objResultBean = new CurrencyMasterResultBean();
		objResultBean.setCurrencyMasterDetails(currencyMasterService.getCurrencyList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}
	@RequestMapping(value="/edit")
	public CurrencyMasterResultBean edit(@RequestParam("currencyMaster") String currencyMaster) {
		CurrencyMasterResultBean objbean = new CurrencyMasterResultBean();
		try {
			objbean = currencyMasterService.edit(currencyMaster);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}

	@RequestMapping(value="/update")
	public CurrencyMasterResultBean update(@RequestBody CurrencyMasterBean currencyMaster) {
		CurrencyMasterResultBean objbean = new CurrencyMasterResultBean();
		try {
			objbean = currencyMasterService.update(currencyMaster);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value="/delete")
	public CurrencyMasterResultBean delete(@RequestParam("currencyMaster") String currencyMaster) {
		CurrencyMasterResultBean objResultBean = new CurrencyMasterResultBean();
		try {
			objResultBean = currencyMasterService.delete(currencyMaster);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objResultBean;
		
	}

}
