package com.bitutech.itemcategory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemCategoryServiceImpl implements ItemCategoryService {
	@Autowired
	ItemCategoryDao itemCategoryDao;

	@Override
	public ItemCategoryResultBean save(ItemCategoryBean bean) throws Exception {
		return itemCategoryDao.save(bean);
	}

	@Override
	public List<ItemCategoryBean> getItemCategoryList() throws Exception {
		// TODO Auto-generated method stub
		return itemCategoryDao.getItemCategoryList();
	}

	@Override
	public List<ItemCategoryBean> getUomcateList() throws Exception {
		// TODO Auto-generated method stub
		return itemCategoryDao.getUomcateList();
	}

	@Override
	public ItemCategoryResultBean getPropValue(Integer propertyId) throws Exception {
		// TODO Auto-generated method stub
		return itemCategoryDao.getPropValue(propertyId);
	}

	


	
}
