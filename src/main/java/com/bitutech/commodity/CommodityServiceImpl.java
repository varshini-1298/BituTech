package com.bitutech.commodity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommodityServiceImpl implements CommodityService {
	@Autowired
	CommodityDao uomDao;

	@Override
	public CommodityResultBean save(CommodityBean bean) throws Exception {
		return uomDao.save(bean);
	}

	@Override
	public List<CommodityBean> getCommodityList() throws Exception {
		// TODO Auto-generated method stub
		return uomDao.getCommodityList();
	}

	


	
}
