package com.bitutech.itemproperties;

import java.util.List;

public interface ItemPropertiesDao {

	ItemPropertiesResultBean save(ItemPropertiesBean bean) throws Exception;
	
	ItemPropertiesResultBean edit(Integer bean) throws Exception;

	ItemPropertiesResultBean update(ItemPropertiesBean bean) throws Exception;

	ItemPropertiesResultBean delete(Integer bean) throws Exception;

	List<ItemPropertiesBean> getItemprotyList() throws Exception;

	List<ItemPropertiesBean> getpropertyList() throws Exception;

	List<ItemPropertiesBean> getTypeList() throws Exception;

}
