package com.bitutech.location;

public class LocationMasterQueryUtil {

	public static final String getCustomerList = "select form_code as territory,form_name as name,display_order as zipCode,module_code as addressOfCus,is_parent as organisationName from auth.form";
	public static final String INSERT_LOCATION_MASTER = " Insert into location (location_id,location_name,parent_location_id,location_category,address_id,location_type,location_incharge,location_activity,is_scrap_location,is_active,is_stock_location,type,is_parent_address,department_id,created_date,modified_by,modified_date)"
	+"values_()";

}
