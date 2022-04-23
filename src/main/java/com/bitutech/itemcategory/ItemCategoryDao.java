package com.bitutech.itemcategory;

import java.util.List;

public interface ItemCategoryDao {

	ItemCategoryResultBean save(ItemCategoryBean bean) throws Exception;

	List<ItemCategoryBean> getItemCategoryList() throws Exception;

	List<ItemCategoryBean> getUomcateList() throws Exception;

	ItemCategoryResultBean getPropValue(Integer propertyId) throws Exception;

}
