package com.bitutech.itemcategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;
import com.bitutech.countrymaster.CountryMasterResultBean;
import com.bitutech.itemproperties.ItemPropertiesResultBean;
import com.bitutech.uomcategory.UomCategoryResultBean;

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
	
	
	@RequestMapping(value="/update")
	public ItemCategoryResultBean update(@RequestBody ItemCategoryBean bean) {
		ItemCategoryResultBean objbean = new ItemCategoryResultBean();
		try {
			objbean = itemCategoryService.update(bean);
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
	
		@GetMapping(value = "/getproperValue")
		public ItemCategoryResultBean getPropValue(@RequestParam("propertyId") Integer propertyId) {
			ItemCategoryResultBean objResultBean = new ItemCategoryResultBean();
			try {
				objResultBean = itemCategoryService.getPropValue(propertyId);
								
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return objResultBean;
		}

	@RequestMapping(value = "/getCategoryType")
   	public ItemCategoryResultBean getCategoryType() throws Exception {
		ItemCategoryResultBean objResultBean = new ItemCategoryResultBean();
		objResultBean.setCategoryTypeList(itemCategoryService.getCategoryType());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}
	
	@RequestMapping("/delete")
	public ItemCategoryResultBean deleteItemCategory(@RequestParam("itemCategory") Integer itemCategoryId) throws Exception {
		ItemCategoryResultBean objResultBean = new ItemCategoryResultBean();
		try {
			objResultBean = itemCategoryService.deleteItemCategory(itemCategoryId);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return objResultBean;
	}
	
	@GetMapping(value="edit")
	public ItemCategoryResultBean edit(@RequestParam("itemCategory") Integer itemCategoryId) {
		ItemCategoryResultBean objResultBean = new ItemCategoryResultBean();
		try {
			objResultBean = itemCategoryService.edit(itemCategoryId);
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return objResultBean;
	}
}
