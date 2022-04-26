package com.bitutech.location;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationMasterServiceImpl implements LocationMasterService {
	@Autowired
	LocationMasterDao locationMasterDao;

	@Override
	public LocationMasterResultBean save(LocationMasterBean bean) throws Exception {
		return locationMasterDao.save(bean);
	}

	@Override
	public List<LocationMasterBean> getLocationList() throws Exception {
		// TODO Auto-generated method stub
		return locationMasterDao.getLocationList();
	}

	@Override
	public LocationMasterResultBean delete(Integer cslLocationCode) throws Exception{
		// TODO Auto-generated method stub
		return locationMasterDao.delete(cslLocationCode);
	}

	@Override
	public LocationMasterResultBean update(LocationMasterBean bean) throws Exception {
		// TODO Auto-generated method stub
		return locationMasterDao.update(bean);
	}

	@Override
	public LocationMasterResultBean edit(Integer cslLocationCode) throws Exception {
		// TODO Auto-generated method stub
		return locationMasterDao.edit(cslLocationCode);
	}

	


	
}
