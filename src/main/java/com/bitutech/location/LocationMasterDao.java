package com.bitutech.location;

import java.util.List;

public interface LocationMasterDao {

	LocationMasterResultBean save(LocationMasterBean bean) throws Exception;

	List<LocationMasterBean> getLocationList() throws Exception;

}
