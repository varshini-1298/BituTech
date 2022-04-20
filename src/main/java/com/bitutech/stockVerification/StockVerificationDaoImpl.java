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
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public StockVerificationResultBean save(StockVerificationBean bean) throws Exception {
		StockVerificationResultBean resultBean = new StockVerificationResultBean();
		try {
			Map<String, Object> stockVerificationMap = new HashMap<String, Object>();
			
			stockVerificationMap.put("stockVerificationNo",bean.getStockVerificationNo());
			stockVerificationMap.put("location",bean.getLocation());
			stockVerificationMap.put("organizationName",bean.getOrganizationName());
			stockVerificationMap.put("date",bean.getDate());
			stockVerificationMap.put("verifiedBy",bean.getVerifiedBy());
			stockVerificationMap.put("jobTitle",bean.getJobTitle());
			//stockVerificationMap.put("action",bean.isAction());
			//String stock_verification_no = jdbcTemplate.queryForObject(StockVerificationQueryUtil.getStockList, String.class);
			//stockVerificationMap.put("stock_verification_no", stock_verification_no);
			namedParameterJdbcTemplate.update(StockVerificationQueryUtil.INSERT_STOCK_VERIFICATION,stockVerificationMap);
		   resultBean.setSuccess(true);
			
			
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
	@Override
	public StockVerificationResultBean edit(String bean) throws Exception {
		StockVerificationResultBean resultBean = new StockVerificationResultBean();
		resultBean.setSuccess(false);
		try {
			resultBean.setStockVerificationBean(jdbcTemplate.queryForObject(StockVerificationQueryUtil.SELECT_STOCK_VERIFICATION,new Object[] {bean}, new BeanPropertyRowMapper<StockVerificationBean>(StockVerificationBean.class)));
			resultBean.setSuccess(true);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return resultBean; 
	}

	@Override
	public StockVerificationResultBean update(StockVerificationBean bean) throws Exception {
		StockVerificationResultBean resultBean = new StockVerificationResultBean();
		try {
			Map<String, Object> stockVerificationMap = new HashMap<String, Object>();
			stockVerificationMap.put("stockVerificationNo",bean.getStockVerificationNo());
			stockVerificationMap.put("location",bean.getLocation());
			stockVerificationMap.put("organizationName",bean.getOrganizationName());
			stockVerificationMap.put("date",bean.getDate());
			stockVerificationMap.put("verifiedBy",bean.getVerifiedBy());
			stockVerificationMap.put("jobTitle",bean.getJobTitle());
			stockVerificationMap.put("action",bean.isAction());
			namedParameterJdbcTemplate.update(StockVerificationQueryUtil.UPDATE_STOCK_VERIFICATION,stockVerificationMap);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return resultBean;
	}

	@Override
	public StockVerificationResultBean delete(String stockVerificationNo) throws Exception {
		StockVerificationResultBean resultBean = new StockVerificationResultBean();
		try {
			if(stockVerificationNo!=null) {
				jdbcTemplate.update(StockVerificationQueryUtil.DELETE_STOCK_VERIFICATION,stockVerificationNo);
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
