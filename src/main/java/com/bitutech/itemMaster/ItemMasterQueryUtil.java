package com.bitutech.itemMaster;

public class ItemMasterQueryUtil {
//insert
	public static final String INSERT_ITEM_MASTER = "INSERT into item (item_code,item_name,item_description,item_type,item_category,is_saleable,is_purchasable,purchase_method,uom,is_requestable,min_qty,max_qty,reorder_level,costing_method,cost_price,warranty,created_date,supply_lead_time,inventory_valuation,issue_method"
			+ ")values"+"(:itemCode,:itemName,:itemDescription,:itemType,:itemCategory,:saleable,:purchaseable,:purchaseMethod,:pruchaseUom,:purchaseReq,:minimumQty,:maximumQty,:reorderLevel,:costingMethod,:costPrice,:warranty,now(),:leadTime,:inventoryValuation,:issueMethod)  RETURNING item_id as itemId";
	public static final String INSERT_ITEM_MASTER_VENDOR_DTL =  "INSERT into item_vendor(vendor_item_code,vendor_item_name,vendor_min_qty,vendor_uom,pricing_type,item_id,delivery_lead_time"
			+ ")values"+"(:vendorItemCode,:vendorItemName,:vendorminimumQty,:vendorUom,:pricingType,:itemId,:deliveryLeadTime)";
	public static final String INSERT_ITEM_MASTER_GRN_ATTRIBUTE = "INSERT into item_grn_attribute(item_id,batch_no,mrp,expiry_date,manufacture_details,created_date " + ")values"+"(:itemId,:batchNo,:mrp,:expiryDate,:manufactureDetails,now())";
//list
	public static String getItemIdList = "select item_id as id,item_id as text from item ";

	public static final String getItemList = "select  item_id as itemId,item_code as itemCode,item_name as itemName,item_description as itemDescription,item_type as itemType,item_category as itemCategory,is_saleable as saleable,is_purchasable as purchaseable,purchase_method as purchaseMethod,uom as pruchaseUom,is_requestable as purchaseReq,min_qty as minimumQty,max_qty as maximumQty,reorder_level as reorderLevel,costing_method as costingMethod,cost_price as costPrice,warranty as warranty,supply_lead_time as leadTime,inventory_valuation as inventoryValuation,issue_method as issueMethod from item";
//edit & update
	public static final String SELECT_ITEM_MASTER = " select  ig.item_id as itemId,ig.batch_no as batchNo,ig.mrp as mrp,ig.expiry_date as expiryDate,ig.manufacture_details as manufactureDetails ,it.item_code as itemCode,it.item_name as itemName,\n"
			+ "it.item_description as itemDescription,it.item_type as itemType,it.item_category as itemCategory,\n"
			+ "it.is_saleable as saleable,it.is_purchasable as purchaseable,it.purchase_method as purchaseMethod,it.uom as pruchaseUom,\n"
			+ "it.is_requestable as purchaseReq,it.min_qty as minimumQty,it.max_qty as maximumQty,it.reorder_level as reorderLevel,\n"
			+ "it.costing_method as costingMethod,it.cost_price as costPrice,it.warranty as warranty,it.supply_lead_time as leadTime,it.inventory_valuation as inventoryValuation,it.issue_method as issueMethod \n"
			+ "from item_grn_attribute ig left join item it on ig.item_id = it.item_id\n"
			+ "where it.item_id =?  ";
	public static final String UPDATE_ITEM_MASTER = " update item set item_code=:itemCode,item_name=:itemName,item_description=:itemDescription,item_type=:itemType,item_category=:itemCategory,is_saleable=:saleable,is_purchasable=:purchaseable,purchase_method=:purchaseMethod,uom=:pruchaseUom,is_requestable=:purchaseReq,min_qty=:minimumQty,max_qty=:maximumQty,reorder_level=:reorderLevel,costing_method=:costingMethod,cost_price=:costPrice,warranty=:warranty,supply_lead_time=:leadTime ,inventory_valuation=:inventoryValuation,issue_method=:issueMethod where item_id=:itemId ";
	
	public static final String SELECT_ITEM_MASTER_VENDOR = " select vendor_item_name as vendorItemName,vendor_item_code as vendorItemCode,vendor_min_qty as vendorminimumQty,vendor_uom as vendorUom,delivery_lead_time as deliveryLeadTime,pricing_type as pricingType from ITEM_VENDOR where item_id=? ";
	public static final String UPDATE_ITEM_MASTER_VENDOR = " update ITEM_VENDOR set vendor_item_name=:vendorItemName,vendor_item_code=:vendorItemCode,vendor_min_qty=:vendorminimumQty,vendor_uom=:vendorUom,delivery_lead_time=:deliveryLeadTime,pricing_type=:pricingType where item_id=:itemId ";

	public static final String UPDATE_ITEM_MASTER_GRN_ATTRIBUTE = "update item_grn_attribute set batch_no=:batchNo,mrp=:mrp,expiry_date=:expiryDate,manufacture_details=:manufactureDetails where item_id=:itemId ";

//delete
	public static final String DELETE_PURCHASE_REQUISITION_DETAIL =  "delete from purchase_requisition_detail where item_id=?";
	public static final String DELETE_ITEM_MASTER_GRN_ATTRIBUTE =  "delete from item_grn_attribute where item_id=?";
	public static final String DELETE_ITEM_PROPERTY =  "delete from item_property where item_id=?";
	public static final String DELETE_ITEM_MASTER_VENDOR =  "delete from ITEM_VENDOR where item_id=?";
	
	public static final String DELETE_ITEM_MASTER = "delete from item where item_id=?";
	public static final String DELETE_SALES_ORDER_DTL =  "delete from sales_order_dtl where item_id=?";
	
	

	


	

	

	

	


	

}
