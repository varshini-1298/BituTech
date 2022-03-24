package com.bitutech.purchaserequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bitutech.countrymaster.CountryMasterBean;
import com.bitutech.countrymaster.CountryMasterQueryUtil;

@Repository
public class PurchaseRequestDaoImpl implements PurchaseRequestDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public PurchaseRequestResultBean save(PurchaseRequestBean bean) throws Exception {
		PurchaseRequestResultBean resultBean = new PurchaseRequestResultBean();
		try {
			Map<String, Object> purchaseRequestMap = new HashMap<String, Object>();
		    
			purchaseRequestMap.put("unitMeasure", bean.getUnitMeasure());
			purchaseRequestMap.put("uomCategory", bean.getUomCategory());
			purchaseRequestMap.put("description", bean.getDescription());;
			
			namedParameterJdbcTemplate.update(PurchaseRequestQueryUtil.INSERT_PURCHASE_REQUEST,purchaseRequestMap);
		   resultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
	}

	@Override
	public List<PurchaseRequestBean> getPurchaseRequestList() throws Exception {
		List<PurchaseRequestBean> purchaseRequestBean = new ArrayList<PurchaseRequestBean>();
		try {
			purchaseRequestBean = jdbcTemplate.query(PurchaseRequestQueryUtil.getPurchaseList, new BeanPropertyRowMapper<PurchaseRequestBean>(PurchaseRequestBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return purchaseRequestBean;
	}

	@Override
	public List<PurchaseRequestBean> getUomcateList() throws Exception {
		List<PurchaseRequestBean> objUomMasterBean = new ArrayList<PurchaseRequestBean>();
		try {
			objUomMasterBean = jdbcTemplate.query(PurchaseRequestQueryUtil.getUomcategoryList, new BeanPropertyRowMapper<PurchaseRequestBean>(PurchaseRequestBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objUomMasterBean;
	}


}
