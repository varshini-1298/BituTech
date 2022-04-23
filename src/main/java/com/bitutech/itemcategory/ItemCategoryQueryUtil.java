package com.bitutech.itemcategory;

public class ItemCategoryQueryUtil {

	public static final String INSERT_ITEM_CATEGORY_hdr = "INSERT into item_category (category_name,category_type,parent_category_id,quality_check,created_by,created_date) "
			+ " values(:categoryName,:categoryType,:parentCategory,:incomingQty,'E0001',now())  RETURNING item_category_id as catagoryId";
	public static final String getItemCategoryList = "select uom as unitMeasure,uom_category_code as uomCategory,uom_description as description from uom";
	public static final String getUomcategoryList = "select uomcategory_code as id,uomcategory_name as text from uom_category";
	public static final String INSERT_CATAGORY_ACC = "INSERT into item_category_account (item_category_id,purchase_tax,sales_tax,income_account,expense_account,accu_dep_account) "
			+ " values(:catagoryId,:purchaseTaxes,:salesTaxes,:assetAccount,:deptAccount,:AccuDept)";
	public static final String INSERT_CATAGORY_PROP = "INSERT into item_property (item_id,propertyType,length,isMandantory) "
			+ "  values(:catagoryId,:propertyName,:propertyType,:length,:isMandantory,) ";
	public static final String INSERT_CATAGORY_GRN = "Insert into item_grn_attribute (item_id ,batch_no,mrp,expiry_date,manufacture_details) values (:catagoryId,:batchNO,:mrp,:expiryDate,:manufactureDetails)";
	public static final String SELECT_PROPERTY_TYPE = "select dy.dynamic_attribute_id as itemPropertyId,dt.value as text,def.value as typeName,dy.attribute_name as propertyName,dy.attribute_value as value,dy.attribute_defualt_value as defaultValue,dy.is_mandatory as active from dynamic_attribute dy left join def_table dt on dt.def_table_id = dy.attribute_data_type left join def_table def on def.def_table_id = dy.attribute_type where dt.def_table_id = ? order by dynamic_attribute_id desc";
	

}
