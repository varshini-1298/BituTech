package com.bitutech.countrymaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/app/countryMaster")
public class CountryMasterController {
	@Autowired
	CountryMasterService countryMasterService;
	
	@RequestMapping(value="/save")
	public CountryMasterResultBean save(@RequestBody CountryMasterBean bean) {
		CountryMasterResultBean objbean = new CountryMasterResultBean();
		try {
			objbean = countryMasterService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public CountryMasterResultBean getCountryList() throws Exception {
		CountryMasterResultBean objResultBean = new CountryMasterResultBean();
		objResultBean.setCountryMasterDetails(countryMasterService.getCountryList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}
	
	@RequestMapping(value = "/getCurrencyList")
   	public CountryMasterResultBean getCurrencyList() throws Exception {
		CountryMasterResultBean objResultBean = new CountryMasterResultBean();
		objResultBean.setCurrencyList(countryMasterService.getCurrencyList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}
	
	@GetMapping(value = "/delete")
	public CountryMasterResultBean deleteCountryDtl(@RequestParam String countryCode) {
		CountryMasterResultBean countryMasterResultBean = new CountryMasterResultBean();
		try {
			countryMasterResultBean = countryMasterService.deleteCountryDtl(countryCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return countryMasterResultBean;

	}

}
