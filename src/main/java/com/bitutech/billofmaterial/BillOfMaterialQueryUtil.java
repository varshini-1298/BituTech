package com.bitutech.billofmaterial;

public class BillOfMaterialQueryUtil {

	public static final String getList = " select workorder_no as workorderNo,to_char(created_date,'DD/MM/YYYY') as date,bom_no as bomNo from bom_hdr";
	
	public static final String Insert_Bom_Hdr = "INSERT INTO bom_hdr (bom_no,workorder_no,created_by,created_date) "
			+ " values (:bomNo,:workorderNo,'E0001',now()) returning bom_no as bomNo ";
	
	public static final String GetWorderNumber = "select * from fn_generate_reference_no('bom_hdr','bom_no','BOM',4)";
	
	public static final String getWorkOrderList = "select workorder_no as id,workorder_no as text from workorder_hdr ";
	
	public static final String Insert_Bom_Dtl = "INSERT INTO bom_dtl (bom_no,item_id,uom,quantity,created_by,created_on) "
			+ " values (:bomNo,:itemId,:uom,:quantity,:createdBy,now()) ";
	

}
