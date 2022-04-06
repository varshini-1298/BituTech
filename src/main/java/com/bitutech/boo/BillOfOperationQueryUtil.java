package com.bitutech.boo;

public class BillOfOperationQueryUtil {

	public static final String INSERT_BILL_OF_OPERATION_DETAIL = "INSERT INTO bill_of_operation_detail (boo_id,process_seq_no,process_name,apporox_time)values(?,?,?,?) Returning boo_id as booNo";
	public static final String getBooList = "select boo_id as booNo,process_seq_no as bomRef,process_name as productName,apporox_time as date from bill_of_operation_detail";
	public static final String SELECT_BILL_OF_OPERATION_DETAIL = "select boo_id as booNo,process_seq_no as bomRef,process_name as productName,apporox_time as date from bill_of_operation_detail where boo_id=?";
	public static final String UPDATE_BILL_OF_OPERATION_DETAIL = "update bill_of_operation_detail set process_seq_no=?,process_name=?,apporox_time=? where boo_id=? Returning boo_id as booNo";
	public static final String DELETE_BILL_OF_OPERATION_DETAIL = "delete from bill_of_operation_detail where boo_id=?";

}
