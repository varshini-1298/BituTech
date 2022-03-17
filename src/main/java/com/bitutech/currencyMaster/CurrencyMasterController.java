package com.bitutech.currencyMaster;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;

@RestController
@RequestMapping("/api/auth/app/customerMaster")
public class CurrencyMasterController {
	CurrencyMasterService customerMasterService;
	
	@RequestMapping(value="/save")
	public CurrencyMasterBean save(@RequestBody CurrencyMasterBean bean) {
		CurrencyMasterBean objbean = new CurrencyMasterBean();
		try {
			objbean = customerMasterService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public CurrencyMasterResultBean getCustomerList() throws Exception {
		CurrencyMasterResultBean objResultBean = new CurrencyMasterResultBean();
		objResultBean.setCurrencyMasterDetails(customerMasterService.getCustomerList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}

}
