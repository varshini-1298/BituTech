package com.bitutech.countrymaster;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;

@RestController
@RequestMapping("/api/auth/app/countryMaster")
public class CountryMasterController {
	CountryMasterService customerMasterService;
	
	@RequestMapping(value="/save")
	public CountryMasterBean save(@RequestBody CountryMasterBean bean) {
		CountryMasterBean objbean = new CountryMasterBean();
		try {
			objbean = customerMasterService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public CountryMasterResultBean getCustomerList() throws Exception {
		CountryMasterResultBean objResultBean = new CountryMasterResultBean();
		objResultBean.setCountryMasterDetails(customerMasterService.getCustomerList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}

}
