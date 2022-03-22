package com.bitutech.uomcategory;

import java.util.List;

public interface UomCategoryService {

	UomCategoryResultBean save(UomCategoryBean bean) throws Exception;

	public List<UomCategoryBean> getUomList() throws Exception;

}