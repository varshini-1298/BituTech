package com.bitutech.customerMaster;

public class CustomerMasterQueryUtil {

	public static final String INSERT_CUSTOMER_MASTER = null;
	public static final String getCustomerList = "select customer_code as territory,acct_head_code as name,customer_name as zipCode,cust_short_name as addressOfCus,country_name as organisationName from customer order by customer_code asc";
//	public static final String GETCUSCODE = "SELECT CASE WHEN MAX(customer_code) IS NULL  THEN 'CU0001' ELSE rpad(MAX(customer_code),1,'CU')|| lpad(cast(cast((SUBSTRING(MAX(customer_code),2)) as int)+1  as text),4,'0') END FROM customer";

}
