package com.bitutech.itemproperties;

public class ItemPropertiesQueryUtil {

	public static final String INSERT_DYNAMIC_ATTRIBUTE = "INSERT INTO dynamic_attribute (attribute_data_type,attribute_type,attribute_name,atttribute_length,attribute_value,attribute_defualt_value) values (:propertyType,:type,:propertyName,:length,:value,:defaultValue)";
	public static final String getItemPropList = "select attribute_type as type,attribute_name as propertyName,attribute_value as value from dynamic_attribute";
	public static final String UPDATE_DYNAMIC_ATTRIBUTE= "update dynamic_attribute set attribute_type=:type,attribute_name=:propertyName,attribute_value=:value where attribute_type=:type";
	public static final String DELETE_DYNAMIC_ATTRIBUTE = "delete from dynamic_attribute where attribute_type=?";
	public static final String SELECT_DYNAMIC_ATTRIBUTE = "select attribute_type as type,attribute_name as propertyName,attribute_value as value from dynamic_attribute where attribute_type=?";

}
