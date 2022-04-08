package com.bitutech.departmentmaster;

import java.util.List;

public interface DepartmentMasterService {

	DepartmentMasterResultBean save(DepartmentMasterBean bean) throws Exception;

	DepartmentMasterResultBean edit(String bean) throws Exception;

	DepartmentMasterResultBean update(DepartmentMasterBean bean) throws Exception;

	DepartmentMasterResultBean delete(String bean) throws Exception;

	public List<DepartmentMasterBean> getDepartmentList() throws Exception;

}