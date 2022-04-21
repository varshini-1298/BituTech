package com.bitutech.salesorder;

public class SalesOrderQueryUtil {

	public static final String INSERT_SALES_ORDER_HDR= "INSERT into sales_order_hdr (customer_code,terms_n_conditions,currency,exp_date_of_delivery,created_by,created_dt,sales_order_no,sales_quote_no,modified_by) "
			+ " values(:customer,:text,:currency,to_date(:deliveryDate,'YYYY-MM-DD'),'E0001',now(),:countValue,'S0002',:modifiedBy)";
	public static final String GETCOUNT = "select * From fn_generate_reference_no('sales_order_hdr', 'sales_order_no','S','4')";
	public static final String getSalesOrderList = "select customer_code as customer,terms_n_conditions as text,currency as currency,to_char(exp_date_of_delivery,'YYYY-MM-DD') as deliveryDate,sales_order_no as countValue from sales_order_hdr";
//	public static final String getUomcategoryList = "select uomcategory_code as id,uomcategory_name as text from uom_category";
	public static final String SELECT_SALES_ORDER_HDR = "select customer_code as customer, terms_n_conditions as text,currency as currency, to_char(exp_date_of_delivery,'YYYY-MM-DD') as deliveryDate from sales_order_hdr where sales_order_no=?";
	public static final String UPDATE_SALES_ORDER_HDR = "update sales_order_hdr set customer_code=?, terms_n_conditions=?,currency=?,exp_date_of_delivery=to_date(?,'YYYY-MM-DD') where sales_order_no=? Returning sales_order_no as countValue";
	public static final String DELETE_SALES_ORDER_HDR = "delete from sales_order_hdr where sales_order_no = ?";

}
