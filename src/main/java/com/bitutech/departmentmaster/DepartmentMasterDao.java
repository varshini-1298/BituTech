package com.bitutech.departmentmaster;

import java.util.List;

public interface DepartmentMasterDao {

	DepartmentMasterResultBean save(DepartmentMasterBean bean) throws Exception;

	List<DepartmentMasterBean> getDepartmentList() throws Exception;

}
