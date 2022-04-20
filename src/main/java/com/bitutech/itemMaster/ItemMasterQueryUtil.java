package com.bitutech.itemMaster;

public class ItemMasterQueryUtil {

	public static final String INSERT_ITEM_MASTER = "INSERT into item (item_code,item_name,item_description,item_type,item_category,is_saleable,is_purchasable)values"
	+"(:itemCode,:itemName,:itemDescription,:itemType,:itemCategory,:saleable,:purchaseable)";
	public static final String getItemList = "select  item_id as itemId,item_code as itemCode,item_name as itemName,item_description as itemDescription,item_type as itemType,item_category as itemCategory,is_saleable as saleable,is_purchasable as purchaseable from item";
	public static final String SELECT_ITEM_MASTER = " select item_id as itemId,item_code as itemCode,item_name as itemName,item_description as itemDescription,item_type as itemType,item_category as itemCategory,is_saleable as saleable,is_purchasable as purchaseable from item where item_id=? ";
	public static final String UPDATE_ITEM_MASTER = " update item set item_code=:itemCode,item_name=:itemName,item_description=:itemDescription,item_type=:itemType,item_category=:itemCategory,is_saleable=:saleable,is_purchasable=:purchaseable where item_id=:itemId ";
	public static final String DELETE_ITEM_MASTER = "delete from item where item_id=?";

}
