package com.bitutech.itemMaster;

import java.util.List;

public interface ItemMasterDao {

	ItemMasterBean save(ItemMasterBean bean) throws Exception;

	List<ItemMasterBean> getItemList() throws Exception;

}
