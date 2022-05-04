package com.bitutech.commodity;

import java.util.List;


public interface CommodityService {

	CommodityResultBean save(CommodityBean bean) throws Exception;

	public List<CommodityBean> getCommodityList() throws Exception;

	CommodityResultBean edit(String commodityCode) throws Exception;

	CommodityResultBean update(CommodityBean bean) throws Exception;

	CommodityResultBean delete(String commodityCode) throws Exception;
	public List<CommodityBean> getClassificationNameList() throws Exception;

}