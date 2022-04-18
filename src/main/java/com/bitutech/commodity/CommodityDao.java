package com.bitutech.commodity;

import java.util.List;

public interface CommodityDao {

	CommodityResultBean save(CommodityBean bean) throws Exception;

	List<CommodityBean> getCommodityList() throws Exception;

	CommodityResultBean edit(String commodityCode) throws Exception;

	CommodityResultBean update(CommodityBean bean) throws Exception;

	CommodityResultBean delete(String commodityCode) throws Exception;

}
