package com.bitutech.itemproperties;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class ItemPropertiesResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<ItemPropertiesBean> itemPropertyDetails;
	
	private ItemPropertiesBean itemPropertiesBean;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<ItemPropertiesBean> getItemPropertyDetails() {
		return itemPropertyDetails;
	}

	public void setItemPropertyDetails(List<ItemPropertiesBean> itemPropertyDetails) {
		this.itemPropertyDetails = itemPropertyDetails;
	}

	public ItemPropertiesBean getItemPropertiesBean() {
		return itemPropertiesBean;
	}

	public void setItemPropertiesBean(ItemPropertiesBean itemPropertiesBean) {
		this.itemPropertiesBean = itemPropertiesBean;
	}

	

	


	
	
}
