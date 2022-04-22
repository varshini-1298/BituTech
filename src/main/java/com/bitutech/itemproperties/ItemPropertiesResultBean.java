package com.bitutech.itemproperties;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class ItemPropertiesResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<ItemPropertiesBean> itemPropertiesDetails;
	private List<ItemPropertiesBean> propertyTypeList;
	private List<ItemPropertiesBean> dataTypeList;
	
	
	public final List<ItemPropertiesBean> getPropertyTypeList() {
		return propertyTypeList;
	}

	public final void setPropertyTypeList(List<ItemPropertiesBean> propertyTypeList) {
		this.propertyTypeList = propertyTypeList;
	}

	public final List<ItemPropertiesBean> getDataTypeList() {
		return dataTypeList;
	}

	public final void setDataTypeList(List<ItemPropertiesBean> dataTypeList) {
		this.dataTypeList = dataTypeList;
	}

	private ItemPropertiesBean itemPropertiesBean;
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	

	public List<ItemPropertiesBean> getItemPropertiesDetails() {
		return itemPropertiesDetails;
	}

	public void setItemPropertiesDetails(List<ItemPropertiesBean> itemPropertiesDetails) {
		this.itemPropertiesDetails = itemPropertiesDetails;
	}

	public ItemPropertiesBean getItemPropertiesBean() {
		return itemPropertiesBean;
	}

	public void setItemPropertiesBean(ItemPropertiesBean itemPropertiesBean) {
		this.itemPropertiesBean = itemPropertiesBean;
	}

	

	


	
	
}
