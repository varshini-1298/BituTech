package com.bitutech.designationmaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;

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

}
