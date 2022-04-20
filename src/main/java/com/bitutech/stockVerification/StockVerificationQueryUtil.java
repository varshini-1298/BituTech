package com.bitutech.stockVerification;

public class StockVerificationQueryUtil {

	public static final String INSERT_STOCK_VERIFICATION = "INSERT into stock_verification (stock_verification_no,location,date,verified_by,organization_name,job_title) values"
			+ " (:stockVerificationNo,:location,:date,:verifiedBy,:organizationName,:jobTitle)";
	public static final String getStockList = "select  stock_verification_no as stockVerificationNo,location as location,date as date,verified_by as verifiedBy,organization_name as  organizationName,job_title as jobTitle from stock_verification";
	public static final String getLocationList = "select currency_code as id,currency_name as text from currency";
	public static final String UPDATE_STOCK_VERIFICATION = "update stock_verification set stock_verification_no=:stockVerificationNo,location=:location,date=:date,verified_by=:verifiedBy,organization_name=:organizationName,job_title=:jobTitle where stock_verification_no=:stockVerificationNo" ;
	public static final String DELETE_STOCK_VERIFICATION = "delete from stock_verification where stock_verification_no=?";
	public static final String SELECT_STOCK_VERIFICATION = "select stock_verification select  stock_verification_no as stockVerificationNo,location as location,date as date,verified_by as verifiedBy,organization_name as  organizationName,job_title as jobTitle where stock_verification_no=?";

}
