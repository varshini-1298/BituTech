package com.bitutech.itemproperties;

import java.util.List;

public interface ItemPropertiesService {

	ItemPropertiesResultBean save(ItemPropertiesBean bean) throws Exception;

	public List<ItemPropertiesBean> getItemprotyList() throws Exception;

}