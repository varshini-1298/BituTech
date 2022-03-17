package com.bitutech.itemMaster;

import java.util.List;

public interface ItemMasterService {

	ItemMasterBean save(ItemMasterBean bean) throws Exception;

	public List<ItemMasterBean> getCustomerList() throws Exception;

}