package com.bitutech.workorder;

public class WorkOrderQueryUtil {

	public static final String getWorkOrderList = " select workorder_no as workorderNo,to_char(workorder_date,'DD/MM/YYYY') as workorderDate,sales_order_no as  salesOrderNo from workorder_hdr";
	
	public static final String INSERT_WORKORDER_HDR = "INSERT INTO workorder_hdr (workorder_no,workorder_date,sales_order_no,created_by,created_on) "
			+ " values (:workorderNo,now(),:salesOrderNo,'E0001',now()) returning workorder_no as workorderNo";
	
	public static final String GetWorderNumber = "select * from fn_generate_reference_no('workorder_hdr','workorder_no','WO',5)";
	
	public static final String getSalesOrderNoList = "select sales_order_no as id,sales_order_no as text from sales_order_hdr ";

	public static final String getUomList = "select uom_id as id,uom as text from uom";

	public static final String getItemList = "select item_id as id,item_name as text from item";
	
	
	public static final String INSERT_WORKORDER_DTL = "INSERT INTO workorder_dtl (workorder_no,item_id,quantity,uom_id,delivery_date,remarks,created_by,created_on) "
			+ " values (:workorderNo,:itemId,:quantity,:uomId,to_date(:deliveryDate,'DD/MM/YYYY'),:remarks,'E0001',now()) ";

}
