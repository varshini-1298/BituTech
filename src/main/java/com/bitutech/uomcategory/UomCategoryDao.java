package com.bitutech.uomcategory;

import java.util.List;

public interface UomCategoryDao {

	UomCategoryResultBean save(UomCategoryBean bean) throws Exception;

	List<UomCategoryBean> getUomList() throws Exception;

}
