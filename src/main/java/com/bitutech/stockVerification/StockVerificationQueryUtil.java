package com.bitutech.stockVerification;

public class StockVerificationQueryUtil {

	public static final String INSERT_STOCK_VERIFICATION = "INSERT into country (country_code,country_name,currency_code,country_two_code,created_by,created_dt) values (:countryCode,:countryName,:currency,:clientType,'E0001',now())";
	public static final String getStockList = "select country_code as countryCode,country_name as countryName,currency_code as currency  from country";
	public static final String getLocationList = "select currency_code as id,currency_name as text from currency";

}
