package com.bitutech.itemMaster;

import java.util.List;

public interface ItemMasterService {

	ItemMasterResultBean save(ItemMasterBean bean) throws Exception;

	public List<ItemMasterBean> getItemList() throws Exception;

	ItemMasterResultBean delete(Integer bean) throws Exception;

	ItemMasterResultBean update(ItemMasterBean bean) throws Exception;

	ItemMasterResultBean edit(Integer bean) throws Exception;

}