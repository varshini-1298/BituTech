package com.bitutech.location;

public class LocationMasterQueryUtil {

	//public static final String getCustomerList = "select form_code as territory,form_name as name,display_order as zipCode,module_code as addressOfCus,is_parent as organisationName from auth.form";
	public static final String INSERT_LOCATION_MASTER = " Insert into location (location_id,location_name,parent_location_id,location_category,address_id,location_type,type,location_activity,is_active,location_incharge,is_parent_address,department_id,created_by,created_date)"
	+ " values (:cslLocationCode,:locationName,:cslLocationCode,:portCode,:demDet,:locationType,:country,:region,:active,:carrierName,:rrrBlock,:carrierCode,'E0001',now())";
	
	public static final String getLocationList = "select location_id as cslLocationCode,location_name as  locationName,parent_location_id as cslLocationCode,location_category as portCode,address_id as demDet,location_type as locationType,type as country,location_activity as region,is_active as active,location_incharge as carrierName,is_parent_address as rrrBlock,department_id as carrierCode  from location ";

	public static final String SELECT_LOCATION_MASTER = "select location_id as cslLocationCode,location_name as  locationName,parent_location_id as cslLocationCode,location_category as portCode,address_id as demDet,location_type as locationType,type as country,location_activity as region,is_active as active,location_incharge as carrierName,is_parent_address as rrrBlock,department_id as carrierCode from location where location_id=?";
	public static final String UPDATE_LOCATION_MASTER = "update location set location_id=:cslLocationCode,location_name=:locationName,parent_location_id=:cslLocationCode,location_category=:portCode,address_id=:demDet,location_type=:locationType,type=:country,location_activity=:region,is_active=:active,location_incharge=:carrierName,is_parent_address=:rrrBlock,department_id=:carrierCode where location_id=:cslLocationCode";
	
	public static final String DELETE_PURCHASE_REQUISITION = "delete from purchase_requisition where destination_location=?";
	public static final String DELETE_LOCATION_MASTER =  "delete from location where location_id=?";

}
