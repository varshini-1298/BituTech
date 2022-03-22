package com.bitutech.itemproperties;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemPropertiesServiceImpl implements ItemPropertiesService {
	@Autowired
	ItemPropertiesDao itemPropertiesDao;

	@Override
	public ItemPropertiesResultBean save(ItemPropertiesBean bean) throws Exception {
		return itemPropertiesDao.save(bean);
	}

	@Override
	public List<ItemPropertiesBean> getItemprotyList() throws Exception {
		// TODO Auto-generated method stub
		return itemPropertiesDao.getItemprotyList();
	}

	


	
}
