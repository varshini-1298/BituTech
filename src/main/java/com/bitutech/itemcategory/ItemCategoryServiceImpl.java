package com.bitutech.itemcategory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemCategoryServiceImpl implements ItemCategoryService {
	@Autowired
	ItemCategoryDao uomDao;

	@Override
	public ItemCategoryResultBean save(ItemCategoryBean bean) throws Exception {
		return uomDao.save(bean);
	}

	@Override
	public List<ItemCategoryBean> getItemCategoryList() throws Exception {
		// TODO Auto-generated method stub
		return uomDao.getItemCategoryList();
	}

	@Override
	public List<ItemCategoryBean> getUomcateList() throws Exception {
		// TODO Auto-generated method stub
		return uomDao.getUomcateList();
	}

	


	
}
