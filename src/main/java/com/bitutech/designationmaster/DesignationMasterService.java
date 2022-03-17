package com.bitutech.designationmaster;

import java.util.List;

public interface DesignationMasterService {

	DesignationMasterBean save(DesignationMasterBean bean) throws Exception;

	public List<DesignationMasterBean> getCustomerList() throws Exception;

}