package com.bitutech.commodity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;

@RestController
@RequestMapping("/api/auth/app/commodity")
public class CommodityController {
	@Autowired
	CommodityService commodityService;
	
	@RequestMapping(value="/save")
	public CommodityResultBean save(@RequestBody CommodityBean bean) {
		CommodityResultBean objbean = new CommodityResultBean();
		try {
			objbean = commodityService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public CommodityResultBean getCommodityList() throws Exception {
		CommodityResultBean objResultBean = new CommodityResultBean();
		objResultBean.setCommodityListDetails(commodityService.getCommodityList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}

}
