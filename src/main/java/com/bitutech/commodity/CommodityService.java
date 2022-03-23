package com.bitutech.commodity;

import java.util.List;

public interface CommodityService {

	CommodityResultBean save(CommodityBean bean) throws Exception;

	public List<CommodityBean> getCommodityList() throws Exception;

}