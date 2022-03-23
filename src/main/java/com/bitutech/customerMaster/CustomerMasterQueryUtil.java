package com.bitutech.customerMaster;

public class CustomerMasterQueryUtil {

	public static final String INSERT_CUSTOMER_MASTER = null;
	public static final String getCustomerList = "select customer_code as territory,acct_head_code as name,customer_name as zipCode,cust_short_name as addressOfCus,country_name as organisationName from customer order by customer_code asc";
	public static final String GETCUSCODE = "select * From fn_generate_reference_no('customer', 'customer_code', 'CU', '4')";

}
