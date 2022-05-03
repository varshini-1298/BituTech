package com.bitutech.itemcategory;

public class ItemCategoryQueryUtil {

	public static final String INSERT_ITEM_CATEGORY_hdr = "INSERT into item_category (category_name,category_type,parent_category_id,quality_check,created_by,created_date) "
			+ " values(:categoryName,:categoryType,:parentCategory,:incomingQty,'E0001',now())  RETURNING item_category_id as catagoryId";
	
	public static final String getItemCategoryList = "select it.item_category_id as itemCategoryId,it.category_name as categoryName,dt.value as categoryTypeName,t.parentTypeName from item_category it inner join def_table dt on dt.def_table_id = it.category_type left join (select item_category_id as itemCategoryId,category_name as parentTypeName from item_category  where item_category_id in (select parent_category_id from item_category where parent_category_id is not null)) as t on  it.parent_category_id = t.itemCategoryId order by it.item_category_id desc";
	
	public static final String getUomcategoryList = "select uomcategory_code as id,uomcategory_name as text from uom_category";
	
	public static final String INSERT_CATAGORY_ACC = "INSERT into item_category_account (item_category_id,purchase_tax,sales_tax,income_account,expense_account,accu_dep_account) "
			+ " values(:catagoryId,:purchaseTaxes,:salesTaxes,:assetAccount,:deptAccount,:AccuDept)";
	
	public static final String INSERT_CATAGORY_PROP = "INSERT into item_property (item_id,dynamic_attribute_id) "
			+ "  values(:catagoryId,:propertyType) ";
	
	public static final String INSERT_CATAGORY_GRN = "-Insert into grn_attribute (item_category_id ,batch_no,mrp,expiry_date,manufacture_details) values (:catagoryId,:batchNO,:mrp,:expiryDate,:manufactureDetails)";
	
	public static final String SELECT_PROPERTY_TYPE = "select dy.dynamic_attribute_id as itemPropertyId,dt.value as text,def.value as typeName,dy.attribute_name as propertyName,dy.attribute_value as value,dy.attribute_defualt_value as defaultValue,dy.is_mandatory as active from dynamic_attribute dy left join def_table dt on dt.def_table_id = dy.attribute_data_type left join def_table def on def.def_table_id = dy.attribute_type where dt.def_table_id = ? order by dynamic_attribute_id desc";
	
	public static final String CATEGORY_TYPE_LIST = "SELECT def_table_id as categoryTypeId,value as categoryTypeName from def_table WHERE is_active=true and form_field_id = 6 and is_active='true' ";
	
	public static final String sDeleteItemCategoryAccount = "delete from item_category_account where item_category_id =?";
	
	public static final String sDeleteItemCategoryProperty = "delete from item_property where item_id =?";
	
	public static final String sDeletegrnAttribute = "Delete from item_grn_attribute where item_id =?";
	
	public static final String sDeleteItemCategory = "delete from item_category where item_category_id =?";

	public static final String SELECT_CATEGORY_EDIT = "select ic.item_category_id as itemCategoryId,ic.category_name as categoryName,COALESCE(ic.parent_category_id,0) as parentCategory,ic.quality_check as incomingQty ,ia.item_category_account_id as itemCategoryAccountId,ia.item_category_id as itemCategoryId,ia.purchase_tax as purchaseTaxes,ia.sales_tax as salesTaxes,ia.income_account as assetAccount,ia.expense_account as deptAccount,ia.accu_dep_account as AccuDeptfrom,ig.batch_no as batchNO,ig.mrp as mrp,ig.expiry_date as expiryDate,ig.manufacture_details as manufactureDetails,grn_attribute_id as grnAttributeId,dt.def_table_id as categoryTypeId ,dt.value as categoryTypeName  from item_category ic left join item_category_account  ia on ia.item_category_id  = ic.item_category_id  left join item_grn_attribute ig on ig.item_id = ic.item_category_id left join def_table dt on dt.def_table_id = ic.category_type\r\n"
			+ "where ic.item_category_id = ?";

	public static final String UPDATE_ITEM_CATEGORY_hdr = "update item_category set category_name=:categoryName,category_type=:categoryType,parent_category_id=:parentCategory,quality_check=:incomingQty,modified_by='E0001',modified_date=now() where item_category_id=:itemCategoryId";

	public static final String UPDATE_CATAGORY_ACC = "update item_category_account set purchase_tax=:purchaseTaxes,sales_tax=:salesTaxes,income_account=:assetAccount,expense_account=:deptAccount,accu_dep_account=:AccuDept where item_category_id=:itemCategoryId";

	public static final String UPDATE_CATAGORY_PROP = "update item_property set dynamic_attribute_id=:propertyType,modified_by='E0001',modified_date=now() where item_id=:itemCategoryId";

	public static final String UPDATE_CATAGORY_GRN = "update item_grn_attribute set batch_no=:batchNO,mrp=:mrp,expiry_date=:expiryDate,manufacture_details=:manufactureDetails,modified_by='E0001',modified_date=now() where item_id=:itemCategoryId ";
	
 
}
