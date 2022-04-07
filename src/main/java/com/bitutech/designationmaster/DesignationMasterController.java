package com.bitutech.designationmaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/app/designationMaster")
public class DesignationMasterController {
	@Autowired
	DesignationMasterService designationMasterService;
	
	@RequestMapping(value="/save")
	public DesignationMasterResultBean save(@RequestBody DesignationMasterBean bean) {
		DesignationMasterResultBean objbean = new DesignationMasterResultBean();
		try {
			objbean = designationMasterService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	@RequestMapping(value = "/getList")
   	public DesignationMasterResultBean getDesignationList() throws Exception {
		DesignationMasterResultBean objResultBean = new DesignationMasterResultBean();
		objResultBean.setDesignationMasterDetails(designationMasterService.getDesignationList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}
	
	@RequestMapping(value="/edit")
	public DesignationMasterResultBean edit(@RequestParam("designationMaster") String designationMaster) {
		DesignationMasterResultBean objResultBean = new DesignationMasterResultBean();
		try {
			objResultBean = designationMasterService.edit(designationMaster);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objResultBean;
	}
	
	@RequestMapping(value="/update")
	public DesignationMasterResultBean update(@RequestBody DesignationMasterBean bean) {
		DesignationMasterResultBean objResultBean = new DesignationMasterResultBean();
		try {
			objResultBean = designationMasterService.update(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objResultBean;
		
	}
	
	@RequestMapping(value="/delete")
	public DesignationMasterResultBean delete(@RequestParam("designationMaster") String designationMaster) {
		DesignationMasterResultBean objResultBean = new DesignationMasterResultBean();
		try {
			objResultBean = designationMasterService.delete(designationMaster);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objResultBean;
	}

}
