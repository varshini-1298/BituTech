package com.bitutech.customerMaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;

@RestController
@RequestMapping("/api/auth/app/customerMaster")
public class CustomerMasterController {
	@Autowired
	CustomerMasterService customerMasterService;
	
	@RequestMapping(value="/save")
	public CustomerMasterResultBean save(@RequestBody CustomerMasterBean bean) {
		CustomerMasterResultBean objbean = new CustomerMasterResultBean();
		try {
			objbean = customerMasterService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public CustomerMasterResultBean getCustomerList() throws Exception {
		CustomerMasterResultBean objResultBean = new CustomerMasterResultBean();
		objResultBean.setCustomerMasterDetails(customerMasterService.getCustomerList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}

}
