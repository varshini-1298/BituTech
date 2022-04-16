package com.bitutech.inventory.deliveryorder;

public class DeliveryOrderQueryUtil {

	public String getDeliveyOrderList = "select * from vw_get_delivery_order_hdr(?)";
	
	public String getDeliveryOrderDtlList = "select item_id as itemId, item_qty as itemQty, gin_detail_id as ginDtlId from delivery_order_detail  where delivery_order_number = ?";
	
	public String saveOrUpdateDO(String action, DeliveryOrder bean) {
		String query = "select * from sp_upd_delivery_order('"+action+"', '"+bean.getDeliveryNo()+"', '"+bean.getDeliveryDate()+"', '"+bean.getCustomerCode()+"', '"+bean.getCompanyCode()+"',"
				+bean.getGinId()+", "+bean.getSourceLocationid()+", "+bean.getDestinationLocationid()+", "+bean.getPurposeOfDO()+", '"+bean.getPersonIncharge()+"', '"+bean.getRemarks()+"', '"+bean.getUserId()+"')";
		return query;
	}
	
	public String saveOrUpdateDODtl(String action, String dono, String itemstr, String userId) {
		String query = "select * from sp_upd_delivery_order_dtl('"+action+"', '"+dono+"', '"+itemstr+"', '"+userId+"')";
		return query;
	}
	
	public String deleteDeliveryOrderDtl = "delete from delivery_order_detail where delivery_order_number=?";
	
	public String deleteDeliveryOrder = "delete from delivery_order where delivery_order_number=?";
	
	public String getCompanyList = "select * From vw_get_company_for_dd()";
	
	public String getCustomerList = "select * From vw_get_customer_for_dd()";
	
	public String getLocationList = "select * From vw_get_location_for_dd()";
	
	public String getItemList = "select * From vw_get_item_for_dd()";
		
}

