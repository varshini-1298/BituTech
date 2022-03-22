package com.bitutech.itemproperties;

import java.util.List;

public interface ItemPropertiesDao {

	ItemPropertiesResultBean save(ItemPropertiesBean bean) throws Exception;

	List<ItemPropertiesBean> getItemprotyList() throws Exception;

}
