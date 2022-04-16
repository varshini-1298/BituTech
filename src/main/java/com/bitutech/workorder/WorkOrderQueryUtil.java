package com.bitutech.workorder;

public class WorkOrderQueryUtil {

	public static final String getWorkOrderList = " select workorder_no as workorderNo,workorder_date as date,sales_order_no as  customerOrderNo from workorder_hdr";
	
	public static final String INSERT_WORKORDER_MASTER = "INSERT INTO workorder_hdr (workorder_no,workorder_date,sales_order_no,created_by,created_date) "
			+ " values (:workorderNo,now(),:customerOrderNo,'E0001',now()) ";
	
	public static final String GetWorderNumber = "select * from fn_generate_reference_no('workorder_hdr','workorder_no','WO',5)";
	
	public static final String getSalesOrderNoList = "select sales_order_no as id,sales_order_no as text from sales_order_hdr ";

	public static final String getUomList = "select uom_id as id,uom as text from uom";
	
	
	

}
