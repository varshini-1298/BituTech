package com.bitutech.itemproperties;

public class ItemPropertiesQueryUtil {

	public static final String INSERT_DYNAMIC_ATTRIBUTE = "INSERT INTO dynamic_attribute (attribute_data_type,attribute_type,attribute_name,atttribute_length,attribute_value,attribute_defualt_value,is_mandatory,created_by,created_date) values (:propertyType,:type,:propertyName,:length,:value,:defaultValue,:active,'E0001',now())";
	public static final String getItemPropList = "select dy.dynamic_attribute_id as itemPropertyId,dt.value as text,def.value as typeName,dy.attribute_name as propertyName,dy.attribute_value as value,dy.attribute_defualt_value as defaultValue,dy.is_mandatory as active from dynamic_attribute dy left join def_table dt on dt.def_table_id = dy.attribute_data_type left join def_table def on def.def_table_id = dy.attribute_type order by dynamic_attribute_id desc";
	public static final String UPDATE_DYNAMIC_ATTRIBUTE= "update dynamic_attribute set attribute_type=:type,attribute_name=:propertyName,attribute_value=:value,atttribute_length=:length,is_mandatory=:active,attribute_defualt_value=:defaultValue where dynamic_attribute_id=:itemPropertyId";
	public static final String DELETE_DYNAMIC_ATTRIBUTE = "delete from dynamic_attribute where dynamic_attribute_id=?";
	public static final String SELECT_DYNAMIC_ATTRIBUTE = "select dy.dynamic_attribute_id as itemPropertyId,dy.attribute_data_type as propertyType,dy.attribute_type as type,dy.atttribute_length as length,dy.attribute_name as propertyName,dy.attribute_value as value,dy.attribute_defualt_value as defaultValue,case when dy.is_mandatory=true then 'Y' else 'N' end as active from dynamic_attribute dy where dy.dynamic_attribute_id= ?";
	public static final String getPropertyList = "select def_table_id as id,value as text from def_table where form_field_id = 38 and is_active=true";
	public static final String getTypeList = "select def_table_id as typeId,value as typeName from def_table where form_field_id = 53 and is_active=true";

}
