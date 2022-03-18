package com.bitutech.departmentmaster;

import java.util.List;

public interface DepartmentMasterDao {

	DepartmentMasterBean save(DepartmentMasterBean bean) throws Exception;

	List<DepartmentMasterBean> getDepartmentList() throws Exception;

}
