package com.bitutech.gatePass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/app/gatePass")
public class GatePassController {
	@Autowired
	GatePassService gatePassService;
	
	@RequestMapping(value="save")
	public GatePassResultBean save(@RequestBody GatePassBean bean) {
		GatePassResultBean objbean = new GatePassResultBean();
		try {
			objbean = gatePassService.save(bean);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objbean;
	}

}
