package com.bitutech.salescallentry;

public class SalesEntryMasterQueryUtil {

	
	public static final String INSERT_SALESENTRY_HDR = "Insert into salescall_hdr (customer,customer_type,sales_call_number,type_of_call,person_met,assign_to,email_id,mode_of_contact,designation,visit_date,created_by,created_date)"
			+ " values (:customer,:customerType,:typeOfCall,:typeOfCall,:personMet,:assignTo,:emailId,:modeOfContact,:designation,to_date(:visitDate,'DD/MM/YYYY'),'E0001',now())";
	
	public static final String getList = "select customer_type as customerType, salescall_hdr_id as salesCallHdrId, customer as customer,type_of_call as typeOfCall, assign_to as assignTo, person_met as personMet, to_char(created_date,'DD/MM/YYYY') as visitDate from salescall_hdr";
//	public static final String GETSALESCALLHDRID = "select * from fn_generate_reference_no('salescall_hdr','salescall_hdr_id','SALESCALL','4')";
	public static final String SELECT_SALESENTRY_HDR = "select customer_type as customerType, salescall_hdr_id as salesCallHdrId, customer as customer,type_of_call as typeOfCall,email_id as emailID,mode_of_contact as modeOfContact,designation as designation, assign_to as assignTo, person_met as personMet, to_char(visit_date,'DD/MM/YYYY') as visitDate from salescall_hdr where salescall_hdr_id=? ";
	public static final String UPDATE_SALESENTRY_HDR = "update salescall_hdr set customer_type=:customerType, salescall_hdr_id=:salesCallHdrId, customer=:customer,type_of_call=:typeOfCall,email_id=:emailId,mode_of_contact=:modeOfContact,designation=:designation, assign_to=:assignTo, person_met=:personMet where salescall_hdr_id=:salesCallHdrId";
	public static final String DELETE_SALESENTRY_HDR = "delete from salescall_hdr where salescall_hdr_id=?";


	

}
