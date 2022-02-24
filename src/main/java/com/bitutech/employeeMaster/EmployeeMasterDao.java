package com.bitutech.employeeMaster;

import java.util.Optional;

import com.bitutech.core.util.CustomException;
import com.bitutech.usermanagement.User;

public interface EmployeeMasterDao {
	public EmployeeMasterResultBean addEmployeeMaster(EmployeeMasterBean objEmployee) throws CustomException;
	
	public Optional<User> getEmployeeUserName(String userName) throws CustomException;
}
