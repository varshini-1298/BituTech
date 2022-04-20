package com.bitutech.itemMaster;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;


public class ItemMasterResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<ItemMasterBean> itemMasterDetails;
	private ItemMasterBean itemMasterBean;
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<ItemMasterBean> getItemMasterDetails() {
		return itemMasterDetails;
	}

	
	public void setItemMasterDetails(List<ItemMasterBean> itemMasterDetails) {
		this.itemMasterDetails = itemMasterDetails;
	}

	
	
	public ItemMasterBean getItemMasterBean() {
		return itemMasterBean;
	}

	public void setItemMasterBean(ItemMasterBean itemMasterBean) {
		this.itemMasterBean = itemMasterBean;

	}	
	
}
