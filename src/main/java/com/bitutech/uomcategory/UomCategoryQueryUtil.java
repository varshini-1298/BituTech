package com.bitutech.uomcategory;

public class UomCategoryQueryUtil {

	public static final String INSERT_UOM_CATEGORY = "INSERT INTO uom_category (uomcategory_code,uomcategory_name,uomcategory_desc,is_active,created_by,created_date) values(:uomCode,:categoryName,:categoryDesp,:active,'E0001',now())";
	public static final String getUomCategoryList = "select uomcategory_code as uomCode,uomcategory_name as categoryName,uomcategory_desc as categoryDesp from uom_category order by modified_date desc";
	public static final String GETUOMODE = "select * From fn_generate_reference_no('uom_category', 'uomcategory_code', 'UOM', '4')";
	public static final String UPDATE_UOM_CATEGORY= "update uom_category set uomcategory_name=:categoryName,uomcategory_desc=:categoryDesp,modified_date=now() where uomcategory_code=:uomCode";
	public static final String DELETE_UOM_CATEGORY =" delete from uom_category where uomcategory_code = ?";
	public static final String SELECT_UOM_CATEGORY = "select uomcategory_code as uomCode, uomcategory_name as categoryName,uomcategory_desc as categoryDesp from uom_category where uomcategory_code=?";

}
