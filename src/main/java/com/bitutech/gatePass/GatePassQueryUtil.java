package com.bitutech.gatePass;

public class GatePassQueryUtil {

	public static final String INSERT_GATE_PASS = "INSERT into country (country_code,country_name,currency_code,country_two_code,created_by,created_dt) values (:countryCode,:countryName,:currency,:clientType,'E0001',now())";
	public static final String getOrganizationList = "select country_code as countryCode,country_name as countryName,currency_code as currency  from country";
	public static final String getLocationList = "select currency_code as id,currency_name as text from currency";

}
