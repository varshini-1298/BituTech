//package com.bitutech.purchaserequest;
//
//public class PurchaseRequestQueryUtil {
//
//	public static final String INSERT_PURCHASE_REQUISITION = "INSERT into purchase_requisition (company_code,requisition_number,request_type,requisition_date,source_location,destination_location,requested_by,pr_request_number,costcenter,created_by,created_date) "
//			+ " values(:company,:requisitionNo,:requestType,to_date(:requestDate,'dd/mm/yyyy'),:sourceLocation,:destinationLocation,:requestedBy,:prReqNo,:costCenter,'E0001',now())";
//	public static final String getPurchaseRequestList = "select request_type as requestType,requisition_date as to_date(:requestDate,'dd/mm/yyyy'), source_location as sourceLocation,destination_location as destinationLocation,requested_by as requestedBy,pr_request_number as prReqNo from purchase_requisition ";
////	public static final String getUomcategoryList = "select uomcategory_code as id,uomcategory_name as text from uom_category";
//	public static final String GETPURCHASEREQUISITIONID =  "select * From fn_generate_reference_no('purchase_requisition','purchase_requisition_id')";
//	public static final String SELECT_PURCHASE_REQUISITION = "select request_type=:requestType,requisition_date=:requestDate, source_location=:sourceLocation,destination_location=:destinationLocation,requested_by=:requestedBy,pr_request_number=:prReqNo  where purchase_requisition_id =purchaseRequisitionId";
//	public static final String UPDATE_PURCHASE_REQUISITION = "update purchase_requisition set request_type=?,source_location=?,destination_location=? where request_type=? Returning request_type as requestType";
//	public static final String DELETE_PURCHASE_REQUISITION = "delete from purchase_requisition where purchase_requisition_id=?";
//    
//}


package com.bitutech.purchaserequest;

public class PurchaseRequestQueryUtil {

	public static final String INSERT_PURCHASE_REQUISITION = "INSERT into purchase_requisition (company_code,requisition_number,request_type,requisition_date,source_location,destination_location,requested_by,pr_request_number,costcenter,created_by,created_date) "
			+ " values(:company,:requisitionNo,:requestType,to_date(:requestDate,'dd/mm/yyyy'),:sourceLocation,:destinationLocation,:requestedBy,:prReqNo,:costCenter,'E0001',now())";
	public static final String getPurchaseRequestList = "select purchase_requisition_id as requisitionId,request_type as requestType,requisition_date as requestDate, source_location as sourceLocation,destination_location as destinationLocation,requested_by as requestedBy,pr_request_number as prReqNo from purchase_requisition  ";
//	public static final String getUomcategoryList = "select uomcategory_code as id,uomcategory_name as text from uom_category";
	public static final String SELECT_PURCHASE_REQUISITION = "select purchase_requisition_id as requisitionId, request_type as requestType,requisition_date as requestDate, source_location as sourceLocation,destination_location as destinationLocation,requested_by as requestedBy,pr_request_number as prReqNo from purchase_requisition where purchase_requisition_id=?";
	public static final String UPDATE_PURCHASE_REQUISITION = "update purchase_requisition set request_type=?,source_location=?,requested_by=?,destination_location=? where purchase_requisition_id=? Returning purchase_requisition_id as requisitionId";
	public static final String DELETE_PURCHASE_REQUISITION = "delete from purchase_requisition where purchase_requisition_id=?";

}
