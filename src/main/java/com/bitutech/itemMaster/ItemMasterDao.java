package com.bitutech.itemMaster;

import java.util.List;

public interface ItemMasterDao {

	ItemMasterResultBean save(ItemMasterBean bean) throws Exception;

	List<ItemMasterBean> getItemList() throws Exception;

	ItemMasterResultBean edit(Integer bean) throws Exception;

	ItemMasterResultBean update(ItemMasterBean bean) throws Exception;

	ItemMasterResultBean delete(Integer bean) throws Exception;

	ItemMasterResultBean getItemIdList() throws Exception;

}
