package com.bitutech.countrymaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CountryMasterDaoImpl implements CountryMasterDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public CountryMasterResultBean save(CountryMasterBean bean) throws Exception {
		CountryMasterResultBean resultBean = new CountryMasterResultBean();
		try {
			Map<String, Object> countryMasterMap = new HashMap<String, Object>();
			
			countryMasterMap.put("countryCode", bean.getCountryCode());
			countryMasterMap.put("countryName", bean.getCurrency());
			countryMasterMap.put("currency", bean.getCurrency());
			 
		   jdbcTemplate.update(CountryMasterQueryUtil.INSERT_CUSTOMER_MASTER,countryMasterMap);
		   resultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
	}

	@Override
	public List<CountryMasterBean> getCountryList() throws Exception {
		List<CountryMasterBean> objCustomerMasterBean = new ArrayList<CountryMasterBean>();
		try {
			objCustomerMasterBean = jdbcTemplate.query(CountryMasterQueryUtil.getCustomerList, new BeanPropertyRowMapper<CountryMasterBean>(CountryMasterBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objCustomerMasterBean;
	}


}
