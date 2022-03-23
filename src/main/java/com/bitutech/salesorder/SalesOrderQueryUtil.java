package com.bitutech.salesorder;

public class SalesOrderQueryUtil {

	public static final String INSERT_SALES_ORDER = "INSERT into uom (uom,uom_description,uom_category_code,created_by,created_date) "
			+ " values(:unitMeasure,:description,:uomCategory,'E0001',now())";
	public static final String getSalesOrderList = "select uom as unitMeasure,uom_category_code as uomCategory,uom_description as description from uom";
	public static final String getUomcategoryList = "select uomcategory_code as id,uomcategory_name as text from uom_category";

}
