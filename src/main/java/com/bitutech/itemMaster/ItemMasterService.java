package com.bitutech.itemMaster;

import java.util.List;

public interface ItemMasterService {

	ItemMasterResultBean save(ItemMasterBean bean) throws Exception;

	public List<ItemMasterBean> getItemList() throws Exception;

}