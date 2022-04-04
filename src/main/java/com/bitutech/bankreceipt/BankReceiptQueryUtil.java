package com.bitutech.bankreceipt;

public class BankReceiptQueryUtil {
	
	public static final String INSERT_BANK_RECEIPT = "INSERT into country (country_code,country_name,currency_code,country_two_code,created_by,created_dt) values (:countryCode,:countryName,:currency,:clientType,'E0001',now())";
	public static final String getCurrencyList = "select country_code as countryCode,country_name as countryName,currency_code as currency  from country";
	public static final String getChequeNo = "select currency_code as id,currency_name as text from currency";


}
