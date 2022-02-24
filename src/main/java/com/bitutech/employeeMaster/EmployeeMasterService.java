package com.bitutech.employeeMaster;

import java.util.Optional;

import com.bitutech.usermanagement.User;

public interface EmployeeMasterService {

	EmployeeMasterResultBean addEmployeeMaster(EmployeeMasterBean employeeMasterBean) throws Exception;
	
	Optional<User> getEmployeeUserName(String userName) throws Exception;
}
