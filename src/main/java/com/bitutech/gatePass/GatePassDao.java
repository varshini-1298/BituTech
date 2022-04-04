package com.bitutech.gatePass;

import java.util.List;

public interface GatePassDao {
	
	GatePassResultBean save(GatePassBean bean) throws Exception;
	
	List<GatePassBean> getOrganizationList() throws Exception;
	
	List<GatePassBean> getLocationList() throws Exception;

}
