package com.bitutech.itemproperties;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class ItemPropertiesResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<ItemPropertiesBean> itemPropertyDetails;
	
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

	

	


	
	
}
