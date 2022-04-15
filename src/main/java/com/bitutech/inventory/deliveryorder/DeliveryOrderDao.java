package com.bitutech.inventory.deliveryorder;

public interface DeliveryOrderDao {

public DeliveryOrderResultBean getDeliveryOrderList() throws Exception;
	
	DeliveryOrderResultBean saveOrUpdateDO(DeliveryOrder bean) throws Exception;
	
	public DeliveryOrderResultBean editDO(String doNumber) throws Exception;
	
	DeliveryOrderResultBean deleteDO(String doNumber, String userId) throws Exception;
	
	public DeliveryOrderResultBean getCompanyList();
	
	public DeliveryOrderResultBean getCustomerList();
	
	public DeliveryOrderResultBean getLocationList();
	
	public DeliveryOrderResultBean getItemList();

}
