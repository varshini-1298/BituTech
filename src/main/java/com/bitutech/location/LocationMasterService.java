package com.bitutech.location;

import java.util.List;

public interface LocationMasterService {

	LocationMasterResultBean save(LocationMasterBean bean) throws Exception;

	public List<LocationMasterBean> getLocationList() throws Exception;

}