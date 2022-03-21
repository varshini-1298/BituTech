package com.bitutech.itemMaster;

import java.util.List;

public interface ItemMasterDao {

	ItemMasterResultBean save(ItemMasterBean bean) throws Exception;

	List<ItemMasterBean> getItemList() throws Exception;

}
