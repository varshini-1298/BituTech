package com.bitutech.currencyMaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;

@RestController
@RequestMapping("/api/auth/app/currencyMaster")
public class CurrencyMasterController {
	@Autowired
	CurrencyMasterService currencyMasterService;
	
	@RequestMapping(value="/save")
	public CurrencyMasterBean save(@RequestBody CurrencyMasterBean bean) {
		CurrencyMasterBean objbean = new CurrencyMasterBean();
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

}
