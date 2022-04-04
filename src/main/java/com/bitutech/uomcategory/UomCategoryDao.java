package com.bitutech.uomcategory;

import java.util.List;

public interface UomCategoryDao {

	UomCategoryResultBean save(UomCategoryBean bean) throws Exception;

	UomCategoryResultBean update(UomCategoryBean bean) throws Exception;

	UomCategoryResultBean delete(String bean) throws Exception;

	UomCategoryResultBean getCode(String token) throws Exception;

	List<UomCategoryBean> getUomList() throws Exception;

}
