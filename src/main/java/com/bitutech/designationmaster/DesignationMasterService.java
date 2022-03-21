package com.bitutech.designationmaster;

import java.util.List;

public interface DesignationMasterService {

	DesignationMasterResultBean save(DesignationMasterBean bean) throws Exception;

	public List<DesignationMasterBean> getDesignationList() throws Exception;

}