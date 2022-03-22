package com.bitutech.uom;

import java.util.List;

public interface UomService {

	UomResultBean save(UomBean bean) throws Exception;

	public List<UomBean> getUomList() throws Exception;

}