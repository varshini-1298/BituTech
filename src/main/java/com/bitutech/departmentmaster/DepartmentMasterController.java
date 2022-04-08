package com.bitutech.departmentmaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/auth/app/departmentMaster")
public class DepartmentMasterController {
	@Autowired
	DepartmentMasterService departmentMasterService;
	
	@RequestMapping(value="/save")
	public DepartmentMasterResultBean save(@RequestBody DepartmentMasterBean bean) {
		DepartmentMasterResultBean objbean = new DepartmentMasterResultBean();
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
	
	@RequestMapping(value="/edit")
	public DepartmentMasterResultBean edit(@RequestParam("departmentMaster") String departmentMaster) {
		DepartmentMasterResultBean objResultBean = new DepartmentMasterResultBean();
		try {
			objResultBean = departmentMasterService.edit(departmentMaster);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objResultBean;
		
	}
	
	@RequestMapping(value="/update")
	public DepartmentMasterResultBean update(@RequestBody DepartmentMasterBean bean) {
		DepartmentMasterResultBean objResultBean = new DepartmentMasterResultBean();
		try {
			objResultBean = departmentMasterService.update(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objResultBean;
		
	}
	
	@RequestMapping(value="/delete")
	public DepartmentMasterResultBean delete(@RequestParam("departmentMaster") String departmentMaster) {
		DepartmentMasterResultBean objResultBean = new DepartmentMasterResultBean();
		try {
			objResultBean = departmentMasterService.delete(departmentMaster);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objResultBean;
		
	}

}
