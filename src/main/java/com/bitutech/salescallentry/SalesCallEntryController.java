package com.bitutech.salescallentry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/auth/app/salesCallEntry")
public class SalesCallEntryController {
	@Autowired
	SalesCallEntryService SalesCallEntryService;
	
	@RequestMapping(value = "/save")
	public SalesCallEntryResultBean save(@RequestBody SalesCallEntryBean bean) {
		SalesCallEntryResultBean objbean = new SalesCallEntryResultBean();
		try {
			objbean = SalesCallEntryService.save(bean);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return objbean;
		
	}
	
	@RequestMapping(value = "/getList")
   	public SalesCallEntryResultBean getList() throws Exception {
		SalesCallEntryResultBean objResultBean = new SalesCallEntryResultBean();
		objResultBean.setSalesCallEntryDetails(SalesCallEntryService.getList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}
	
	@RequestMapping(value = "/edit")
	public SalesCallEntryResultBean edit(@RequestParam("salescallEntry") Integer salescallEntry) {
		SalesCallEntryResultBean objResultBean = new SalesCallEntryResultBean();
		try {
			objResultBean = SalesCallEntryService.edit(salescallEntry);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return objResultBean;
		
	}
	
	@RequestMapping(value = "/update")
	public SalesCallEntryResultBean update(@RequestBody SalesCallEntryBean bean) {
		SalesCallEntryResultBean objbean = new SalesCallEntryResultBean();
		try {
			objbean = SalesCallEntryService.update(bean);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return objbean;
		
	}
	
	@RequestMapping(value = "/delete")
	public SalesCallEntryResultBean delete(@RequestParam("salescallEntry") Integer salescallEntry) {
		SalesCallEntryResultBean objResultBean = new SalesCallEntryResultBean();
		try {
			objResultBean = SalesCallEntryService.delete(salescallEntry);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return objResultBean;
		
	}

	
}
