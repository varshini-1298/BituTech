package com.bitutech.uomcategory;

import java.util.List;

public interface UomCategoryDao {

	//Save
	UomCategoryResultBean save(UomCategoryBean bean) throws Exception;

	//Update
	UomCategoryResultBean update(UomCategoryBean bean) throws Exception;

	//Delete
	UomCategoryResultBean delete(String bean) throws Exception;

	// Edit
	UomCategoryResultBean getCode(String token) throws Exception;

	//List
	List<UomCategoryBean> getUomList() throws Exception;

}
