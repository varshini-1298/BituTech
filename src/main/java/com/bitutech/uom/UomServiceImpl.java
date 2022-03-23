package com.bitutech.uom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UomServiceImpl implements UomService {
	@Autowired
	UomDao uomDao;

	@Override
	public UomResultBean save(UomBean bean) throws Exception {
		return uomDao.save(bean);
	}

	@Override
	public List<UomBean> getUomList() throws Exception {
		// TODO Auto-generated method stub
		return uomDao.getUomList();
	}

	@Override
	public List<UomBean> getUomcateList() throws Exception {
		// TODO Auto-generated method stub
		return uomDao.getUomcateList();
	}

	


	
}
