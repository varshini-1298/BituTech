package com.bitutech.gatePass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GatePassServiceImpl implements GatePassService {
	@Autowired
	GatePassDao gatePassDao;
	
	@Override
	public GatePassResultBean save(GatePassBean bean) throws Exception {
		return gatePassDao.save(bean);
	}

	@Override
	public List<GatePassBean> getOrganizationList() throws Exception {
		return gatePassDao.getOrganizationList();
	}

	@Override
	public List<GatePassBean> getLocationList() throws Exception {
		return gatePassDao.getLocationList();
	}
	
	

}
