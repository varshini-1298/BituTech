package com.bitutech.workorder;

public class WorkOrderQueryUtil {

	public static final String getWorkOrderList = " select workorder_no as workorderNo,to_char(workorder_date,'DD/MM/YYYY') as workorderDate,sales_order_no as  salesOrderNo from workorder_hdr order by workorder_no desc ";
	
	public static final String INSERT_WORKORDER_HDR = "INSERT INTO workorder_hdr (workorder_no,workorder_date,sales_order_no,created_by,created_on) "
			+ " values (:workorderNo,:workorderDate,:salesOrderNo,'E0001',now()) returning workorder_no as workorderNo";
	
	public static final String GetWorderNumber = "select * from fn_generate_reference_no('workorder_hdr','workorder_no','WO',5)";
	
	public static final String getSalesOrderNoList = "select sales_order_no as id,sales_order_no as text from sales_order_hdr ";

	public static final String getUomList = "select uom_id as id,uom as text from uom";

	public static final String getItemList = "select item_id as id,item_name as text from item";
	
	
	public static final String INSERT_WORKORDER_DTL = "INSERT INTO workorder_dtl (workorder_no,item_id,quantity,uom_id,delivery_date,remarks,created_by,created_on) "
			+ " values (:workorderNo,:itemId,:quantity,:uomId,to_date(:deliveryDate,'DD/MM/YYYY'),:remarks,'E0001',now()) ";

	public static final String DELETE_WORKORDER_DTL = "delete from workorder_dtl WHERE workorder_no = ?";

	public static final String DELETE_BOM_HDR = "delete from bom_hdr WHERE workorder_no = ?";

	public static final String DELETE_BOM_DTL = "delete from bom_dtl WHERE workorder_no = ?";

	public static final String SELECT_WORKORDER_DTL = "select workorder_no as workOrderNo,item_id as itemId,quantity as quantity,uom_id as uomId,delivery_date as deliveryDate,remarks as remarks from workorder_dtl where workorder_no = ?";
	
	public static String SELECT_WORKORDER_HDR = "select workorder_no as workorderNo,workorder_date as workorderDate,sales_order_no as salesOrderNo from workorder_hdr where workorder_no=?";
	
	public static String UPDATE_WORKORDER_HDR = "update workorder_hdr set workorder_date=to_date(?,'DD/MM/YYYY'),sales_order_no=? where workorder_no=? Returning workorder_no as workorderNo";
	
	public static String DELETE_WORKORDER_HDR = "delete from workorder_hdr where workorder_no=?";

}
