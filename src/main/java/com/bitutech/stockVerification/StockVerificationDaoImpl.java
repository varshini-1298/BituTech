package com.bitutech.stockVerification;

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
public class StockVerificationDaoImpl implements StockVerificationDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbc;
	
	@Override
	public StockVerificationResultBean save(StockVerificationBean bean) throws Exception {
		StockVerificationResultBean resultBean = new StockVerificationResultBean();
		try {
			Map<String, Object> stockVerificationMap = new HashMap<String, Object>();
			
			stockVerificationMap.put("stockVerificationNo",bean.getStockVerificationNo());
			stockVerificationMap.put("location",bean.getLocation());
			stockVerificationMap.put("organizationName",bean.getOrganizationName());
		}
		catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		return resultBean;
	}

	@Override
	public List<StockVerificationBean> getStockList() throws Exception {
		List<StockVerificationBean> objStockVerificationBean = new ArrayList<StockVerificationBean>();
		try {
			objStockVerificationBean = jdbcTemplate.query(StockVerificationQueryUtil.getStockList, new BeanPropertyRowMapper<StockVerificationBean>(StockVerificationBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objStockVerificationBean;
	}

	@Override
	public List<StockVerificationBean> getLocationList() throws Exception {
		List<StockVerificationBean> objStockVerificationBean = new ArrayList<StockVerificationBean>();
		try {
			objStockVerificationBean = jdbcTemplate.query(StockVerificationQueryUtil.getLocationList, new BeanPropertyRowMapper<StockVerificationBean>(StockVerificationBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objStockVerificationBean;
	}

}
