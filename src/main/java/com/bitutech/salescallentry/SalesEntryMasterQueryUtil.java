package com.bitutech.salescallentry;

public class SalesEntryMasterQueryUtil {

	public static final String INSERT_SALESENTRY_HDR = "Insert into salescall_hdr (customer,customer_type,sales_call_number,type_of_call,person_met,assign_to,email_id,mode_of_contact,designation,visit_date,created_by,created_date)"
			+ " values (:customer,:customerType,:typeOfCall,:typeOfCall,:personMet,:assignTo,:emailId,:modeOfContact,:designation,to_date(:visitDate,'MM/DD/YYYY'),'E0001',now())";
	
	public static final String getList = "select customer_type customerType, customer as customer, assign_to assignTo, person_met personMet, to_char(created_date,'DD/MM/YYYY') visitDate from salescall_hdr";
	
	

}
