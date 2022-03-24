package com.bitutech.itemcategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;
import com.bitutech.countrymaster.CountryMasterResultBean;

@RestController
@RequestMapping("/api/auth/app/itemCategory")
public class ItemCategoryController {
	@Autowired
	ItemCategoryService itemCategoryService;
	
	@RequestMapping(value="/save")
	public ItemCategoryResultBean save(@RequestBody ItemCategoryBean bean) {
		ItemCategoryResultBean objbean = new ItemCategoryResultBean();
		try {
			objbean = itemCategoryService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public ItemCategoryResultBean getItemCategoryList() throws Exception {
		ItemCategoryResultBean objResultBean = new ItemCategoryResultBean();
		objResultBean.setItemCategoryDetails(itemCategoryService.getItemCategoryList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}

	@RequestMapping(value = "/getUomCategory")
   	public ItemCategoryResultBean getUomcateList() throws Exception {
		ItemCategoryResultBean objResultBean = new ItemCategoryResultBean();
		objResultBean.setUomCategoryList(itemCategoryService.getUomcateList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}
}
