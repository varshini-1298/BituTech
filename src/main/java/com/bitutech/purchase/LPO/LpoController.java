package com.bitutech.purchase.LPO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/auth/app/LPO")
public class LpoController {
	@Autowired
	LpoService lpoService;
	
	@RequestMapping(value = "/save")
	public LpoResultBean save(@RequestBody LpoBean bean) {
		LpoResultBean objbean = new LpoResultBean();
		try {
			objbean = lpoService.save(bean);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return objbean;
		
	}
	
	@RequestMapping(value = "/getList")
   	public LpoResultBean getList() throws Exception {
		LpoResultBean objResultBean = new LpoResultBean();
		objResultBean.setLpoDetails(lpoService.getList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}
	
	@RequestMapping(value = "/edit")
	public LpoResultBean edit(@RequestParam("salescallEntry") Integer salescallEntry) {
		LpoResultBean objResultBean = new LpoResultBean();
		try {
			objResultBean = lpoService.edit(salescallEntry);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return objResultBean;
		
	}
	
	@RequestMapping(value = "/update")
	public LpoResultBean update(@RequestBody LpoBean bean) {
		LpoResultBean objbean = new LpoResultBean();
		try {
			objbean = lpoService.update(bean);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return objbean;
		
	}
	
	@RequestMapping(value = "/delete")
	public LpoResultBean delete(@RequestParam("salescallEntry") Integer salescallEntry) {
		LpoResultBean objResultBean = new LpoResultBean();
		try {
			objResultBean = lpoService.delete(salescallEntry);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return objResultBean;
		
	}

	
}
