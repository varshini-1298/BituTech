package com.bitutech.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;

@RestController
@RequestMapping("/api/auth/app/locationMaster")
public class LocationMasterController {
	@Autowired
	LocationMasterService locationMasterService;
	
	@RequestMapping(value="/save")
	public LocationMasterResultBean save(@RequestBody LocationMasterBean bean) {
		LocationMasterResultBean objbean = new LocationMasterResultBean();
		try {
			objbean = locationMasterService.save(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	
	@RequestMapping(value = "/getList")
   	public LocationMasterResultBean getLocationList() throws Exception {
		LocationMasterResultBean objResultBean = new LocationMasterResultBean();
		objResultBean.setLocationMasterDetails(locationMasterService.getLocationList());
		objResultBean.setSuccess(true);
   		return objResultBean;
   	}

}
