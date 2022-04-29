package com.bitutech.itemcategory;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class ItemCategoryResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<ItemCategoryBean> itemCategoryDetails;
	private List<ItemCategoryBean> categoryTypeList;
	
	private ItemCategoryBean itemCategoryBean;
	
	
	
	public final ItemCategoryBean getItemCategoryBean() {
		return itemCategoryBean;
	}

	public final void setItemCategoryBean(ItemCategoryBean itemCategoryBean) {
		this.itemCategoryBean = itemCategoryBean;
	}

	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<ItemCategoryBean> getItemCategoryDetails() {
		return itemCategoryDetails;
	}

	public void setItemCategoryDetails(List<ItemCategoryBean> itemCategoryDetails) {
		this.itemCategoryDetails = itemCategoryDetails;
	}

	public List<ItemCategoryBean> getCategoryTypeList() {
		return categoryTypeList;
	}

	public void setCategoryTypeList(List<ItemCategoryBean> categoryTypeList) {
		this.categoryTypeList = categoryTypeList;
	}


	

	


	
	
}
