package com.bitutech.departmentmaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;

@RestController
@RequestMapping("/api/auth/app/departmentMaster")
public class DepartmentMasterController {
	@Autowired
	DepartmentMasterService departmentMasterService;
	
	@RequestMapping(value="/save")
	public DepartmentMasterBean save(@RequestBody DepartmentMasterBean bean) {
		DepartmentMasterBean objbean = new DepartmentMasterBean();
		try {
			objbean = departmentMasterService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public DepartmentMasterResultBean getDepartmentList() throws Exception {
		DepartmentMasterResultBean objResultBean = new DepartmentMasterResultBean();
		objResultBean.setDepartmentMasterDetails(departmentMasterService.getDepartmentList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}

}
