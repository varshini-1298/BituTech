package com.bitutech.itemproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;

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

}
