package com.bitutech.itemMaster;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ItemMasterServiceImpl implements ItemMasterService {
	
	ItemMasterDao customerMasterDao;

	@Override
	public ItemMasterBean save(ItemMasterBean bean) throws Exception {
		return customerMasterDao.save(bean);
	}

	@Override
	public List<ItemMasterBean> getCustomerList() throws Exception {
		// TODO Auto-generated method stub
		return customerMasterDao.getCustomerList();
	}

	


	
}
