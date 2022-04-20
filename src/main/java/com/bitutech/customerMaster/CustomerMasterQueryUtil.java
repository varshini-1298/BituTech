package com.bitutech.customerMaster;

public class CustomerMasterQueryUtil {

	public static final String INSERT_CUSTOMER_MASTER = "Insert into customer (customer_code,customer_name,cust_short_name,address,country_name,cr_limit,email,currency,sales_person,payment_center,city,state,nat_of_business,cr_days,website,key_name,pan_no,pin_code,cust_category,acct_head_code,created_by,created_on) "
			+ " values(:cusCode,:keyName,:shortName,:addressOfCus,:country,:creditLimit,:keymail,:creditUsd,:salesPerson,:paymentCenter,:city,:stp,:business,:creditDays,:cusWebsite,:keyName,:panNumber,:zipCode,'t','CUS001','E0001',now())";
	public static final String getCustomerList = "select customer_code as territory,acct_head_code as name,customer_name as zipCode,cust_short_name as addressOfCus,country_name as organisationName from customer order by customer_code asc";
	public static final String GETCUSCODE = "select * From fn_generate_reference_no('customer', 'customer_code', 'CU', '4')";
	public static final String DELETE_CUSTOMER = "delete from customer where customer_code = ?";
	public static final String SELECT_CUSTOMER_DTL = "select customer_code as cusCode, customer_name as keyName,cust_short_name as shortName,address as addressOfCus,country_name as country,cr_limit as creditLimit,email as keymail,currency as creditUsd,sales_person as salesPerson,payment_center as paymentCenter,city as city,state as stp,nat_of_business as business,cr_days as creditDays,website as cusWebsite,key_name as keyName,pan_no as panNumber,pin_code as zipCode from customer where customer_code = ?";
	public static final String UPDATE_CUSTOMER_MASTER = "update customer set customer_name=:keyName,cust_short_name=:shortName,address =:addressOfCus,country_name=:country,cr_limit=:creditLimit,email=:keymail,currency=:creditUsd,sales_person=:salesPerson,payment_center=:paymentCenter,city=:city,state=:stp,nat_of_business=:business,cr_days=:creditDays,website=:cusWebsite,key_name=:keyName,pan_no=:panNumber,\r\n"
			+ "pin_code=:zipCode  where customer_code=:cusCode";

}
