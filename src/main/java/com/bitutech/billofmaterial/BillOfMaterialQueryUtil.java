package com.bitutech.billofmaterial;

public class BillOfMaterialQueryUtil {

	public static final String getList = " select workorder_no as workorderNo,created_date as date from bom_hdr";
	
	public static final String Insert_Bom = "INSERT INTO bom_hdr (workorder_no,created_by,created_date) "
			+ " values (:workorderNo,'E0001',now()) ";
	
	public static final String GetWorderNumber = "select * from fn_generate_reference_no('workorder_hdr','workorder_no','WO',3)";
	
	public static final String getSalesOrderNoList = "select sales_order_no as id,sales_order_no as text from sales_order_hdr ";
	
	

}
