package com.bitutech.inventory.deliveryorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/app/inventory/deliveryorder")
public class DeliveryOrderController {
	
	@Autowired
	DeliveryOrderService deliveryOrderService;
	
	@RequestMapping(value = "/getList")
   	public DeliveryOrderResultBean getDoList() {
		DeliveryOrderResultBean rb = null;;
		try {
			rb = deliveryOrderService.getDeliveryOrderList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   		return rb;
   	}

	@RequestMapping(value="/saveorupdate")
	public DeliveryOrderResultBean saveOrUpdateDO(@RequestBody DeliveryOrder bean) {
		DeliveryOrderResultBean rb = null;
		try {
			rb = deliveryOrderService.saveOrUpdateDO(bean);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return rb;
	}
	
	@RequestMapping(value = "/edit")
   	public DeliveryOrderResultBean editDO(@RequestBody String doNumber) {
		DeliveryOrderResultBean rb = null;
		try {
			rb = deliveryOrderService.editDO(doNumber);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   		return rb;
   	}
	
	@RequestMapping(value = "/delete")
   	public DeliveryOrderResultBean deleteDO(@RequestBody String doNumber) {
		DeliveryOrderResultBean rb = null;
		try {
			rb = deliveryOrderService.deleteDO(doNumber, "");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   		return rb;
   	}
	
	@RequestMapping(value = "/getCompanyList")
   	public DeliveryOrderResultBean getCompanyList() {
		DeliveryOrderResultBean rb = null;;
		try {
			rb = deliveryOrderService.getCompanyList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   		return rb;
   	}
	
	@RequestMapping(value = "/getCustomerList")
   	public DeliveryOrderResultBean getCustomerList() {
		DeliveryOrderResultBean rb = null;;
		try {
			rb = deliveryOrderService.getCustomerList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   		return rb;
   	}
	
	@RequestMapping(value = "/getItemList")
   	public DeliveryOrderResultBean getItemList() {
		DeliveryOrderResultBean rb = null;;
		try {
			rb = deliveryOrderService.getItemList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   		return rb;
   	}
	
	@RequestMapping(value = "/getLocationList")
   	public DeliveryOrderResultBean getLocationList() {
		DeliveryOrderResultBean rb = null;;
		try {
			rb = deliveryOrderService.getCompanyList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   		return rb;
   	}

}
