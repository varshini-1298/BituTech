package com.bitutech.inventory.deliveryorder;

import java.io.Serializable;
import java.util.List;

import com.bitutech.common.Selectivity;
import com.bitutech.core.util.BasicResultBean;

public class DeliveryOrderResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<DeliveryOrder> deliveryOrderList;	
	
	private DeliveryOrder deliveryOrder;
	
	private List<Selectivity> customerList;
	
	private List<Selectivity> companyList;
	
	private List<Selectivity> locationList;
	
	private List<Selectivity> itemList;
	
	public List<DeliveryOrder> getDeliveryOrderList() {
		return deliveryOrderList;
	}
	public void setDeliveryOrderList(List<DeliveryOrder> deliveryOrderList) {
		this.deliveryOrderList = deliveryOrderList;
	}
	public DeliveryOrder getDeliveryOrder() {
		return deliveryOrder;
	}
	public void setDeliveryOrder(DeliveryOrder deliveryOrder) {
		this.deliveryOrder = deliveryOrder;
	}
	public List<Selectivity> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Selectivity> customerList) {
		this.customerList = customerList;
	}
	public List<Selectivity> getCompanyList() {
		return companyList;
	}
	public void setCompanyList(List<Selectivity> companyList) {
		this.companyList = companyList;
	}
	public List<Selectivity> getLocationList() {
		return locationList;
	}
	public void setLocationList(List<Selectivity> locationList) {
		this.locationList = locationList;
	}
	public List<Selectivity> getItemList() {
		return itemList;
	}
	public void setItemList(List<Selectivity> itemList) {
		this.itemList = itemList;
	}
	
}
