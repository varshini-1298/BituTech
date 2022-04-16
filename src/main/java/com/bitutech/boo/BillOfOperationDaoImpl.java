package com.bitutech.boo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class BillOfOperationDaoImpl implements BillOfOperationDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	// save
	@Override
	public BillOfOperationResultBean save(BillOfOperationBean Bean) throws Exception {
		BillOfOperationResultBean resultBean = new BillOfOperationResultBean();
		try {
			   
jdbcTemplate.queryForObject(BillOfOperationQueryUtil.INSERT_BILL_OF_OPERATION,new BeanPropertyRowMapper<BillOfOperationBean>(BillOfOperationBean.class), new Object[]
		{ Bean.getBooNo(),Bean.getBomRef(),Bean.getProductName(),Bean.getDate()});
	
resultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
	}

	@Override
	public List<BillOfOperationBean> getBooList() throws Exception {
		List<BillOfOperationBean> objCustomerMasterBean = new ArrayList<BillOfOperationBean>();
		try {
			objCustomerMasterBean = jdbcTemplate.query(BillOfOperationQueryUtil.getBooList, new BeanPropertyRowMapper<BillOfOperationBean>(BillOfOperationBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objCustomerMasterBean;
	}

	//edit
	@Override
	public BillOfOperationResultBean edit(Integer bean) throws Exception {
		BillOfOperationResultBean resultBean = new BillOfOperationResultBean();
		resultBean.setSuccess(false);
		try {
			resultBean.setBillOfOperationBean(jdbcTemplate.queryForObject(BillOfOperationQueryUtil.SELECT_BILL_OF_OPERATION,new Object[] { bean }, new BeanPropertyRowMapper<BillOfOperationBean>(BillOfOperationBean.class)));
			resultBean.setSuccess(true);
		}
		catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		return resultBean;
	}

	//update
	@Override
	public BillOfOperationResultBean update(BillOfOperationBean Bean) throws Exception {
		BillOfOperationResultBean resultBean = new BillOfOperationResultBean();
		try {
		
			jdbcTemplate.queryForObject(BillOfOperationQueryUtil.UPDATE_BILL_OF_OPERATION,new BeanPropertyRowMapper<BillOfOperationBean>(BillOfOperationBean.class), new Object[]
					{Bean.getBooNo(), Bean.getBomRef(),Bean.getProductName(),Bean.getDate(),Bean.getIdNo()});
				
			resultBean.setSuccess(true);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return resultBean;
	}

	//delete
	@Override
	public BillOfOperationResultBean delete(Integer idNo) throws Exception {
		BillOfOperationResultBean resultBean = new BillOfOperationResultBean();
		try {
			if(idNo!=null) {
				jdbcTemplate.update(BillOfOperationQueryUtil.DELETE_BILL_OF_OPERATION,idNo);
			}
			resultBean.setSuccess(true);
		}
		catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}	
		return resultBean;	
		}


}
