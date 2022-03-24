package com.bitutech.salesquote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;
import com.bitutech.countrymaster.CountryMasterResultBean;

@RestController
@RequestMapping("/api/auth/app/saleQuote")
public class SalesQuoteController {
	@Autowired
	SalesQuoteService salesQuoteService;
	
	@RequestMapping(value="/save")
	public SalesQuoteResultBean save(@RequestBody SalesQuoteBean bean) {
		SalesQuoteResultBean objbean = new SalesQuoteResultBean();
		try {
			objbean = salesQuoteService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public SalesQuoteResultBean getSalesQuoteList() throws Exception {
		SalesQuoteResultBean objResultBean = new SalesQuoteResultBean();
		objResultBean.setSalesQuoteList(salesQuoteService.getSalesQuoteList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}

	//drop down method
	@RequestMapping(value = "/getUomCategory")
   	public SalesQuoteResultBean getUomcateList() throws Exception {
		SalesQuoteResultBean objResultBean = new SalesQuoteResultBean();
		objResultBean.setSalesQuoteList(salesQuoteService.getUomcateList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}
}
