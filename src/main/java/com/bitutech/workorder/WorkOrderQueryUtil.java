package com.bitutech.workorder;

public class WorkOrderQueryUtil {

	public static final String getWorkOrderList = "select form_code as territory,form_name as name,display_order as zipCode,module_code as addressOfCus,is_parent as organisationName from auth.form";
	public static final String INSERT_WORKORDER_MASTER = null;

}
