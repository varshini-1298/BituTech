package com.bitutech.currencyMaster;

public class CurrencyMasterQueryUtil {

	public static final String INSERT_CURRENCY_MASTER = "INSERT into currency (currency_code,currency_name,currency_conver_from,currency_conver_to,currency_fraction,currency_default,is_book_currency,is_actvie,created_by,created_dt) "
			+ " values(:currencyCode,:currencyName,:fromcurrency,:toCurrency,:fractionPart,:defaultValue,:bookCurrency,:isActive,'E0001',now())";
	public static final String getCurrencyList = "select currency_code as currencyCode,currency_name as currencyName from currency";

}
