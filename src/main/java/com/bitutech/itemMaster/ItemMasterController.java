package com.bitutech.itemMaster;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;

@RestController
@RequestMapping("/api/auth/app/itemMaster")
public class ItemMasterController {
	ItemMasterService itemMasterService;
	
	@RequestMapping(value="/save")
	public ItemMasterBean save(@RequestBody ItemMasterBean bean) {
		ItemMasterBean objbean = new ItemMasterBean();
		try {
			objbean = itemMasterService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public ItemMasterResultBean getCustomerList() throws Exception {
		ItemMasterResultBean objResultBean = new ItemMasterResultBean();
		objResultBean.setItemMasterDetails(itemMasterService.getCustomerList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}

}
