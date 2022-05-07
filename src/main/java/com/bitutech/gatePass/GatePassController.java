package com.bitutech.gatePass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.itemMaster.ItemMasterBean;
import com.bitutech.itemMaster.ItemMasterResultBean;

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
	
	
	@RequestMapping(value="/edit")
	public GatePassResultBean edit(@RequestParam("itemMaster") Integer itemMaster) {
		GatePassResultBean objbean = new GatePassResultBean();
		try {
			objbean = gatePassService.edit(itemMaster);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}
	
	@RequestMapping(value="/update")
	public GatePassResultBean update(@RequestBody GatePassBean itemMaster) {
		GatePassResultBean objResultBean = new GatePassResultBean();
		try {
			objResultBean = gatePassService.update(itemMaster);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objResultBean;
		
	}
	
	@RequestMapping(value="/delete")
	public GatePassResultBean delete(@RequestParam("itemId") Integer itemId) {
		GatePassResultBean objbean = new GatePassResultBean();
		try {
			objbean = gatePassService.delete(itemId);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return objbean;
		
	}

}
