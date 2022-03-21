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

	


	
}
