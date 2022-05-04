package com.bitutech.designationmaster;

public class DesignationMasterQueryUtil {

	public static final String INSERT_DESIGNATION_MASTER = "Insert into designation (desgn_code,desgn_name,desgn_desc,is_active,created_by,created_dt) values(:desgnCode,:designationName,:remarks,:active,'E0001',now())";
	public static final String getDesignationList = "select desgn_code as desgnCode,desgn_name as designationName,desgn_desc as remarks from designation";
	public static final String GETDESGCODE = "select * From fn_generate_reference_no('designation', 'desgn_code', 'DS', '4')";
	public static final String SELECT_DESIGNATION_MASTER = "select desgn_code as desgnCode,desgn_name as designationName,desgn_desc as remarks,is_active as active from designation where desgn_code=?";
	public static final String UPDATE_DESIGNATION_MASTER = "update designation set desgn_name=:designationName,desgn_desc=:remarks,is_active=:active,modified_dt=now() where desgn_code=:desgnCode";
	public static final String DELETE_DESIGNATION_MASTER = "delete from designation where desgn_code=?";

}
