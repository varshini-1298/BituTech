package com.bitutech.commodity;

public class CommodityQueryUtil {

	public static final String INSERT_UOM = "INSERT into uom (uom,uom_description,uom_category_code,created_by,created_date) "
			+ " values(:unitMeasure,:description,:uomCategory,'E0001',now())";
	public static final String getUomList = "select uom as unitMeasure,uom_category_code as uomCategory,uom_description as description from uom";

}
