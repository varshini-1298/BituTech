package com.bitutech.itemcategory;

import java.util.List;

public interface ItemCategoryService {

	ItemCategoryResultBean save(ItemCategoryBean bean) throws Exception;

	public List<ItemCategoryBean> getItemCategoryList() throws Exception;

	public List<ItemCategoryBean> getUomcateList() throws Exception;

}