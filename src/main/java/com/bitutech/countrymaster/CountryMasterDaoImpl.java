package com.bitutech.countrymaster;

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
public class CountryMasterDaoImpl implements CountryMasterDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public CountryMasterResultBean save(CountryMasterBean bean) throws Exception {
		CountryMasterResultBean resultBean = new CountryMasterResultBean();
		try {
			Map<String, Object> countryMasterMap = new HashMap<String, Object>();
			
			countryMasterMap.put("countryCode", bean.getCountryCode());
			countryMasterMap.put("countryName", bean.getCountryName());
			countryMasterMap.put("currency", bean.getCurrency());
			countryMasterMap.put("clientType", bean.getClientType());
			countryMasterMap.put("isActive", bean.getIsActive());
			namedParameterJdbcTemplate.update(CountryMasterQueryUtil.INSERT_COUNTRY_MASTER,countryMasterMap);
		   resultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
	}

	@Override
	public List<CountryMasterBean> getCountryList() throws Exception {
		List<CountryMasterBean> objCountryMasterBean = new ArrayList<CountryMasterBean>();
		try {
			objCountryMasterBean = jdbcTemplate.query(CountryMasterQueryUtil.getCountryList, new BeanPropertyRowMapper<CountryMasterBean>(CountryMasterBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objCountryMasterBean;
	}

	@Override
	public List<CountryMasterBean> getCurrencyList() throws Exception {
		List<CountryMasterBean> objCountryMasterBean = new ArrayList<CountryMasterBean>();
		try {
			objCountryMasterBean = jdbcTemplate.query(CountryMasterQueryUtil.getCurrencyList, new BeanPropertyRowMapper<CountryMasterBean>(CountryMasterBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objCountryMasterBean;
	}
	@Override
	public CountryMasterResultBean edit(String bean) throws Exception {
		CountryMasterResultBean resultBean = new CountryMasterResultBean();
		resultBean.setSuccess(false);
		try {
			resultBean.setCountryMasterBean(jdbcTemplate.queryForObject(CountryMasterQueryUtil.SELECT_COUNTRY_MASTER,new Object[] { bean }, new BeanPropertyRowMapper<CountryMasterBean>(CountryMasterBean.class)));
			resultBean.setSuccess(true);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return resultBean; 
	}

	@Override
	public CountryMasterResultBean update(CountryMasterBean bean) throws Exception {
		CountryMasterResultBean resultBean = new CountryMasterResultBean();
		try {
            Map<String, Object> countryMasterMap = new HashMap<String, Object>();
			
            countryMasterMap.put("countryCode", bean.getCountryCode());
            countryMasterMap.put("countryName", bean.getCountryName());
            countryMasterMap.put("currency", bean.getCurrency());
			countryMasterMap.put("clientType", bean.getClientType());
			countryMasterMap.put("isActive", bean.getIsActive());
			namedParameterJdbcTemplate.update(CountryMasterQueryUtil.UPDATE_COUNTRY_MASTER,countryMasterMap);

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return resultBean;
	}

	@Override
	public CountryMasterResultBean deleteCountryDtl(String countryCode) throws Exception {
		CountryMasterResultBean resultBean = new CountryMasterResultBean();
		try {
			if (countryCode != null){
				jdbcTemplate.update(CountryMasterQueryUtil.DELETE_COUNTRY, countryCode);
				resultBean.setSuccess(true);
			}
			
		} catch (Exception e) {
			resultBean.setSuccess(false);
			e.printStackTrace();
		}
		return resultBean;
	}

	@Override
	public CountryMasterResultBean getCode(String countryCode) throws Exception {
		CountryMasterResultBean resultBean = new CountryMasterResultBean();
		resultBean.setSuccess(false);
		try {
			resultBean.setCountryMasterBean(jdbcTemplate.queryForObject(CountryMasterQueryUtil.SELECT_COUNTRY_MASTER,new Object[] { countryCode }, new BeanPropertyRowMapper<CountryMasterBean>(CountryMasterBean.class)));
			resultBean.setSuccess(true);
		}
		catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		return resultBean;
	}


}
