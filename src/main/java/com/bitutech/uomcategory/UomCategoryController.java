package com.bitutech.uomcategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;

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

}
