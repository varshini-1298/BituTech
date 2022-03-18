package com.bitutech.currencyMaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CurrencyMasterDaoImpl implements CurrencyMasterDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public CurrencyMasterBean save(CurrencyMasterBean bean) throws Exception {
		CurrencyMasterBean currencyMasterBean = new CurrencyMasterBean();
		try {
			Map<String, Object> currencyMasterMap = new HashMap<String, Object>();
		    
		   jdbcTemplate.update(CurrencyMasterQueryUtil.INSERT_CURRENCY_MASTER,currencyMasterMap);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return currencyMasterBean;
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
