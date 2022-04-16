package com.bitutech.uom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/auth/app/uom")
public class UomController {
	@Autowired
	UomService uomService;
	
	@RequestMapping(value="/save")
	public UomResultBean save(@RequestBody UomBean bean) {
		UomResultBean objbean = new UomResultBean();
		try {
			objbean = uomService.save(bean);
		}catch(Exception e){
			e.printStackTrace();
		}
		return objbean;
		
	}
	
	@RequestMapping(value = "/getList")
   	public UomResultBean getUomList() throws Exception {
		UomResultBean objResultBean = new UomResultBean();
		objResultBean.setUomDetails(uomService.getUomList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}

	@RequestMapping(value = "/getUomCategory")
   	public UomResultBean getUomcateList() throws Exception {
		UomResultBean objResultBean = new UomResultBean();
		objResultBean.setUomCategoryList(uomService.getUomcateList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}
	
	@RequestMapping(value = "/update")
	public UomResultBean update(@RequestBody UomBean bean) {
		UomResultBean objResultbean = new UomResultBean();
		try {
			objResultbean = uomService.update(bean);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objResultbean;
	}
	
	@RequestMapping(value = "/edit")
	public UomResultBean edit(@RequestParam("manageUom") Integer manageUom) {
		UomResultBean objResultbean = new UomResultBean();
		try {
			objResultbean = uomService.edit(manageUom);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objResultbean;
	}
	
	@RequestMapping(value = "/delete")
	public UomResultBean delete(@RequestParam("manageUom") Integer manageUom) {
		UomResultBean objResultbean = new UomResultBean();
		try {
			objResultbean = uomService.delete(manageUom);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objResultbean;
	}
}
