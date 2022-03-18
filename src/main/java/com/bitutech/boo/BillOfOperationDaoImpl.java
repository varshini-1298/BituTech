package com.bitutech.boo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BillOfOperationDaoImpl implements BillOfOperationDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public BillOfOperationBean save(BillOfOperationBean bean) throws Exception {
		BillOfOperationBean booBean = new BillOfOperationBean();
		try {
			Map<String, Object> booMap = new HashMap<String, Object>();
		    
		    
		   jdbcTemplate.update(BillOfOperationQueryUtil.INSERT_BOO_MASTER,booMap);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return booBean;
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


}
