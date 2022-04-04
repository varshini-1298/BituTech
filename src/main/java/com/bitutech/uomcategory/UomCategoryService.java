package com.bitutech.uomcategory;

import java.util.List;


public interface UomCategoryService {

	UomCategoryResultBean save(UomCategoryBean bean) throws Exception;

	UomCategoryResultBean update(UomCategoryBean bean) throws Exception;
	
	UomCategoryResultBean edit(UomCategoryBean bean) throws Exception;
	
	UomCategoryResultBean getCode(String token) throws Exception;

	public List<UomCategoryBean> getUomList() throws Exception;

}