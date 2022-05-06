package com.bitutech.purchase.LPO;

import java.util.List;

public interface LpoService {

	LpoResultBean save(LpoBean bean) throws Exception;
	
	LpoResultBean edit(Integer salescallEntry) throws Exception;

	LpoResultBean update(LpoBean bean) throws Exception;

	LpoResultBean delete(Integer bean) throws Exception;

	public List<LpoBean> getList() throws Exception;
}
