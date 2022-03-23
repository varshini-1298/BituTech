package com.bitutech.commodity;

import java.util.List;

public interface CommodityDao {

	CommodityResultBean save(CommodityBean bean) throws Exception;

	List<CommodityBean> getCommodityList() throws Exception;

}
