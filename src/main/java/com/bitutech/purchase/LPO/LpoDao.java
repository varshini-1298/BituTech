package com.bitutech.purchase.LPO;

import java.util.List;

public interface LpoDao {

	LpoResultBean save(LpoBean bean) throws Exception;
	
	LpoResultBean edit(Integer bean) throws Exception;

	LpoResultBean update(LpoBean bean) throws Exception;

	LpoResultBean delete(Integer bean) throws Exception;

	List<LpoBean> getList() throws Exception;
}
