package com.bitutech.departmentmaster;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;

@RestController
@RequestMapping("/api/auth/app/customerMaster")
public class DepartmentMasterController {
	DepartmentMasterService customerMasterService;
	
	@RequestMapping(value="/save")
	public DepartmentMasterBean save(@RequestBody DepartmentMasterBean bean) {
		DepartmentMasterBean objbean = new DepartmentMasterBean();
		try {
			objbean = customerMasterService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public DepartmentMasterResultBean getCustomerList() throws Exception {
		DepartmentMasterResultBean objResultBean = new DepartmentMasterResultBean();
		objResultBean.setDepartmentMasterDetails(customerMasterService.getCustomerList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}

}
