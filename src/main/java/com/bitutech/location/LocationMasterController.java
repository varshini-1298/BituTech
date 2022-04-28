package com.bitutech.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



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
	@RequestMapping(value="/edit")
	public LocationMasterResultBean edit(@RequestParam("locationMaster") Integer cslLocationCode) {
		LocationMasterResultBean objbean = new LocationMasterResultBean();
		try {
			objbean = locationMasterService.edit(cslLocationCode);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}

	@RequestMapping(value="/update")
	public LocationMasterResultBean update(@RequestBody LocationMasterBean bean) {
		LocationMasterResultBean objbean = new LocationMasterResultBean();
		try {
			objbean = locationMasterService.update(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	@GetMapping(value = "/delete")
	public LocationMasterResultBean delete(@RequestParam("cslLocationCode") Integer cslLocationCode) {
		LocationMasterResultBean objbean = new LocationMasterResultBean();
		try {
			objbean = locationMasterService.delete(cslLocationCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return objbean;

	}
	
}
