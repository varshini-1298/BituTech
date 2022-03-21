package com.bitutech.designationmaster;

import java.util.List;

public interface DesignationMasterDao {

	DesignationMasterResultBean save(DesignationMasterBean bean) throws Exception;

	List<DesignationMasterBean> getDesignationList() throws Exception;

}
