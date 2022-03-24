package com.bitutech.purchasequote;

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
public class PurchaseQuoteDaoImpl implements PurchaseQuoteDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public PurchaseQuoteResultBean save(PurchaseQuoteBean bean) throws Exception {
		PurchaseQuoteResultBean resultBean = new PurchaseQuoteResultBean();
		try {
			Map<String, Object> purchaseQuoteMap = new HashMap<String, Object>();
		    
			purchaseQuoteMap.put("unitMeasure", bean.getUnitMeasure());
			purchaseQuoteMap.put("uomCategory", bean.getUomCategory());
			purchaseQuoteMap.put("description", bean.getDescription());;
			
			namedParameterJdbcTemplate.update(PurchaseQuoteQueryUtil.INSERT_PURCHASE_QUOTE,purchaseQuoteMap);
		   resultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
	}

	@Override
	public List<PurchaseQuoteBean> getPurchaseQuoteList() throws Exception {
		List<PurchaseQuoteBean> purchaseQuoteBean = new ArrayList<PurchaseQuoteBean>();
		try {
			purchaseQuoteBean = jdbcTemplate.query(PurchaseQuoteQueryUtil.getPurQuoteList, new BeanPropertyRowMapper<PurchaseQuoteBean>(PurchaseQuoteBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return purchaseQuoteBean;
	}

	@Override
	public List<PurchaseQuoteBean> getUomcateList() throws Exception {
		List<PurchaseQuoteBean> objUomMasterBean = new ArrayList<PurchaseQuoteBean>();
		try {
			objUomMasterBean = jdbcTemplate.query(PurchaseQuoteQueryUtil.getUomcategoryList, new BeanPropertyRowMapper<PurchaseQuoteBean>(PurchaseQuoteBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objUomMasterBean;
	}


}
