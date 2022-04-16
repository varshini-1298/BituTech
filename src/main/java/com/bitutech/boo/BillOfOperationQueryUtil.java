package com.bitutech.boo;

public class BillOfOperationQueryUtil {

	public static final String INSERT_BILL_OF_OPERATION = "INSERT INTO bill_of_operation (boo_no,bom_ref_no,product_name,opn_date)values(?,?,?,to_date(?,'dd/mm/yyyy')) Returning boo_no as booNo";
	public static final String getBooList = "select boo_no as booNo,bom_ref_no as bomRef,product_name as productName,to_char(opn_date,'DD/MM/YYYY') as date,id as idNo from bill_of_operation";
	public static final String SELECT_BILL_OF_OPERATION = "select id as idNo,boo_no as booNo,bom_ref_no as bomRef,product_name as productName,opn_date as date from bill_of_operation where id=?";
	public static final String UPDATE_BILL_OF_OPERATION = "update bill_of_operation set boo_no=?, bom_ref_no=?,product_name=?,opn_date= to_date(?,'YYYY/DD/MM') where id=? Returning boo_no as booNo";
	public static final String DELETE_BILL_OF_OPERATION = "delete from bill_of_operation where id=?";

}
		