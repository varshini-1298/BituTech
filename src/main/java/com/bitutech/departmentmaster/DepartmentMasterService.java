package com.bitutech.departmentmaster;

import java.util.List;

public interface DepartmentMasterService {

	DepartmentMasterResultBean save(DepartmentMasterBean bean) throws Exception;

	public List<DepartmentMasterBean> getDepartmentList() throws Exception;

}