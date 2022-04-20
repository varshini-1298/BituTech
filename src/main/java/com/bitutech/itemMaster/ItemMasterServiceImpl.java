package com.bitutech.itemMaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ItemMasterServiceImpl implements ItemMasterService {
	@Autowired
	ItemMasterDao itemMasterDao;

	@Override
	public ItemMasterResultBean save(ItemMasterBean bean) throws Exception {
		return itemMasterDao.save(bean);
	}

	@Override
	public List<ItemMasterBean> getItemList() throws Exception {
		// TODO Auto-generated method stub
		return itemMasterDao.getItemList();
	}

	
	
	@Override
	public ItemMasterResultBean edit(Integer bean) throws Exception {
		// TODO Auto-generated method stub
		return itemMasterDao.edit(bean);
	}

	@Override
	public ItemMasterResultBean update(ItemMasterBean bean) throws Exception {
		// TODO Auto-generated method stub
		return itemMasterDao.update(bean);
	}

	@Override
	public ItemMasterResultBean delete(Integer bean) throws Exception {
		// TODO Auto-generated method stub
		return itemMasterDao.delete(bean);
	}


	
}
