package com.bitutech.itemMaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/auth/app/itemMaster")
public class ItemMasterController {
	
	@Autowired
	ItemMasterService itemMasterService;
	
	@RequestMapping(value="/save")
	public ItemMasterResultBean save(@RequestBody ItemMasterBean bean) {
		ItemMasterResultBean objbean = new ItemMasterResultBean();
		try {
			objbean = itemMasterService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public ItemMasterResultBean getItemList() throws Exception {
		ItemMasterResultBean objbean = new ItemMasterResultBean();
		objbean.setItemMasterDetails(itemMasterService.getItemList());
		objbean.setSuccess(true);
   		return objbean;
   	}
	@RequestMapping(value="/edit")
	public ItemMasterResultBean edit(@RequestParam("itemMaster") Integer itemMaster) {
		ItemMasterResultBean objbean = new ItemMasterResultBean();
		try {
			objbean = itemMasterService.edit(itemMaster);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	@RequestMapping(value="/update")
	public ItemMasterResultBean update(@RequestBody ItemMasterBean itemMaster) {
		ItemMasterResultBean objResultBean = new ItemMasterResultBean();
		try {
			objResultBean = itemMasterService.update(itemMaster);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objResultBean;
		
	}
	
	@RequestMapping(value="/delete")
	public ItemMasterResultBean delete(@RequestParam("itemId") Integer itemId) {
		ItemMasterResultBean objbean = new ItemMasterResultBean();
		try {
			objbean = itemMasterService.delete(itemId);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}

}
