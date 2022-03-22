package com.bitutech.designationmaster;

public class DesignationMasterQueryUtil {

	public static final String INSERT_DESIGNATION_MASTER = "Insert into designation (desgn_code,desgn_name,desgn_desc,is_active,created_by,created_dt) values(:desgnCode,:designationName,:remarks,:active,'E0001',now())";
	public static final String getDesignationList = "select desgn_code as territory,desgn_name as name,desgn_desc as zipCode from designation";
	public static final String GETDESGCODE = "select * From fn_generate_reference_no('designation', 'desgn_code', 'DS', '4')";

}
