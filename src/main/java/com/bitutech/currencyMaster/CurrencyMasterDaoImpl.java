package com.bitutech.currencyMaster;

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
public class CurrencyMasterDaoImpl implements CurrencyMasterDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public CurrencyMasterResultBean save(CurrencyMasterBean bean) throws Exception {
		CurrencyMasterResultBean resultBean = new CurrencyMasterResultBean();
		try {
			Map<String, Object> currencyMasterMap = new HashMap<String, Object>();
			
			currencyMasterMap.put("currencyCode", bean.getCurrencyCode());
			currencyMasterMap.put("currencyName", bean.getCurrencyName());
			currencyMasterMap.put("fromcurrency", bean.getFromcurrency());
			currencyMasterMap.put("toCurrency", bean.getToCurrency());
			currencyMasterMap.put("defaultValue", bean.getDefaultValue());
			currencyMasterMap.put("fractionPart", bean.getFractionPart());
			currencyMasterMap.put("isActive", bean.getIsActive());
			currencyMasterMap.put("bookCurrency", bean.getBookCurrency());
		    
			namedParameterJdbcTemplate.update(CurrencyMasterQueryUtil.INSERT_CURRENCY_MASTER,currencyMasterMap);
		   resultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
	}

	@Override
	public List<CurrencyMasterBean> getCurrencyList() throws Exception {
		List<CurrencyMasterBean> objCustomerMasterBean = new ArrayList<CurrencyMasterBean>();
		try {
			objCustomerMasterBean = jdbcTemplate.query(CurrencyMasterQueryUtil.getCurrencyList, new BeanPropertyRowMapper<CurrencyMasterBean>(CurrencyMasterBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objCustomerMasterBean;
	}


}
