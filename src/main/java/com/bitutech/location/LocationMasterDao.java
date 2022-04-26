package com.bitutech.location;

import java.util.List;

public interface LocationMasterDao {

	LocationMasterResultBean save(LocationMasterBean bean) throws Exception;

	List<LocationMasterBean> getLocationList() throws Exception;

	LocationMasterResultBean edit(Integer cslLocationCode) throws Exception;

	LocationMasterResultBean update(LocationMasterBean bean) throws Exception;

	LocationMasterResultBean delete(Integer cslLocationCode) throws Exception;

}
