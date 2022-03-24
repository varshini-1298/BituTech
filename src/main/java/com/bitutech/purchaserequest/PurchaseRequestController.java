package com.bitutech.purchaserequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;
import com.bitutech.countrymaster.CountryMasterResultBean;

@RestController
@RequestMapping("/api/auth/app/purchaseRequest")
public class PurchaseRequestController {
	@Autowired
	PurchaseRequestService purchaseRequestService;
	
	@RequestMapping(value="/save")
	public PurchaseRequestResultBean save(@RequestBody PurchaseRequestBean bean) {
		PurchaseRequestResultBean objbean = new PurchaseRequestResultBean();
		try {
			objbean = purchaseRequestService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public PurchaseRequestResultBean getPurchaseRequestList() throws Exception {
		PurchaseRequestResultBean objResultBean = new PurchaseRequestResultBean();
		objResultBean.setPurchaseRequestDetails(purchaseRequestService.getPurchaseRequestList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}

	@RequestMapping(value = "/getUomCategory")
   	public PurchaseRequestResultBean getUomcateList() throws Exception {
		PurchaseRequestResultBean objResultBean = new PurchaseRequestResultBean();
		objResultBean.setUomCategoryList(purchaseRequestService.getUomcateList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}
}
