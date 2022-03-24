package com.bitutech.purchasequote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;
import com.bitutech.countrymaster.CountryMasterResultBean;

@RestController
@RequestMapping("/api/auth/app/purchaseQuote")
public class PurchaseQuoteController {
	@Autowired
	PurchaseQuoteService purchaseQuoteService;
	
	@RequestMapping(value="/save")
	public PurchaseQuoteResultBean save(@RequestBody PurchaseQuoteBean bean) {
		PurchaseQuoteResultBean objbean = new PurchaseQuoteResultBean();
		try {
			objbean = purchaseQuoteService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public PurchaseQuoteResultBean getPurchaseQuoteList() throws Exception {
		PurchaseQuoteResultBean objResultBean = new PurchaseQuoteResultBean();
		objResultBean.setPurchaseQuoteDetails(purchaseQuoteService.getPurchaseQuoteList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}

	@RequestMapping(value = "/getUomCategory")
   	public PurchaseQuoteResultBean getUomcateList() throws Exception {
		PurchaseQuoteResultBean objResultBean = new PurchaseQuoteResultBean();
		objResultBean.setUomCategoryList(purchaseQuoteService.getUomcateList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}
}
