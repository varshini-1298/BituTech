package com.bitutech.uomcategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/auth/app/uomCategory")
public class UomCategoryController {
	@Autowired
	UomCategoryService uomCategoryService;
	
	@RequestMapping(value="/save")
	public UomCategoryResultBean save(@RequestBody UomCategoryBean bean) {
		UomCategoryResultBean objbean = new UomCategoryResultBean();
		try {
			objbean = uomCategoryService.save(bean);
		}catch(Exception e){
			e.printStackTrace();
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public UomCategoryResultBean getUomList() throws Exception {
		UomCategoryResultBean objResultBean = new UomCategoryResultBean();
		objResultBean.setUomCategoryDetails(uomCategoryService.getUomList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}
	
	@GetMapping(value = "/getCode")
	public UomCategoryResultBean getCode(@RequestParam("uomCategory") String uomCategory) {
		UomCategoryResultBean objResultBean = new UomCategoryResultBean();
		try {
			objResultBean = uomCategoryService.getCode(uomCategory);
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return objResultBean;
	}
	
	@RequestMapping(value = "/edit")
	public UomCategoryResultBean edit(@RequestBody UomCategoryBean bean) {
		UomCategoryResultBean objResultBean = new UomCategoryResultBean();
		try {
			objResultBean = uomCategoryService.edit(bean);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return objResultBean;
	}
	
	@RequestMapping(value = "/update")
	public UomCategoryResultBean update(@RequestBody UomCategoryBean bean) {
		UomCategoryResultBean objResultBean = new UomCategoryResultBean();
		try {
			objResultBean = uomCategoryService.update(bean);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objResultBean;
	}

}
