package com.bitutech.designationmaster;

import java.util.List;

public interface DesignationMasterService {

	DesignationMasterResultBean save(DesignationMasterBean bean) throws Exception;

	DesignationMasterResultBean edit(String bean) throws Exception;

	DesignationMasterResultBean update(DesignationMasterBean bean) throws Exception;

	DesignationMasterResultBean delete(String bean) throws Exception;

	public List<DesignationMasterBean> getDesignationList() throws Exception;

}