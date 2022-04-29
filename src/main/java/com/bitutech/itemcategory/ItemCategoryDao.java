package com.bitutech.itemcategory;

import java.util.List;

public interface ItemCategoryDao {

	ItemCategoryResultBean save(ItemCategoryBean bean) throws Exception;

	List<ItemCategoryBean> getItemCategoryList() throws Exception;

	List<ItemCategoryBean> getCategoryType() throws Exception;

	ItemCategoryResultBean getPropValue(Integer propertyId) throws Exception;

	ItemCategoryResultBean deleteItemCategory(Integer itemCategoryId)throws Exception;

	ItemCategoryResultBean edit(Integer itemCategoryId) throws Exception;

	ItemCategoryResultBean update(ItemCategoryBean bean) throws Exception;

 
}
