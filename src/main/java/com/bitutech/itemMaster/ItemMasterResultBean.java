package com.bitutech.itemMaster;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;
import com.bitutech.core.util.DropDownList;


public class ItemMasterResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<DropDownList> itemIdList;
	
	public boolean Success;
	
	private List<ItemMasterBean> itemMasterDetails;
	private List<ItemMasterDetailBean> ItemMasterDetailBean;
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

	public List<DropDownList> getItemIdList() {
		return itemIdList;
	}


	public void setItemIdList(List<DropDownList> itemIdList) {
		this.itemIdList = itemIdList;
	}

	public List<ItemMasterDetailBean> getItemMasterDetailBean() {
		return ItemMasterDetailBean;
	}

	public void setItemMasterDetailBean(List<ItemMasterDetailBean> itemMasterDetailBean) {
		ItemMasterDetailBean = itemMasterDetailBean;
	}

//	public void setGrmBean(ItemMasterBean queryForObject) {
//		// TODO Auto-generated method stub
		
	//}
	public ItemMasterBean getGrmBean() {
		return itemMasterBean;
	}

	public void setGrmBean(ItemMasterBean itemMasterBean) {
		this.itemMasterBean = itemMasterBean;

	}	
}
