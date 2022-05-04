package com.bitutech.commodity;

public class CommodityQueryUtil {

	public static final String INSERT_UOM = "INSERT into commodity (commodity_code,commodity,comm_classification_code,hazardous,unno,flash_point,imdg_code_page,hs_code,bl_clause,imdg_class_code,created_by,created_dt,active) "
			+ " values(:commodityCode,:commodity,:classification,:hazardous,:unNo,:flashPoint,:imdgcodePage,:hsCode,:blClause,:imdgClass,'E0001',now(),:active)";
	//public static final String getUomList = "select uom as commodity,uom_category_code as imdgClass,uom_description as unNo from uom";
	public static final String save_Commodity = "select * From fn_generate_reference_no('commodity', 'commodity_code', 'CM', '4')";
	public static final String SELECT_COMMODITY_MASTER = "select commodity_code as commodityCode,commodity as commodity,comm_classification_code as classification,hazardous as hazardous,unno as unNo,flash_point as flashPoint,imdg_code_page as imdgcodePage, hs_code as hsCode,bl_clause as blClause,imdg_class_code as imdgClass,active as active from commodity where commodity_code = ?";	
	public static final String UPDATE_COMMODITY_MASTER = "update commodity set commodity=:commodity,comm_classification_code=:classification,hazardous=:hazardous,unno=:unNo,flash_point=:flashPoint,imdg_code_page=:imdgcodePage, hs_code=:hsCode,bl_clause=:blClause,imdg_class_code=:imdgClass,active=:active where commodity_code=:commodityCode";
	public static final String DELETE_COMMODITY_MASTER = "delete from commodity where commodity_code = ?";
	public static final String getUomList = "select commodity_code as commodityCode, commodity as commodity,imdg_class_code as imdgClass,unno as unNo,flash_point as flashPoint from commodity";
	public static final String GET_CLASSIFICATION_NAME_LIST = "select comm_classification_code as id,comm_classification_code as text from commodity_classification";
	

}
