package com.bitutech.customerMaster;

public class CustomerMasterQueryUtil {

	public static final String INSERT_CUSTOMER_MASTER = "Insert into customer (customer_code,customer_name,cust_short_name,address,country_name,cr_limit,email,currency,sales_person,payment_center,city,state,nat_of_business,cr_days,website,key_name,pan_no,pin_code,cust_category,acct_head_code,created_by,created_on) "
			+ " values(:cusCode,:keyName,:shortName,:addressOfCus,:country,:creditLimit,:keymail,:creditUsd,:salesPerson,:paymentCenter,:city,:stp,:business,:creditDays,:cusWebsite,:keyName,:panNumber,:zipCode,'t','cus001','E0001',now())";
	public static final String getCustomerList = "select customer_code as territory,acct_head_code as name,customer_name as zipCode,cust_short_name as addressOfCus,country_name as organisationName from customer order by customer_code asc";
	public static final String GETCUSCODE = "select * From fn_generate_reference_no('customer', 'customer_code', 'CU', '4')";

}
