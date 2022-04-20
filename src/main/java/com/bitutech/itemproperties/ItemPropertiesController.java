package com.bitutech.itemproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/auth/app/itemProperty")
public class ItemPropertiesController {
	@Autowired
	ItemPropertiesService itemPropertiesService;
	
	@RequestMapping(value="/save")
	public ItemPropertiesResultBean save(@RequestBody ItemPropertiesBean bean) {
		ItemPropertiesResultBean objbean = new ItemPropertiesResultBean();
		try {
			objbean = itemPropertiesService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public ItemPropertiesResultBean getItemprotyList() throws Exception {
		ItemPropertiesResultBean objResultBean = new ItemPropertiesResultBean();
		objResultBean.setItemPropertyDetails(itemPropertiesService.getItemprotyList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}
	
	@GetMapping(value="edit")
	public ItemPropertiesResultBean edit(@RequestParam("itemProperties") Integer itemProperties) {
		ItemPropertiesResultBean objResultBean = new ItemPropertiesResultBean();
		try {
			objResultBean = itemPropertiesService.edit(itemProperties);
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return objResultBean;
	}
	
	@RequestMapping(value = "/update")
	public ItemPropertiesResultBean update(@RequestBody ItemPropertiesBean bean) {
		ItemPropertiesResultBean objResultBean = new ItemPropertiesResultBean();
		try {
			objResultBean = itemPropertiesService.update(bean);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objResultBean;
	}
	
	@RequestMapping(value = "/delete")
	public ItemPropertiesResultBean delete(@RequestParam("itemProperties") Integer itemProperties) {
		ItemPropertiesResultBean objResultBean = new ItemPropertiesResultBean();
		try {
			objResultBean = itemPropertiesService.delete(itemProperties);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return objResultBean;
	}
	
	

}
