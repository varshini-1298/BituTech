package com.bitutech.uomcategory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UomCategoryServiceImpl implements UomCategoryService {
	@Autowired
	UomCategoryDao uomCategoryDao;

	@Override
	public UomCategoryResultBean save(UomCategoryBean bean) throws Exception {
		return uomCategoryDao.save(bean);
	}

	@Override
	public List<UomCategoryBean> getUomList() throws Exception {
		// TODO Auto-generated method stub
		return uomCategoryDao.getUomList();
	}

	


	
}
