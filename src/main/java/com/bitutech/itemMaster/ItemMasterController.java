package com.bitutech.itemMaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;

@RestController
@RequestMapping("/api/auth/app/itemMaster")
public class ItemMasterController {
	
	@Autowired
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
   	public ItemMasterResultBean getItemList() throws Exception {
		ItemMasterResultBean objResultBean = new ItemMasterResultBean();
		objResultBean.setItemMasterDetails(itemMasterService.getItemList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}

}
