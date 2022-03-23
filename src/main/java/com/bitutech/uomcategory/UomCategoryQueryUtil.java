package com.bitutech.uomcategory;

public class UomCategoryQueryUtil {

	public static final String INSERT_UOM_CATEGORY = "INSERT INTO uom_category (uomcategory_code,uomcategory_name,uomcategory_desc,is_active,created_date,created_date) values(:uomCode,:categoryName,:categoryDesp,:active,'E0001',now())";
	public static final String getUomCategoryList = "select uomcategory_code as uomCode,uomcategory_name as categoryName,uomcategory_desc as categoryDesp from uom_category";
	public static final String GETUOMODE = "select * From fn_generate_reference_no('uom_category', 'uomcategory_code', 'UOM', '4')";

}
