package com.bitutech.salescallentry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/auth/app/salesCallEntry")
public class SalesCallEntryController {
	@Autowired
	SalesCallEntryService SalesCallEntryService;
	
	@RequestMapping(value = "/save")
	public SalesCallEntryResultBean save(SalesCallEntryBean bean) {
		SalesCallEntryResultBean objbean = new SalesCallEntryResultBean();
		try {
			objbean = SalesCallEntryService.save(bean);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return objbean;
		
	}
	
	@RequestMapping(value = "/getList")
   	public SalesCallEntryResultBean getDesignationList() throws Exception {
		SalesCallEntryResultBean objResultBean = new SalesCallEntryResultBean();
		objResultBean.setSalesCallEntryDetails(SalesCallEntryService.getList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}
}
