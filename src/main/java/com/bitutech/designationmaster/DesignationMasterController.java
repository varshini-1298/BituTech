package com.bitutech.designationmaster;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;

@RestController
@RequestMapping("/api/auth/app/customerMaster")
public class DesignationMasterController {
	DesignationMasterService customerMasterService;
	
	@RequestMapping(value="/save")
	public DesignationMasterBean save(@RequestBody DesignationMasterBean bean) {
		DesignationMasterBean objbean = new DesignationMasterBean();
		try {
			objbean = customerMasterService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public DesignationMasterResultBean getCustomerList() throws Exception {
		DesignationMasterResultBean objResultBean = new DesignationMasterResultBean();
		objResultBean.setDesignationMasterDetails(customerMasterService.getCustomerList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}

}
