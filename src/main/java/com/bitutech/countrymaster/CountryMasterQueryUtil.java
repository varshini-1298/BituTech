package com.bitutech.countrymaster;

public class CountryMasterQueryUtil {

	public static final String INSERT_CUSTOMER_MASTER = "INSERT into country (country_code,country_name,currency_code,country_two_code,created_by,created_dt) "
			+ "values (:countryCode,:countryName,:currency,:clientType,'E0001',now())";
	public static final String getCustomerList = "select country_code as countryCode,country_name as countryName,currency_code as currency,country_two_code as clientType  from country";
	public static final String getCurrencyList = "select currency_code as id,currency_name as text from currency";
	
	public static final String UPDATE_CUSTOMER_MASTER ="update country set country_name=:countryName,currency_code=:currency,country_two_code=:clientType where country_code=:countryCode ";
	public static final String SELECT_CUSTOMER_MASTER = "select  country_code as countryCode,country_name as countryName,currency_code as currency,country_two_code as clientType from country where country_code = ? ";
	public static final String DELETE_COUNTRY_DTL =" Delete from country where country_code = ?";
	public static final String SELECT_COUNTRY_MASTER = "select country_code as countryCode, country_name as countryName,currency_code as currency,is_active as isActive from country where country_code=?";

}
