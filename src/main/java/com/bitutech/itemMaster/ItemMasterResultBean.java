package com.bitutech.itemMaster;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class ItemMasterResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<ItemMasterBean> itemMasterDetails;
	
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


	
	
}
