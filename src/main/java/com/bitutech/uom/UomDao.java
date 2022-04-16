package com.bitutech.uom;

import java.util.List;

public interface UomDao {

	UomResultBean save(UomBean bean) throws Exception;
	
	UomResultBean update(UomBean bean) throws Exception;
	
	UomResultBean edit(Integer bean) throws Exception;

	UomResultBean delete(Integer bean) throws Exception;

	List<UomBean> getUomList() throws Exception;

	List<UomBean> getUomcateList() throws Exception;

}
