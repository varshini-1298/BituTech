package com.bitutech.salescallentry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/salesCallEntry")
public class SalesCallEntryController {
	SalesCallEntryService SalesCallEntryService;
	
	@RequestMapping(value = "/save")
	public SalesCallEntryBean save(SalesCallEntryBean bean) {
		SalesCallEntryBean objbean = new SalesCallEntryBean();
		try {
			objbean = SalesCallEntryService.save(bean);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return bean;
		
	}

}
