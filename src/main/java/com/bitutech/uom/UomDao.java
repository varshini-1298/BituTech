package com.bitutech.uom;

import java.util.List;

public interface UomDao {

	UomResultBean save(UomBean bean) throws Exception;

	List<UomBean> getUomList() throws Exception;

	List<UomBean> getUomcateList() throws Exception;

}
