package com.bitutech.commodity;

public class CommodityQueryUtil {

	public static final String INSERT_UOM = "INSERT into commodity (commodity_code,commodity,comm_classification_code,unno,flash_point,imdg_code_page,hs_code,bl_clause,imdg_class_code,created_by,created_dt) "
			+ " values(:commodityCode,:commodity,:classification,:unNo,:flashPoint,:imdgcodePage,:hsCode,:blClause,:imdgClass,'E0001',now())";
	public static final String getUomList = "select uom as commodity,uom_category_code as imdgClass,uom_description as unNo from uom";
	public static final String GETCommodityCODE = "select * From fn_generate_reference_no('commodity', 'commodity_code', 'CM', '4')";
	public static final String SELECT_COMMODITY_MASTER = null;

}
