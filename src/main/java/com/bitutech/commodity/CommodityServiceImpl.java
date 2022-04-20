package com.bitutech.commodity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommodityServiceImpl implements CommodityService {
	@Autowired
	CommodityDao commodityDao;

	@Override
	public CommodityResultBean save(CommodityBean bean) throws Exception {
		return commodityDao.save(bean);
	}

	@Override
	public List<CommodityBean> getCommodityList() throws Exception {
		// TODO Auto-generated method stub
		return commodityDao.getCommodityList();
	}

	@Override
	public CommodityResultBean edit(String commodityCode) throws Exception {
		// TODO Auto-generated method stub
		return commodityDao.edit(commodityCode);
	}

	@Override
	public CommodityResultBean update(CommodityBean bean) throws Exception {
		// TODO Auto-generated method stub
		return commodityDao.update(bean);
	}

	@Override
	public CommodityResultBean delete(String commodityCode) throws Exception {
		// TODO Auto-generated method stub
		return commodityDao.delete(commodityCode);
	}

	


	
}
