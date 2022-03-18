package com.bitutech.location;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationMasterServiceImpl implements LocationMasterService {
	@Autowired
	LocationMasterDao designationMasterDao;

	@Override
	public LocationMasterBean save(LocationMasterBean bean) throws Exception {
		return designationMasterDao.save(bean);
	}

	@Override
	public List<LocationMasterBean> getLocationList() throws Exception {
		// TODO Auto-generated method stub
		return designationMasterDao.getLocationList();
	}

	


	
}
