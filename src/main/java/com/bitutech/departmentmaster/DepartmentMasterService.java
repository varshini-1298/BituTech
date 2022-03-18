package com.bitutech.departmentmaster;

import java.util.List;

public interface DepartmentMasterService {

	DepartmentMasterBean save(DepartmentMasterBean bean) throws Exception;

	public List<DepartmentMasterBean> getCustomerList() throws Exception;

}