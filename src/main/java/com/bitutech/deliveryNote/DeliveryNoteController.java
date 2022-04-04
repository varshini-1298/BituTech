package com.bitutech.deliveryNote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/app/deliveryNote")
public class DeliveryNoteController {
	@Autowired
	DeliveryNoteService deliveryNoteService;
	
	@RequestMapping(value="/save")
	public DeliveryNoteResultBean save (@RequestBody DeliveryNoteBean bean) {
		DeliveryNoteResultBean objbean = new DeliveryNoteResultBean();
		try {
			objbean = deliveryNoteService.save(bean);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objbean;
	}

}
