package com.bitutech.departmentmaster;

public class DepartmentMasterQueryUtil {

	public static final String INSERT_DEPARTMENT_MASTER = " Insert into department (dept_code,dept_name,dept_head_code,dept_desc,is_active,created_by,created_dt) "
			+ " values (:deptCode,:departmentName,:departmentHead,:remarks,:deptStatus,'E0001',now())";
	public static final String getDepartmentList = "select dept_code as deptCode,dept_name as departmentName,dept_head_code as departmentHead from department";
	public static final String GET_DEPT_CODE = "select * From fn_generate_reference_no('department', 'dept_code', 'DP', '4')";
	
}
