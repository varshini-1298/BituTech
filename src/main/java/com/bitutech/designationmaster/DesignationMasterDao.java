package com.bitutech.designationmaster;

import java.util.List;

public interface DesignationMasterDao {

	DesignationMasterBean save(DesignationMasterBean bean) throws Exception;

	List<DesignationMasterBean> getCustomerList() throws Exception;

}
